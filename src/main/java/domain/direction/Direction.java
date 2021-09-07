package domain.direction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public enum Direction {
    NORTH(0, 1),
    SOUTH(0, -1),
    EAST(1, 0),
    WEST(-1, 0),
    NORTH_NORTH(0, 2),
    SOUTH_SOUTH(0, -2),
    NORTH_EAST(1, 1),
    NORTH_WEST(-1, 1),
    SOUTH_EAST(1, -1),
    SOUTH_WEST(-1, -1),
    SOUTH_SOUTH_EAST(1, -2),
    SOUTH_SOUTH_WEST(-1, -2),
    NORTH_NORTH_EAST(1, 2),
    NORTH_NORTH_WEST(-1, 2),
    EAST_EAST_SOUTH(2, -1),
    EAST_EAST_NORTH(2, 1),
    WEST_WEST_SOUTH(-2, -1),
    WEST_WEST_NORTH(-2, 1);

    private final int col;
    private final int row;

    Direction(int col, int row) {
        this.col = col;
        this.row = row;
    }


    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public static List<Direction> getKingDirections() {
        return Arrays.asList(NORTH, NORTH_EAST, EAST, SOUTH_EAST, SOUTH, SOUTH_WEST, WEST, NORTH_WEST);
    }

    public static List<Direction> getQueenDirections() {
        return Arrays.asList(NORTH, NORTH_EAST, EAST, SOUTH_EAST, SOUTH, SOUTH_WEST, WEST, NORTH_WEST);
    }
    public static List<Direction> getRookDirections() {
        return Arrays.asList(NORTH, EAST, SOUTH,  WEST);
    }
    public static List<Direction> getKnightDirections() {
        return Arrays.asList(NORTH_NORTH_EAST, NORTH_NORTH_WEST, SOUTH_SOUTH_EAST, SOUTH_SOUTH_WEST,
                EAST_EAST_NORTH, EAST_EAST_SOUTH, WEST_WEST_NORTH, WEST_WEST_SOUTH);
    }
    public static List<Direction> getBishopDirections() {
        return Arrays.asList(NORTH_EAST, SOUTH_EAST,SOUTH_WEST, NORTH_WEST);
    }

    public static List<Direction> getWhitePawnDirections() {
        return Arrays.asList(NORTH, NORTH_EAST, NORTH_WEST);
    }
    public static List<Direction> getBlackPawnDirections() {
        return Arrays.asList(SOUTH_EAST, SOUTH, SOUTH_WEST);
    }

    public static List<Direction> getFirstWhitePawnDirections() {
        return Arrays.asList(NORTH,NORTH_NORTH, NORTH_EAST, NORTH_WEST);
    }
    public static List<Direction> getFirstBlackPawnDirections() {
        return Arrays.asList(SOUTH_SOUTH, SOUTH_EAST, SOUTH, SOUTH_WEST);
    }

    public static List<Direction> getNoneDirections() {
        return Collections.emptyList();
    }

}
