package domain.board;

import domain.piece.Piece;
import domain.position.Position;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<Position, Piece> board = new HashMap<>();

    public Board(Map<Position, Piece> board) {
        this.board = board;
    }

    public Piece findPieceByPosition(Position position) {
        return board.get(position);
    }

    public boolean isValidPosition(Position nextPosition) {
        int x = nextPosition.getFile();
        int y = nextPosition.getRank();

        return x >= 1 && x <= 8 && y >= 1 && y <= 8;
    }

    public void updateSquareBy(Position position, Piece piece) {
        board.put(position, piece);
    }
}
