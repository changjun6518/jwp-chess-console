package controller.command;

import domain.board.Board;

public class End implements Command {
    public End() {
    }

    @Override
    public void execute(Board board) {
        board.finishGame();
    }
}
