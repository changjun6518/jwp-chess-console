package controller.command;

import domain.board.Board;

public interface Command {
    void execute(Board board);
}
