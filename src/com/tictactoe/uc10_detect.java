package com.tictactoe;

public class uc10_detect {

    static char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
    };

    public static void main(String[] args) {
        System.out.println("Is Draw? " + isDraw());
    }

    // Check draw condition
    static boolean isDraw() {

        // If any cell is empty → not a draw
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        // No empty cells → draw
        return true;
    }
}