package controller;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.piece.Piece;
import domain.piece.Team;
import domain.position.Position;
import exception.InvalidCommandException;
import exception.InvalidPositionException;
import exception.MoveCommandException;
import org.eclipse.jetty.server.Authentication;
import view.Input;
import view.Output;
import view.UserCommand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ChessController {
    private final List<String> commandCandidates = Arrays.asList("start", "end", "status", "move");
    private Board board;

    public ChessController() {
        HashMap<Position, Piece> initBoard = BoardFactory.createBoard();
        board = new Board(initBoard);
    }

    public void run() {
        Output.initMessage();

        CommandType command;
        while ((command = isValidCommand(getCommand())).isNotEnd()) {
            command.execute(board);

            if (board.isFinished()) {
                break;
            }
        }
        Command.end();
    }

    private CommandType getCommand() {
        Input.getUserInput();
        return CommandType.findSymbol(Input.userInputArray[0]);
    }

    private CommandType isValidCommand(CommandType command) {
        try {
            if (command.isNotUnknown()) {
                if (command.isMove()) {
                    checkMoveCommandValidation();
                }
            }
        } catch (InvalidCommandException | MoveCommandException | InvalidPositionException e) {
            System.out.println(e.getMessage());
            return isValidCommand(getCommand());
        }
        return command;
    }

    private void checkMoveCommandValidation() {
        if (Input.userInputArray.length != 3) {
            throw new MoveCommandException();
        }

        String source = Input.userInputArray[1];
        String target = Input.userInputArray[2];
        if (!isValidPosition(source) || !isValidPosition(target)) {
            throw new InvalidPositionException();
        }
    }

    private boolean isValidPosition(String position) {
        return position.length() == 2 && Position.checkValidatePosition(position);
    }
}
