package controller;

import domain.board.Board;
import domain.piece.Team;
import domain.position.Position;
import view.Input;
import view.Output;

import java.util.Arrays;
import java.util.List;

public class ChessController {
    private final List<String> commandCandidates = Arrays.asList("start", "end", "status");
    private final Board board;
    private final Command command;
    private Team turn;

    public ChessController(Board board, Command command) {
        this.board = board;
        this.command = command;
    }

    public void run() {
        Output.initMessage();

        turn = Team.WHITE;

        while (!board.isFinished()) {
            String userInput = Input.getUserInput();

            if (!isValidCommand(userInput)) {
                continue;
            }

            boolean isMoveInput = userInput.startsWith("move");

            if (userInput.equals("start")) {
                command.start(board);
            } else if (userInput.equals("end")) {
                board.finishGame();
            } else if (userInput.equals("status")) {
                Calculator.calcScore(board);
            } else if (isMoveInput){
                String[] moveCommand = userInput.split(" ");
                try {
                    turn = command.move(board, moveCommand[1], moveCommand[2], turn);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        command.end();
    }

    private boolean isValidCommand(String userInput) {
        String[] inputSplited = userInput.split(" ");

        if (isMoveCommand(inputSplited)) {
            String source = inputSplited[1];
            String target = inputSplited[2];

            if (!isValidPosition(source) || !isValidPosition(target)) {
                System.out.println("올바른 좌표를 입력해주세요.");
                return false;
            }
        } else if (!commandCandidates.contains(inputSplited[0])) {
            System.out.println("올바른 명령어를 입력해주세요.");
            return false;
        } else if (inputSplited.length != 1) {
            System.out.println("source, target 위치를 제대로 입력해 주세요.");
            return false;
        }

        return true;
    }

    private boolean isMoveCommand(String[] userInput) {
        if (userInput.length == 3) {
            return true;
        }
        return false;
    }

    private boolean isValidPosition(String position) {
        return position.length() == 2 && Position.checkValidatePosition(position);
    }
}
