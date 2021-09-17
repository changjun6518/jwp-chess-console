package view;

public enum UserCommand {
    START("start"),
    END("end"),
    STATUS("status"),
    MOVE("move");

    String command;

    UserCommand(String command) {
        this.command = command;
    }

    boolean isStart(String userInput) {

    }
}
