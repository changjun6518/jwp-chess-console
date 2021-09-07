package domain.piece;

import domain.direction.Direction;
import domain.moveStrategy.MoveStrategy;
import domain.moveStrategy.SingleMoveStrategy;

import java.util.List;

public enum PieceType {
    KING(new SingleMoveStrategy(Direction.getKingDirections())),
    QUEEN(Direction.getQueenDirections()),
    ROOK(Direction.getRookDirections()),
    KNIGHT(Direction.getKnightDirections()),
    BISHOP(Direction.getBishopDirections()),
    PAWN(Direction.getBlackPawnDirections()),

    NONE(Direction.getNoneDirections()),;


    private MoveStrategy moveStrategy;

    PieceType(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }
}
