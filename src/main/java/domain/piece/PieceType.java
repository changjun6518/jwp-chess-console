package domain.piece;

import domain.direction.Direction;
import domain.moveStrategy.MoveStrategy;
import domain.moveStrategy.MultiMoveStrategy;
import domain.moveStrategy.SingleMoveStrategy;

import java.util.List;

public enum PieceType {
    KING(new SingleMoveStrategy(Direction.getKingDirections())),
    QUEEN(new MultiMoveStrategy(Direction.getQueenDirections())),
    ROOK(new MultiMoveStrategy(Direction.getRookDirections())),
    KNIGHT(new SingleMoveStrategy(Direction.getKnightDirections())),
    BISHOP(new MultiMoveStrategy(Direction.getBishopDirections())),
    WHITE_PAWN(new SingleMoveStrategy(Direction.getFirstWhitePawnDirections())),
    BLACK_PAWN(new SingleMoveStrategy(Direction.getFirstBlackPawnDirections())),
    NONE(new SingleMoveStrategy(Direction.getNoneDirections())),;

    private MoveStrategy moveStrategy;

    PieceType(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }
}
