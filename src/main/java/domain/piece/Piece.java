package domain.piece;

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
}
