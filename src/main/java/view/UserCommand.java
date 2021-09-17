package view;

public enum UserCommand {
    START("start"),
    END("end"),
    STATUS("status"),
    MOVE("move");

    private String command;

    UserCommand(String command) {
        this.command = command;
    }

    public String isStart() {
        return command;
    }

    boolean isEnd() {
        return this == END;
    }

    boolean isStatus() {
        return this == STATUS;
    }

    boolean isMove() {
        return this == MOVE;
    }
}
