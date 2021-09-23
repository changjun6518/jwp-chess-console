package controller;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.piece.Team;
import domain.position.Position;
import org.eclipse.jetty.server.Authentication;
import view.Input;
import view.Output;
import view.UserCommand;

import java.util.Arrays;
import java.util.List;

public class ChessController {
    private final List<String> commandCandidates = Arrays.asList("start", "end", "status", "move");
    private Board board;

    public ChessController(Board board) {
        this.board = board;
    }

    public void run() {
        Output.initMessage();


        while (true) {
            Input.getUserInput();
            if (!isValidCommand()) {
                continue;
            }
            CommandType command = CommandType.findSymbol(Input.userInputArray[0]);
            command.execute(board);

            if (board.isFinished()) {
                break;
            }
        }
        Command.end();
    }

    private boolean isValidCommand() {
        if (isMoveCommand(Input.userInputArray)) {
            if (Input.userInputArray.length != 3) {
                System.out.println("source, target 위치를 제대로 입력해 주세요.");
                return false;
            }
            String source = Input.userInputArray[1];
            String target = Input.userInputArray[2];

            if (!isValidPosition(source) || !isValidPosition(target)) {
                System.out.println("올바른 좌표를 입력해주세요.");
                return false;
            }
        } else if (!commandCandidates.contains(Input.userInputArray[0])) {
            System.out.println("올바른 명령어를 입력해주세요.");
            return false;
        }

        return true;
    }

    private boolean isMoveCommand(String[] userInput) {
        if (userInput[0].equals("move")) {
            return true;
        }
        return false;
    }

    private boolean isValidPosition(String position) {
        return position.length() == 2 && Position.checkValidatePosition(position);
    }
}
