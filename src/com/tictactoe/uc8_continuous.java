package com.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class uc8_continuous {

    static char[][] board = new char[3][3];
    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    static char human = 'X';
    static char computer = 'O';

    public static void main(String[] args) {

        initializeBoard();
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {

            printBoard();

            if (isHumanTurn) {
                System.out.print("Enter slot (1-9): ");
                int slot = scanner.nextInt();

                int row = (slot - 1) / 3;
                int col = (slot - 1) % 3;

                if (isValidMove(row, col)) {
                    placeMove(row, col, human);
                    isHumanTurn = false;
                } else {
                    System.out.println("Invalid move! Try again.");
                }

            } else {
                computerMove();
                isHumanTurn = true;
            }

            // Stop condition (simple version)
            if (isBoardFull()) {
                gameOver = true;
                printBoard();
                System.out.println("Game Over!");
            }
        }

        scanner.close();
    }

    // Initialize board
    static void initializeBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = '-';
    }

    // Print board
    static void printBoard() {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Validate move
    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    // Place move
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Computer move
    static void computerMove() {
        Random random = new Random();

        while (true) {
            int slot = random.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (isValidMove(row, col)) {
                placeMove(row, col, computer);
                System.out.println("Computer chose: " + slot);
                break;
            }
        }
    }

    // Check if board is full
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == '-')
                    return false;

        return true;
    }
}