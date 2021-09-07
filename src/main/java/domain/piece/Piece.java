package domain.piece;

import java.util.Objects;

public class Piece {
    private PieceType pieceType;
    private Team team;


    public Piece(PieceType pieceType, Team team) {
        this.pieceType = pieceType;
        this.team = team;
    }

    public static Piece of(PieceType pieceType, Team team) {
        return new Piece(pieceType, team);
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
        return team != otherPiece.team;
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
}
