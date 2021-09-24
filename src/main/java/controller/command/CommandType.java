package controller.command;

import controller.Calculator;
import domain.board.Board;
import exception.InvalidCommandException;
import view.Input;
import view.Output;

import java.util.Arrays;
import java.util.function.Consumer;

public enum CommandType {
    START("start", (board)->{
        board.initBoard();
        Output.printBoard(board);
    }),
    END("end", (Board::finishGame)),
    STATUS("status",(board -> {
        Calculator.calcScore(board);
        Output.printBoard(board);
    })),
    MOVE("move", (board -> {
        try {
            board.move(Input.userInputArray[1], Input.userInputArray[2]);
            if (board.isFinished()) {
                Output.kingDieMessage();
            }
            Output.printBoard(board);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    })),
    CHANGE("change",(board -> {
        System.out.println("체인지!!");
    })),
    UNKNOWN(null, null),;

    private final String symbol;
    private final Consumer<Board> commandFunc;

    CommandType(String symbol, Consumer<Board> commandFunc) {
        this.symbol = symbol;
        this.commandFunc = commandFunc;
    }

    public void execute(Board board) {
        this.commandFunc.accept(board);
    }

    public static CommandType findSymbol(String command) {
        return Arrays.stream(CommandType.values())
                .filter(type -> type.symbol != null)
                .filter(type -> type.symbol.equals(command))
                .findFirst()
                .orElse(CommandType.UNKNOWN);
    }

    public boolean isNotUnknown() {
        if (this == CommandType.UNKNOWN) {
            throw new InvalidCommandException();
        }
        return true;
    }

    public boolean isMove() {
        return this == CommandType.MOVE;
    }

    public boolean isNotEnd() {
        return this != CommandType.END;
    }
}
