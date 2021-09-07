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

    private List<Direction> whiteDirections;
    private List<Direction> blackDirections;

    public PawnMoveStrategy(List<Direction> whiteDirections, List<Direction> blackDirections) {
        this.whiteDirections = whiteDirections;
        this.blackDirections = blackDirections;
    }

    @Override
    public List<Position> possiblePositions(Position from, Board board) {
        if (!isFirstPawn(from)) {
            whiteDirections = Direction.getWhitePawnDirections();
            blackDirections = Direction.getBlackPawnDirections();
        }
        ArrayList<Position> path = new ArrayList<>();
        Piece fromPiece = board.findPieceByPosition(from);

        for (Position position : di) {

        }
    }



    private boolean isFirstPawn(Position from) {
        if (from.getRank() == FIRST_WHITE_RANK || from.getRank() == FIRST_BLACK_RANK) {
            return true;
        }
        return false;
    }

}
