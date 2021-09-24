package controller.command;

import controller.Calculator;
import domain.board.Board;
import view.Output;

public class Status implements Command{
    public Status() {
    }

    @Override
    public void execute(Board board) {
        Calculator.calcScore(board);
        Output.printBoard(board);
    }
}
