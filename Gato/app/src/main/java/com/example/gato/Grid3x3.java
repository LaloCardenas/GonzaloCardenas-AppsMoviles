package com.example.gato;

public class Grid3x3 implements IGrid {

    char[][] board = new char[3][3];

    @Override
    public void initGrid() {
        for (int i=0;i<=2;i++) {
            for (int j=0;j<=2;j++) {
                board[i][j] = ' ';
            }
        }
    }

    @Override
    public void traverseGrid() {
        for (int i=0;i<=2;i++) {
            for (int j=0;j<=2;j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean verifyWinner(char player) {
        for (int i=0;i<=2;i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        for (int j=0;j<=2;j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

}
