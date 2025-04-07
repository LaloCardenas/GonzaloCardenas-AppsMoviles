package com.example.gato;

public class Grid4x4 implements IGrid {

    char[][] board = new char[4][4];

    @Override
    public void initGrid() {
        for (int i=0;i<=3;i++) {
            for (int j=0;j<=3;j++) {
                board[i][j] = ' ';
            }
        }
    }

    @Override
    public void traverseGrid() {
        for (int i=0;i<=3;i++) {
            for (int j=0;j<=3;j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean verifyWinner(char player) {
        for (int i=0;i<=3;i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player && board[i][3] == player) {
                return true;
            }
        }
        for (int j=0;j<=3;j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player && board[3][j] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player && board[3][3] == player) {
            return true;
        }
        if (board[0][3] == player && board[1][2] == player && board[2][1] == player && board[3][0] == player) {
            return true;
        }
        return false;
    }
}
