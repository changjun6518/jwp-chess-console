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
    private final Command command;
    private UserCommand userCommand;
    private Team turn;

    public ChessController(Command command) {
        this.command = command;
    }

    public void run() {
        Output.initMessage();

        turn = Team.WHITE;

        while (true) {
            for (UserCommand value : UserCommand.values()) {
                if (Input.userInputArray[0].equals(value.name())) {
                    userCommand = value;
                }
            }

            if (!isValidCommand()) {
                continue;
            }

            if (userCommand.isStart()) {
                board = command.start();
                Output.printBoard(board);
            } else if (board == null) {
                System.out.println("start부터 입력해주세요");
                continue;
            } else if (userInput[0].equals("end")) {
                board.finishGame();
            } else if (userInput[0].equals("status")) {
                Calculator.calcScore(board);
            } else if (userInput[0].equals("move")) {
                try {
                    turn = command.move(board, userInput[1], userInput[2], turn);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            if (board.isFinished()) {
                break;
            }
        }
        command.end();
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
