package exception;

public class InvalidPositionException extends IllegalArgumentException {
    public InvalidPositionException() {
        super("올바른 좌표를 입력해주세요.");
    }
}
