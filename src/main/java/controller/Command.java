package controller;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.piece.Piece;
import domain.piece.Team;
import domain.position.Position;
import view.Output;

import java.util.HashMap;

public class Command {
    public Board start() {
        HashMap<Position, Piece> initBoard = BoardFactory.createBoard();
        return new Board(initBoard);
    }

    // move a2 a3
    // 흰색 턴인데? 검은 색말을 움직이려고 하면 오류!
    public Team move(Board board, String from, String to, Team turn) {
        Team nextTurn = board.move(from, to, turn);
        Output.printBoard(board);

        if (board.isFinished()) {
            Output.kingDieMessage();
        }

        return nextTurn;
    }

    public void end() {
        Output.endMessage();
    }
}
