package exception;

public class BoardOutOfIndexException extends IllegalArgumentException {
    public BoardOutOfIndexException() {
        super("보드 범위를 벗어났습니다!");
    }
}
