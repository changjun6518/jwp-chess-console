package domain.position;

import domain.direction.Direction;
import exception.BoardOutOfIndexException;

import java.util.Objects;

public class Position {
    private static final int BOARD_START_INDEX = 0;
    private static final int BOARD_END_INDEX = 8;

    private int file;
    private int rank;

    public int getFile() {
        return file;
    }

    public int getRank() {
        return rank;
    }

    public Position(int file, int rank) {
        this.file = file;
        this.rank = rank;
    }

    public static Position of(int file, int rank) {
        return new Position(file, rank);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Position position = (Position)o;
        return file == position.file && rank == position.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }

    public Position updatePosition(Direction direction) {
//        if (checkValidatePosition(file + direction.getCol(), rank + direction.getRow())) {
//            throw new BoardOutOfIndexException();
//        }
        return new Position(file + direction.getCol(), rank + direction.getRow());
    }


    private boolean checkValidatePosition(int file, int rank) {
        return file >= BOARD_START_INDEX && file < BOARD_END_INDEX &&
                rank >= BOARD_START_INDEX && rank < BOARD_END_INDEX;
    }

    @Override
    public String toString() {
        return "Position{" +
                "file=" + file +
                ", rank=" + rank +
                '}';
    }
}
