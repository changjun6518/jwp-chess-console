package domain.moveStrategy;

import domain.board.Board;
import domain.position.Position;

import java.util.List;

public interface MoveStrategy {
    List<Position> possiblePositions(Position from, Board board);
}

