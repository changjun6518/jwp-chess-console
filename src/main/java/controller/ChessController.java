package controller;

import domain.board.Board;
import domain.piece.Team;
import view.Input;
import view.Output;

public class ChessController {
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

        while (true) {
            String userInput = Input.getUserInput();

            boolean isMoveCommand = userInput.startsWith("move");

            if (userInput.equals("start")) {
                command.start(board);
            } else if (userInput.equals("end")) {
                command.end();
            } else if (userInput.equals("status")) {

            } else if (isMoveCommand){
                String[] moveCommand = userInput.split(" ");
                turn = command.move(board, moveCommand[1], moveCommand[2], turn);
            }
        }


    }

}
