package domain.board;

import domain.piece.Piece;
import domain.piece.PieceType;
import domain.piece.Team;
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

    private Piece findPieceByPosition(String position) {
        Position po = Position.of(position);
        return board.get(po);
    }

    public boolean isValidPosition(Position nextPosition) {
        int x = nextPosition.getFile();
        int y = nextPosition.getRank();

        return x >= 1 && x <= 8 && y >= 1 && y <= 8;
    }

    public void updateSquareBy(Position position, Piece piece) {
        board.put(position, piece);
    }

    public void move(String from, String to) {
        Piece fromPiece = findPieceByPosition(from);

        if (fromPiece.movable(Position.of(from), this, to)) {
            updateSquareBy(Position.of(to), fromPiece);
            updateSquareBy(Position.of(from), Piece.of(PieceType.NONE, Team.NONE));
        }
    }
}
