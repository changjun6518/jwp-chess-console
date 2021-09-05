package domain;

public class Piece {
    private PieceType pieceType;
    private Team team;
    private Position position;

    public Piece(PieceType pieceType, Team team, Position position) {
        this.pieceType = pieceType;
        this.team = team;
        this.position = position;
    }
}
