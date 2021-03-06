package domain.moveStrategy;

import domain.board.Board;
import domain.direction.Direction;
import domain.piece.Piece;
import domain.position.Position;

import java.util.ArrayList;
import java.util.List;

public class SingleMoveStrategy implements MoveStrategy {

    private final List<Direction> directions;

    public SingleMoveStrategy(List<Direction> directions) {
        this.directions = directions;
    }

    @Override
    public List<Position> possiblePositions(Position from, Board board) {
        ArrayList<Position> path = new ArrayList<>();

        Piece fromPiece = board.findPieceByPosition(from);

        for (Direction direction : directions) {
            Position nextPosition = from.updatePosition(direction);
            Piece nextPiece = board.findPieceByPosition(nextPosition);

            if (board.isValidPosition(nextPosition)) {
                if (fromPiece.isOtherTeam(nextPiece)) {
                    continue;
                }
                path.add(nextPosition);
            }
        }
        return path;
    }
}
