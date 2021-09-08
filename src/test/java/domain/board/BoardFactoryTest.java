package domain.board;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.piece.Piece;
import domain.piece.PieceType;
import domain.piece.Team;
import domain.position.File;
import domain.position.Position;
import domain.position.Rank;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;

class BoardFactoryTest {

    private Board board;

    @BeforeEach
    void setUp() {
        System.out.println("1");
        board = BoardFactory.createTestBoard();
        board.updateSquareBy(Position.of(3, 3), Piece.of(PieceType.QUEEN, Team.WHITE));
    }


    @DisplayName("initialization test")
    @Test
    void initChessboard_size() {
        // when
//        final HashMap<Position, Piece> board = BoardFactory.createBoard();

        // then
//        assertThat(board.size()).isEqualTo(64);
    }

    @DisplayName("position test")
    @Test
    void initChessboard_locationTest() {
//        // given
//        Piece king = Piece.of(PieceType.KING, Team.WHITE);
//        Position position = new Position(5, 1);
//        // when
//        final HashMap<Position, Piece> board = BoardFactory.createBoard();
//        final Piece piece = board.get(position);
//
//        // then
//        assertThat(king).isEqualTo(piece);
    }


    @DisplayName("Move 테스트")
    @ParameterizedTest
    @MethodSource("getForMoveTest")
    void moveTest(Position toPosition, Piece toPiece, String to) {
        // 움직인 다음
        // 기물 확인

        // given
        // black pawn 보드에 줌
        board.updateSquareBy(toPosition, toPiece);
        // when
        // 퀸이 pawn을 먹을 때
        board.move("c3", to);

        // then
        // 보드의 pawn 위치가 퀸 인지?
        Piece afterPiece = board.findPieceByPosition(Position.of(to));
        assertThat(afterPiece).isEqualTo(Piece.of(PieceType.QUEEN, Team.WHITE));

    }


    private static Stream<Arguments> getForMoveTest() {
        return Stream.of(
                Arguments.of(Position.of(4, 4), Piece.of(PieceType.KING, Team.BLACK), "d4"),
                Arguments.of(Position.of(3, 2), Piece.of(PieceType.KING, Team.BLACK), "c2")
        );
    }

}