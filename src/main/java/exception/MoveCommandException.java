package exception;

public class MoveCommandException extends IllegalArgumentException {
    public MoveCommandException() {
        super("source, target 위치를 제대로 입력해 주세요.");
    }
}
