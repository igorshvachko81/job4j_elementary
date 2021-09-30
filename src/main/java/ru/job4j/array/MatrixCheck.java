package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        int index = -1;
        char[] detect = extractDiagonal(board);
        for (int i = 0; i < detect.length; i++) {
            if (detect[i] == 'X') {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return result;
        }
        if (monoHorizontal(board, index) || monoVertical(board, index)) {
            result = true;
        }
        return result;
    }
}
