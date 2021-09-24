package controller.command;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.piece.Piece;
import domain.position.Position;
import exception.InvalidCommandException;
import exception.InvalidPositionException;
import exception.MoveCommandException;
import view.Input;
import view.Output;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ChessController2 {
    private Board board;

    public ChessController2() {
        HashMap<Position, Piece> initBoard = BoardFactory.createBoard();
        board = new Board(initBoard);
    }

    public void run() {
        Output.initMessage();

        CommandType2 command;
        while ((command = isValidCommand(getCommand())).isNotEnd()) {
            command.execute(board);
            if (board.isFinished()) {
                break;
            }
        }
        Output.endMessage();
    }

    private CommandType2 getCommand() {
        Input.getUserInput();
        return CommandType2.findSymbol(Input.userInputArray[0]);
    }

    private CommandType2 isValidCommand(CommandType2 command) {
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
