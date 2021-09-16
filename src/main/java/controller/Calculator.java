package controller;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.piece.Piece;
import domain.position.Position;
import view.Output;

public class Calculator {

    public static void calcScore(Board board) {

        double whiteScore = 0;
        double blackScore = 0;

        for (int i = BoardFactory.BOARD_START; i <= BoardFactory.BOARD_END; i++) {
            int whitePawnCount = 0;
            int blackPawnCount = 0;
            for (int j = BoardFactory.BOARD_START; j <= BoardFactory.BOARD_END; j++) {
                Piece piece = board.findPieceByPosition(Position.of(i, j));

                if (piece.isWhitePawn()) {
                    whitePawnCount++;
                    continue;
                }

                if (piece.isBlackPawn()) {
                    blackPawnCount++;
                    continue;
                }

                if (piece.isWhite()) {
                    whiteScore += piece.getPieceScore();
                } else if (piece.isBlack()) {
                    blackScore += piece.getPieceScore();
                }
            }

            if (whitePawnCount == 1) {
                whiteScore += 1;
            } else if (whitePawnCount >= 2) {
                whiteScore += 0.5 * whitePawnCount;
            }

            if (blackPawnCount == 1) {
                blackScore += 1;
            } else if (blackPawnCount >= 2) {
                blackScore += 0.5 * blackPawnCount;
            }

        }

        Output.scoreMessage(whiteScore, blackScore);
    }

}
