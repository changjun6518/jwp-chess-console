package domain.board;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.piece.Piece;
import domain.piece.PieceType;
import domain.piece.Team;
import domain.position.File;
import domain.position.Position;
import domain.position.Rank;

class BoardFactoryTest {
    @DisplayName("초기화 테스트")
    @Test
    void initChessboard_size() {
        // when
        final HashMap<Position, Piece> board = BoardFactory.createBoard();

        // then
        assertThat(board.size()).isEqualTo(64);
    }

    @DisplayName("위치 테스트")
    @Test
    void initChessboard_locationTest() {
        // given
        Piece king = Piece.of(PieceType.KING, Team.WHITE);
        Position position = new Position(5,1);
        // when
        final HashMap<Position, Piece> board = BoardFactory.createBoard();
        final Piece piece = board.get(position);

        // then
        assertThat(king).isEqualTo(piece);
    }
}