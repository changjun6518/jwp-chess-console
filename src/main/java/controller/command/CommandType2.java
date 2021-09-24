package controller.command;

import domain.board.Board;
import exception.InvalidCommandException;

import java.util.Arrays;

public enum CommandType2 {
    START("start", new Start()),

    END("end", new End()),

    STATUS("status", new Status()),

    MOVE("move", new Move()),

    UNKNOWN("unknown", new Unknown()),
    ;

    private final String symbol;
    private final Command command;

    CommandType2(String symbol, Command command) {
        this.symbol = symbol;
        this.command = command;
    }

    public static CommandType2 findSymbol(String userInput) {
        return Arrays.stream(CommandType2.values())
                .filter(command -> command.symbol != null)
                .filter(command -> command.symbol.equals(userInput))
                .findFirst()
                .orElse(CommandType2.UNKNOWN);
    }
    public boolean isNotUnknown() {
        if (this == CommandType2.UNKNOWN) {
            throw new InvalidCommandException();
        }
        return true;
    }

    public boolean isMove() {
        return this == CommandType2.MOVE;
    }

    public boolean isNotEnd() {
        return this != CommandType2.END;
    }

    public void execute(Board board) {
        command.execute(board);
    }
}
