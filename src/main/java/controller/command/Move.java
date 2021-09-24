package controller.command;

import domain.board.Board;
import view.Input;
import view.Output;

public class Move implements Command{
    public Move() {
    }

    @Override
    public void execute(Board board) {
        try {
            board.move(Input.userInputArray[1], Input.userInputArray[2]);
            if (board.isFinished()) {
                Output.kingDieMessage();
            }
            Output.printBoard(board);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
