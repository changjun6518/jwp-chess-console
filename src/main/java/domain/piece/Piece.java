package domain.piece;

import domain.board.Board;
import domain.position.Position;

import java.util.List;
import java.util.Objects;

public class Piece {
    private PieceType pieceType;
    private Team team;
    private Character mark;

    public Piece(PieceType pieceType, Team team, Character mark) {
        this.pieceType = pieceType;
        this.team = team;
        this.mark = mark;
    }

    public static Piece of(PieceType pieceType, Team team, Character mark) {
        return new Piece(pieceType, team, mark);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Piece piece = (Piece)o;
        return pieceType == piece.pieceType && team == piece.team;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceType, team);
    }

    public boolean isOtherTeam(Piece otherPiece) {
        if (team == Team.WHITE) {
            return otherPiece.team == Team.BLACK;
        }
        return otherPiece.team == Team.WHITE;
    }

    public boolean isOtherTeam(Team turn) {
        return team != turn;
    }

    public boolean isNone() {
        return team == Team.NONE;
    }

    public boolean isSameTeam(Piece otherPiece) {
        return team == otherPiece.team;
    }

    public boolean isWhite() {
        return team == Team.WHITE;
    }

    public boolean isBlack() {
        return team == Team.BLACK;
    }

    public boolean movable(Position fromPosition, Board board, String to) {
        List<Position> possiblePaths = pieceType.getPossiblePaths(fromPosition, board);
        for (Position possiblePath : possiblePaths) {
            System.out.println("possiblePath = " + possiblePath);
        }
        System.out.println();
        return pieceType.getPossiblePaths(fromPosition, board).contains(Position.of(to));
    }

    public boolean isKing() {
        return pieceType == PieceType.KING;
    }

    public Character getMark() {
        return mark;
    }
}
