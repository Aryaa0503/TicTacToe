package com.tictactoe;

public class uc6_place {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Initialize board
        initializeBoard();

        // Place a sample move
        placeMove(0, 0, 'X');

        // Print updated value
        System.out.println("Value at (0,0): " + board[0][0]);
    }

    // Initialize board with '-'
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Place symbol on board
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}