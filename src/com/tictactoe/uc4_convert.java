package com.tictactoe;

public class uc4_convert {

    public static void main(String[] args) {

        int slot = 7; // example input (1–9)

        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    // Convert slot (1–9) to row (0–2)
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot (1–9) to column (0–2)
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}