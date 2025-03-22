package com.example.gato;

import java.util.Objects;

public class Grid {

    char[][] board = new char[3][3];

    void initGrid() {
        for (int i=0;i<=2;i++) {
            for (int j=0;j<=2;j++) {
                board[i][j] = ' ';
            }
        }
    }

    void traverseGrid() {
        for (int i=0;i<=2;i++) {
            for (int j=0;j<=2;j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    void verifyWinner(char player) {
        for (int i=0;i<=2;i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                System.out.println("Ganador");
            }
        }
        for (int j=0;j<=2;j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                System.out.println("Ganador");
            }
        }

    }

}
