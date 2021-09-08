package domain.moveStrategy;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.direction.Direction;
import domain.position.Position;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiMoveStrategyTest {

    @DisplayName("board boundary test")
    @Test
    void isValidBoundary() {

        Board board = BoardFactory.createTestBoard();
        MultiMoveStrategy multiMoveStrategy = new MultiMoveStrategy(Direction.getBishopDirections());

        Position from = Position.of(4, 4);

        multiMoveStrategy.possiblePositions(from, board);

    }
}