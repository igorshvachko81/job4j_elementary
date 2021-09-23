package ru.job4j.condition;

public class ChessBoard {
    public static int wayElephant(int x1, int y1, int x2, int y2) {
        if ((Math.abs(x1 - x2) == Math.abs(y1 - y2)) && (inRange(0, 7, x1))
                && (inRange(0, 7, y1)) && (inRange(0, 7, x2))
                && (inRange(0, 7, y2))) {
            return Math.abs(x1 - x2);
        } else {
            return 0;
        }
    }

    public static boolean inRange(int startRange, int finishRange, int explorerX) {
        return (explorerX >= startRange && explorerX <= finishRange);
    }

    public static void main(String[] args) {
        System.out.println("Elephant way equals: " + wayElephant(7, 0, 1, 6));
    }
}
