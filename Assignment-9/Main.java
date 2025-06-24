// TicTacToe.java
import java.util.Scanner; // Import the Scanner class to read user input

public class TicTacToe {

    // The game board, represented as a 2D character array
    private static char[][] board = new char[3][3];

    // Current player's mark ('X' or 'O')
    private static char currentPlayer;

    // Scanner object for reading user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize the game board and set the starting player
        initializeBoard();
        currentPlayer = 'X'; // Player X starts the game

        boolean gameWon = false;
        boolean gameDraw = false;

        // Game loop: continues until there's a win or a draw
        while (!gameWon && !gameDraw) {
            printBoard(); // Display the current state of the board
            System.out.println("Player " + currentPlayer + ", enter your move (row and column, e.g., 1 2): ");

            int row = -1;
            int col = -1;
            boolean validInput = false;

            // Loop to get valid input from the current player
            while (!validInput) {
                try {
                    row = scanner.nextInt() - 1; // Subtract 1 to convert to 0-indexed array
                    col = scanner.nextInt() - 1; // Subtract 1 to convert to 0-indexed array

                    // Check if the entered position is valid and empty
                    if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                        validInput = true; // Input is valid, exit loop
                    } else {
                        System.out.println("This move is not valid. Please try again.");
                    }
                } catch (java.util.InputMismatchException e) {
                    // Handle cases where non-integer input is given
                    System.out.println("Invalid input. Please enter two numbers for row and column.");
                    scanner.next(); // Consume the invalid input to prevent infinite loop
                    scanner.next(); // Consume the second part of invalid input
                }
            }

            // Place the current player's mark on the board
            board[row][col] = currentPlayer;

            // Check if the current player has won
            gameWon = checkForWin();
            if (gameWon) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
            } else {
                // If no win, check for a draw
                gameDraw = checkForDraw();
                if (gameDraw) {
                    printBoard();
                    System.out.println("It's a draw!");
                } else {
                    // If no win or draw, switch to the other player
                    switchPlayer();
                }
            }
        }
        scanner.close(); // Close the scanner to release system resources
    }

    /**
     * Initializes the 3x3 game board with empty cells, represented by '-'.
     */
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-'; // Set each cell to empty
            }
        }
    }

    /**
     * Prints the current state of the Tic-Tac-Toe board to the console.
     * Displays row and column numbers for easier user input.
     */
    private static void printBoard() {
        System.out.println("\n-------------"); // Top border
        System.out.println("  1 2 3"); // Column numbers
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " |"); // Row number and left border
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " "); // Print the cell content
            }
            System.out.println("|"); // Right border
        }
        System.out.println("-------------"); // Bottom border
    }

    /**
     * Checks if the current player has won the game.
     * A win occurs if three of the current player's marks are in a row, column, or diagonal.
     *
     * @return true if the current player has won, false otherwise.
     */
    private static boolean checkForWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }

        // Check diagonals
        // Top-left to bottom-right
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        // Top-right to bottom-left
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false; // No win found
    }

    /**
     * Checks if the game is a draw.
     * A draw occurs if all cells on the board are filled and no player has won.
     *
     * @return true if the game is a draw, false otherwise.
     */
    private static boolean checkForDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false; // Found an empty cell, so it's not a draw yet
                }
            }
        }
        return true; // All cells are filled, and no win was detected, so it's a draw
    }

    /**
     * Switches the current player from 'X' to 'O' or 'O' to 'X'.
     */
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}