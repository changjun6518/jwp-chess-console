package domain.board;

import domain.piece.Piece;
import domain.position.Position;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<Position, Piece> board = new HashMap<>();

    public Piece findPieceByPosition(Position position) {
        return board.get(position);
    }

}
