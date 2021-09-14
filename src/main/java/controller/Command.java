package controller;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.piece.Piece;
import domain.piece.Team;
import domain.position.Position;
import view.Output;

import java.util.HashMap;

public class Command {
    private Board board;
    public void start() {
        HashMap<Position, Piece> initBoard = BoardFactory.createBoard();
        board = new Board(initBoard);
        Output.printBoard(board);
    }

    // move a2 a3
    // 흰색 턴인데? 검은 색말을 움직이려고 하면 오류!

    public void move(String from, String to) {
        Team currentTurn = board.move(from, to);
        if (board.isFinished()) {
            Output.kingDieMessage();
        }
    }

    public void end() {
        Output.endMessage();
    }
}
