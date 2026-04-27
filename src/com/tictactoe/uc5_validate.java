package com.tictactoe;

public class uc5_validate {

    // Sample board
    static char[][] board = {
            {'-', '-', '-'},
            {'-', 'X', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int row = 1;
        int col = 1;

        System.out.println("Is move valid? " + isValidMove(row, col));
    }

    // Validate move
    static boolean isValidMove(int row, int col) {

        // Check boundaries (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}