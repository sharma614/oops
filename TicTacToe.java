package Pulkit06417711923;
import java.util.Scanner;
public class TicTacToe {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameEnded = false;
        while (!gameEnded) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter row and column (0, 1, or 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (board[row][col] != ' ') {
                System.out.println("Cell already taken! Try again.");
                continue;
            }
            board[row][col] = currentPlayer;
            if (hasWon(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                gameEnded = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        scanner.close();
    }
    static void printBoard() {
        System.out.println("-------------");
        for (char[] row : board) {
            System.out.print("| ");
            for (char cell : row) {
                System.out.print(cell + " | ");
            }
            System.out.println("\n-------------");
        }
    }
    static boolean hasWon(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player &&
                 board[i][1] == player &&
                 board[i][2] == player) ||
                (board[0][i] == player &&
                 board[1][i] == player &&
                 board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) ||
               (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player);
    }
    static boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ')
                    return false;
            }
        }
        return true;
    }
}
