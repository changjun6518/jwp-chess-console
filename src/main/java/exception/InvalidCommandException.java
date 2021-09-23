package exception;

public class InvalidCommandException extends IllegalArgumentException {
    public InvalidCommandException() {
        super("올바른 명령어를 입력해주세요.");
    }
}
