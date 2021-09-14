package view;

import domain.board.Board;
import domain.piece.Piece;
import domain.piece.PieceType;
import domain.piece.Team;
import domain.position.Position;

public class Output {
    private static final int BOARD_START = 1;
    private static final int BOARD_END = 8;


    public static void printBoard(Board board) {
        for (int i = BOARD_END; i >= BOARD_START; i--) {
            for (int j = BOARD_START; j <= BOARD_END; j++) {
                Character pieceMark = board.getPieceMarkBy(Position.of(j, i));
                System.out.print(pieceMark);
            }
            System.out.println();
        }
    }

    public static void kingDieMessage() {
        System.out.println("왕이 잡혀서 게임이 종료되었습니다!");
    }

    public static void endMessage() {
        System.out.println("체스게임을 종료합니다!");
    }
}