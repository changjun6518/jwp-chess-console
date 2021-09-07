package domain.position;


public enum File {
    A('a', 1),
    B('b', 2),
    C('c', 3),
    D('d', 4),
    E('e', 5),
    F('f', 6),
    G('g', 7),
    H('h', 8),;

    private final char key;
    private final int value;

    public char getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    File(char key, int value) {
        this.key = key;
        this.value = value;
    }

}
