package view;

import domain.board.Board;
import domain.piece.Piece;
import domain.piece.PieceType;
import domain.piece.Team;
import domain.position.Position;

import java.util.Scanner;

public class Input {
    private static final int BOARD_START = 1;
    private static final int BOARD_END = 8;
    private static final Scanner scanner = new Scanner(System.in);


    // start, end, move a1 b2, status
    public static String[] getUserInput() {
        String userInput = scanner.nextLine();
        String[] userInputArray = userInput.split(" ");
        return userInputArray;
    }

}
