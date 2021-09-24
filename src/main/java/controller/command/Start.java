package controller.command;

import domain.board.Board;
import view.Output;

public class Start implements Command{
    public Start() {
    }

    @Override
    public void execute(Board board) {
        board.initBoard();
        Output.printBoard(board);
    }
}
