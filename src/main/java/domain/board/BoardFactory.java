package domain.board;

import domain.piece.*;
import domain.position.File;
import domain.position.Position;
import domain.position.Rank;

import java.util.HashMap;

public class BoardFactory {

    public static HashMap<Position, Piece> createBoard() {
        HashMap<Position, Piece> board = new HashMap<>();
        board.putAll(insertWhitePiece());
        board.putAll(insertNonePiece());
        board.putAll(insertBlackPiece());

        return board;
    }

    private static HashMap<Position, Piece> insertWhitePiece() {
        HashMap<Position, Piece> whitePiecese = new HashMap<>();
        whitePiecese.put(Position.of(File.A, Rank.ONE), Piece.of(PieceType.ROOK, Team.WHITE));
        whitePiecese.put(Position.of(File.B, Rank.ONE), Piece.of(PieceType.KNIGHT, Team.WHITE));
        whitePiecese.put(Position.of(File.C, Rank.ONE), Piece.of(PieceType.BISHOP, Team.WHITE));
        whitePiecese.put(Position.of(File.D, Rank.ONE), Piece.of(PieceType.QUEEN, Team.WHITE));
        whitePiecese.put(Position.of(File.E, Rank.ONE), Piece.of(PieceType.KING, Team.WHITE));
        whitePiecese.put(Position.of(File.F, Rank.ONE), Piece.of(PieceType.BISHOP, Team.WHITE));
        whitePiecese.put(Position.of(File.G, Rank.ONE), Piece.of(PieceType.KNIGHT, Team.WHITE));
        whitePiecese.put(Position.of(File.H, Rank.ONE), Piece.of(PieceType.ROOK, Team.WHITE));

        whitePiecese.put(Position.of(File.A, Rank.TWO), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(File.B, Rank.TWO), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(File.C, Rank.TWO), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(File.D, Rank.TWO), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(File.E, Rank.TWO), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(File.F, Rank.TWO), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(File.G, Rank.TWO), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(File.H, Rank.TWO), Piece.of(PieceType.PAWN, Team.WHITE));

        return whitePiecese;
    }

    private static HashMap<Position, Piece> insertBlackPiece() {
        HashMap<Position, Piece> blackPieces = new HashMap<>();

        blackPieces.put(Position.of(File.A, Rank.SEVEN), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(File.B, Rank.SEVEN), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(File.C, Rank.SEVEN), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(File.D, Rank.SEVEN), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(File.E, Rank.SEVEN), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(File.F, Rank.SEVEN), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(File.G, Rank.SEVEN), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(File.H, Rank.SEVEN), Piece.of(PieceType.PAWN, Team.BLACK));

        blackPieces.put(Position.of(File.A, Rank.EIGHT), Piece.of(PieceType.ROOK, Team.BLACK));
        blackPieces.put(Position.of(File.B, Rank.EIGHT), Piece.of(PieceType.KNIGHT, Team.BLACK));
        blackPieces.put(Position.of(File.C, Rank.EIGHT), Piece.of(PieceType.BISHOP, Team.BLACK));
        blackPieces.put(Position.of(File.D, Rank.EIGHT), Piece.of(PieceType.QUEEN, Team.BLACK));
        blackPieces.put(Position.of(File.E, Rank.EIGHT), Piece.of(PieceType.KING, Team.BLACK));
        blackPieces.put(Position.of(File.F, Rank.EIGHT), Piece.of(PieceType.BISHOP, Team.BLACK));
        blackPieces.put(Position.of(File.G, Rank.EIGHT), Piece.of(PieceType.KNIGHT, Team.BLACK));
        blackPieces.put(Position.of(File.H, Rank.EIGHT), Piece.of(PieceType.ROOK, Team.BLACK));

        return blackPieces;
    }

    private static HashMap<Position, Piece> insertNonePiece() {
        HashMap<Position, Piece> nonePieces = new HashMap<>();
        nonePieces.put(Position.of(File.A, Rank.THREE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.B, Rank.THREE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.C, Rank.THREE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.D, Rank.THREE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.E, Rank.THREE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.F, Rank.THREE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.G, Rank.THREE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.H, Rank.THREE), Piece.of(PieceType.NONE, Team.NONE));

        nonePieces.put(Position.of(File.A, Rank.FOUR), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.B, Rank.FOUR), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.C, Rank.FOUR), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.D, Rank.FOUR), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.E, Rank.FOUR), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.F, Rank.FOUR), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.G, Rank.FOUR), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.H, Rank.FOUR), Piece.of(PieceType.NONE, Team.NONE));

        nonePieces.put(Position.of(File.A, Rank.FIVE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.B, Rank.FIVE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.C, Rank.FIVE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.D, Rank.FIVE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.E, Rank.FIVE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.F, Rank.FIVE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.G, Rank.FIVE), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.H, Rank.FIVE), Piece.of(PieceType.NONE, Team.NONE));

        nonePieces.put(Position.of(File.A, Rank.SIX), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.B, Rank.SIX), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.C, Rank.SIX), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.D, Rank.SIX), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.E, Rank.SIX), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.F, Rank.SIX), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.G, Rank.SIX), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(File.H, Rank.SIX), Piece.of(PieceType.NONE, Team.NONE));
        return nonePieces;
    }
}
