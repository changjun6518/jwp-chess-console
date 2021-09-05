package domain;

public enum File {
    A('a', 1),
    B('b', 2),
    C('c', 3),
    D('d', 4),
    E('e', 5),
    F('f', 6),
    G('g', 7),
    H('h', 8),;

    private final char value;
    private final int order;

    File(char value, int order) {
        this.value = value;
        this.order = order;
    }
}
