package domain.moveStrategy;

import domain.board.Board;
import domain.direction.Direction;
import domain.piece.Piece;
import domain.position.Position;

import java.util.ArrayList;
import java.util.List;

public class PawnMoveStrategy implements MoveStrategy{
    private static final int FIRST_WHITE_RANK = 2;
    private static final int FIRST_BLACK_RANK = 7;

    private List<Direction> directions;

    public PawnMoveStrategy(List<Direction> directions) {
        this.directions = directions;
    }

    @Override
    public List<Position> possiblePositions(Position from, Board board) {
        ArrayList<Position> path = new ArrayList<>();
        Piece fromPiece = board.findPieceByPosition(from);

        if (!isFirstPawn(from)) {
            directions = fromPiece.isWhite() ? Direction.getWhitePawnDirections() : Direction.getBlackPawnDirections();
        }

        for (Direction direction : directions) {
            Position nextPosition = from.updatePosition(direction);
            Piece nextPiece = board.findPieceByPosition(nextPosition);

            if (board.isValidPosition(nextPosition)) {
                if (Direction.isDiagonal(direction) && fromPiece.isOtherTeam(nextPiece)) {
                    path.add(nextPosition);
                }

                if (Direction.isForward(direction) && nextPiece.isNone()) {
                    path.add(nextPosition);
                }
            }
        }

        return path;
    }

    private boolean isFirstPawn(Position from) {
        if (from.getRank() == FIRST_WHITE_RANK || from.getRank() == FIRST_BLACK_RANK) {
            return true;
        }
        return false;
    }

}
