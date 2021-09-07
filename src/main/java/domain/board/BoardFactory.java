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
        whitePiecese.put(Position.of(1,1), Piece.of(PieceType.ROOK, Team.WHITE));
        whitePiecese.put(Position.of(2,1), Piece.of(PieceType.KNIGHT, Team.WHITE));
        whitePiecese.put(Position.of(3,1), Piece.of(PieceType.BISHOP, Team.WHITE));
        whitePiecese.put(Position.of(4,1), Piece.of(PieceType.QUEEN, Team.WHITE));
        whitePiecese.put(Position.of(5,1), Piece.of(PieceType.KING, Team.WHITE));
        whitePiecese.put(Position.of(6,1), Piece.of(PieceType.BISHOP, Team.WHITE));
        whitePiecese.put(Position.of(7,1), Piece.of(PieceType.KNIGHT, Team.WHITE));
        whitePiecese.put(Position.of(8,1), Piece.of(PieceType.ROOK, Team.WHITE));

        whitePiecese.put(Position.of(1,2), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(2,2), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(3,2), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(4,2), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(5,2), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(6,2), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(7,2), Piece.of(PieceType.PAWN, Team.WHITE));
        whitePiecese.put(Position.of(8,2), Piece.of(PieceType.PAWN, Team.WHITE));

        return whitePiecese;
    }

    private static HashMap<Position, Piece> insertBlackPiece() {
        HashMap<Position, Piece> blackPieces = new HashMap<>();

        blackPieces.put(Position.of(1,1), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(2,1), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(3,1), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(4,1), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(5,1), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(6,1), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(7,1), Piece.of(PieceType.PAWN, Team.BLACK));
        blackPieces.put(Position.of(8,1), Piece.of(PieceType.PAWN, Team.BLACK));

        blackPieces.put(Position.of(1,1), Piece.of(PieceType.ROOK, Team.BLACK));
        blackPieces.put(Position.of(2,1), Piece.of(PieceType.KNIGHT, Team.BLACK));
        blackPieces.put(Position.of(3,1), Piece.of(PieceType.BISHOP, Team.BLACK));
        blackPieces.put(Position.of(4,1), Piece.of(PieceType.QUEEN, Team.BLACK));
        blackPieces.put(Position.of(5,1), Piece.of(PieceType.KING, Team.BLACK));
        blackPieces.put(Position.of(6,1), Piece.of(PieceType.BISHOP, Team.BLACK));
        blackPieces.put(Position.of(7,1), Piece.of(PieceType.KNIGHT, Team.BLACK));
        blackPieces.put(Position.of(8,1), Piece.of(PieceType.ROOK, Team.BLACK));

        return blackPieces;
    }

    private static HashMap<Position, Piece> insertNonePiece() {
        HashMap<Position, Piece> nonePieces = new HashMap<>();
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));

        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));

        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));

        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        nonePieces.put(Position.of(1,1), Piece.of(PieceType.NONE, Team.NONE));
        return nonePieces;
    }
}
