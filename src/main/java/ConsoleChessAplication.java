import controller.ChessController;
import controller.Command;
import domain.board.Board;
import domain.board.BoardFactory;
import domain.piece.Piece;
import domain.position.Position;

import java.util.HashMap;

public class ConsoleChessAplication {
    public static void main(String[] args) {
        HashMap<Position, Piece> initBoard = BoardFactory.createBoard();
        Board board = new Board(initBoard);
        Command command = new Command();

        ChessController chessController = new ChessController(command);

        chessController.run();
    }

}
