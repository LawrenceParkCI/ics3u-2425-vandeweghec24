package culminating

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import hsa_new.Console;
import java.util.Random;

/**
 * Description: This Java program implements an interactive Connect Four game with two-player and CPU modes, featuring dynamic board rendering, mouse-based interaction, win and draw detection, a scoreboard, and replay options, all displayed in a console-based UI.
 * Date: Jan. 9, 2024
 * @author Caden Vandeweghe
 */

public class CFTest {

	/**
	 * Entry point to the program
	 * @param args unused
	 */

	// Constants for game dimensions and tokens
	private static final int ROWS = 6; // Number of rows in the Connect Four grid
	private static final int COLUMNS = 7; // Number of columns in the grid
	private static final char EMPTY = ' '; // Character representing an empty cell

	// Game state variables
	private char[][] grid; // 2D array to represent the grid state
	private String currentPlayer; // Tracks the current player's turn ("Red" or "Yellow")
	private boolean gameWon; // Boolean to check if the game is won
	private Console c; // Console object for game interface
	private boolean playCPU; // Boolean to determine if CPU is enabled
	private int hoverColumn = -1; // Current column being hovered by the player
	private boolean moveMade = false; // Tracks if a move has been made
	private int[][] winningCoordinates; // Coordinates of the winning line

	// Scoreboard variables
	private int redWins = 0; // Number of wins by Red player
	private int yellowWins = 0; // Number of wins by Yellow player
	private int totalGames = 0; // Total games played

	// Mouse event handlers
	private MouseClickHandler clickHandler; // Handles mouse click events
	private MouseMotionHandler motionHandler; // Handles mouse movement events

	// Constructor to initialize the game state
	public CFTest(Console console) {
		this.c = console; // Assigns the Console instance
		grid = new char[ROWS][COLUMNS]; // Initializes the grid
		resetBoard(); // Resets the board to its default state
		currentPlayer = "Red"; // Sets the starting player to Red
		gameWon = false; // Initializes the gameWon flag to false
	
    }

	// Main method to launch the game
	public static void main(String[] args) throws InterruptedException {
		Console c = new Console(35, 100, 16, "Connect Four"); // Creates a new console
		c.setTextColor(Color.WHITE); // Sets default text color
		c.setTextBackgroundColor(Color.BLACK); // Sets background color
		c.setFont(new Font("ArialRounded", Font.BOLD, 16)); // Sets font style and size

		CFTest game = new CFTest(c); // Initializes the game instance
		game.startGame(); // Starts the game

	}

	// Method to display the rules and let the user select a game mode
	private void startGame() throws InterruptedException {
		showRules(); // Displays the game rules

		boolean validChoice = false; // Boolean to track valid input
		while (!validChoice) {
			c.setTextColor(Color.WHITE);
			c.println("Choose Game Mode:");
			Thread.sleep(1000);
			c.println("1. Play Against Another Player");
			Thread.sleep(1000);
			c.println("2. Play Against CPU");
			int choice = c.readInt(); // Reads the user's choice

			if (choice == 1) { // If user selects player vs. player mode
				playCPU = false;
				validChoice = true;
			} else if (choice == 2) { // If user selects player vs. CPU mode
				playCPU = true;
				validChoice = true;
			} else {
				showErrorPage(); // Displays an error page for invalid input

			}

		}

		addListeners(); // Adds mouse event listeners
		playGame(); // Starts the game loop
		removeListeners(); // Removes listeners after the game ends

	}
	// Displays the game rules to the user
	private void showRules() throws InterruptedException {
		c.clear();
		c.setTextColor(Color.WHITE);
		c.setFont(new Font("ArialRounded", Font.BOLD, 16));
		c.setTextColor(Color.YELLOW);
		c.print("CONNECT");
		c.setTextColor(Color.RED);
		c.print(" FOUR\n");
		Thread.sleep(1000);
		c.setTextColor(Color.WHITE);
		c.print("\nWelcome to");
		c.setTextColor(Color.YELLOW);
		Thread.sleep(500);
		c.print(" Connect");
		c.setTextColor(Color.RED);
		Thread.sleep(500);
		c.print(" Four");
		c.setTextColor(Color.WHITE);
		c.print("!");
		Thread.sleep(1000);
		c.println("\n1. Players take turns dropping checkers into one of the columns on the grid.");
		Thread.sleep(1000);
		c.println("2. The first player to align four discs horizontally, vertically, or diagonally wins.");
		Thread.sleep(1000);
		c.println("3. Use the mouse to drag the checkers to the column you want to select.");
		Thread.sleep(1000);
		c.println("4. Click on the keypad to drop your disc.");
		Thread.sleep(1000);
		c.println("5. If the grid fills up without a winner, it's a draw.");
		Thread.sleep(1000);
		c.println("6. After a completed game, press 'Y' to play again or 'N' to quit.");
		Thread.sleep(1000);
		c.println("\nGood luck and have fun!");
		Thread.sleep(1000);
		c.println("\nPress any letter or number key to continue...\n");
		c.getChar(); // Waits for user input

	}

	// Displays an error message for invalid input
	private void showErrorPage() {
		c.clear();
		c.setFont(new Font("ArialRounded", Font.BOLD, 16));
		c.setTextColor(Color.RED);
		c.println("Error: Invalid choice!");
		c.println("Please try again.");
		c.println("\nPress any letter or number key to return to the menu...");
		c.getChar();
		c.clear();

	}

	// Resets the game board to its initial empty state
	private void resetBoard() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				grid[i][j] = EMPTY; // Sets all cells to empty

			}

		}

		hoverColumn = -1; // Resets the hover column
		moveMade = false; // Resets move tracking
		gameWon = false; // Resets the gameWon flag
		currentPlayer = "Red"; // Resets to the starting player
		winningCoordinates = null; // Clears winning line coordinates
		drawBoard(); // Redraws the board

	}

	// Draws the game board and tokens
	private void drawBoard() {
		c.clear();

		// Draw the grid background
		c.setColor(Color.BLUE);
		c.fillRect(20, 20, COLUMNS * 70, ROWS * 70);

		// Draw tokens in the grid
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				int x = 20 + j * 70; // Calculates x-coordinate
				int y = 20 + i * 70; // Calculates y-coordinate
				if (winningCoordinates != null && isPartOfWinningLine(i, j)) {

					// Highlights the winning line in lighter colors
					c.setColor(grid[i][j] == 'R' ? new Color(255, 150, 150) : new Color(255, 255, 150));
				
                } else {
                    
					// Sets the appropriate token color
					c.setColor(grid[i][j] == 'R' ? Color.RED : (grid[i][j] == 'Y' ? Color.YELLOW : Color.BLACK));

				}

				c.fillOval(x + 5, y + 5, 60, 60); // Draws the token
				c.setColor(Color.WHITE);
				c.drawOval(x + 5, y + 5, 60, 60); // Outlines the token

			}

		}

		// Draw hovering token

		if (hoverColumn >= 0 && hoverColumn < COLUMNS) {
			int hoverX = 20 + hoverColumn * 70 + 5;
			c.setColor(currentPlayer.equals("Red") ? Color.RED : Color.YELLOW);
			c.fillOval(hoverX, 5, 60, 60);

		}

		// Draw scoreboard and instructions
		drawScoreboard();

	}

	// Checks if a cell is part of the winning line
	private boolean isPartOfWinningLine(int row, int col) {
		if (winningCoordinates == null) return false;
		for (int[] coord : winningCoordinates) {
			if (coord[0] == row && coord[1] == col) {
				return true;

			}

		}

		return false;

	}

	// Displays the scoreboard and instructions
	private void drawScoreboard() {
		c.setColor(Color.DARK_GRAY);
		c.fillRect(520, 20, 300, 300);
		c.setColor(Color.WHITE);
		c.setFont(new Font("ArialRounded", Font.BOLD, 18));
		c.drawString("Scoreboard", 540, 50);

		c.setFont(new Font("ArialRounded", Font.BOLD, 16));
		c.setColor(Color.RED);
		c.drawString("Red Wins: " + redWins, 540, 90);

		c.setColor(Color.YELLOW);
		c.drawString("Yellow Wins: " + yellowWins, 540, 130);
		c.setColor(Color.WHITE);
		c.drawString("Total Games: " + totalGames, 540, 170);

		// Display instructions above turn indicator
		c.drawString("Press 'Y' to play again, 'N' to quit.", 540, 210);

		// Highlight current turn and display in respective color
		c.setFont(new Font("ArialRounded", Font.BOLD, 16));
		if (currentPlayer.equals("Red")) {
			c.setColor(Color.RED);
			c.drawString("Red's Turn", 540, 250);

		} else {
			c.setColor(Color.YELLOW);
			c.drawString("Yellow's Turn", 540, 250);

		}

	}

	// Attempts to drop a token into the specified column
	private boolean dropToken(int column) {
		if (column < 0 || column >= COLUMNS || grid[0][column] != EMPTY) {
			return false; // Invalid move if column is out of bounds or full

		}

		for (int i = ROWS - 1; i >= 0; i--) {
			if (grid[i][column] == EMPTY) {
				grid[i][column] = currentPlayer.charAt(0); // Places the token
				return true;

			}

		}

		return false;

	}

	// Checks if there is a winning condition on the board
	private boolean checkWin() {
		int[][] directions = {{0, 1}, {1, 0}, {1, 1}, {1, -1}}; // Directions: horizontal, vertical, diagonal
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLUMNS; col++) {
				char token = grid[row][col];
				if (token == EMPTY) continue; // Skip empty cells

				for (int[] dir : directions) {
					int count = 0;
					int[][] tempCoordinates = new int[4][2]; // Temporary array to track winning line
					for (int i = 0; i < 4; i++) {
						int r = row + i * dir[0];
						int c = col + i * dir[1];
						if (r >= 0 && r < ROWS && c >= 0 && c < COLUMNS && grid[r][c] == token) {
							tempCoordinates[count][0] = r;
							tempCoordinates[count][1] = c;
							count++;

						} else {

							break;

						}

					}

					if (count == 4) { // If 4 in a row is detected
						winningCoordinates = tempCoordinates;
						return true;

					}

				}

			}

		}

		return false;

	}

	// Switches the turn to the other player
	private void switchPlayer() {
		currentPlayer = currentPlayer.equals("Red") ? "Yellow" : "Red";

	}

	// Checks if the board is full (no empty cells)
	private boolean isBoardFull() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				if (grid[i][j] == EMPTY) {
					return false; // If any cell is empty, the board is not full

				}

			}

		}

		return true; // If no empty cells, the board is full

	}

	// Main game loop
	public void playGame() throws InterruptedException {
		while (true) {
			resetBoard();
			drawBoard();

			while (!gameWon) {
				drawBoard();

				// Check if the board is full (draw condition)
				if (isBoardFull()) {
					drawBoard();
					c.setTextColor(Color.WHITE);
					c.println("The game is a draw!");
					totalGames++; // Increment the total games counter
					Thread.sleep(2000);
					showWinningLineAndReplay(); // Prompt replay options
					break;

				}

				// CPU turn logic
				if (playCPU && currentPlayer.equals("Yellow")) {
					Thread.sleep(1000); // Pause before CPU places a token
					int column = new Random().nextInt(COLUMNS);
					while (!dropToken(column)) {
						column = new Random().nextInt(COLUMNS);

					}

					if (checkWin()) {
						drawBoard();
						c.println(currentPlayer + " wins!");
						yellowWins++;
						gameWon = true;
						totalGames++;
						showWinningLineAndReplay();
						break;

					}

					switchPlayer();

				} else {

					// Player turn logic
					c.setTextColor(Color.WHITE);
					c.println(currentPlayer + "'s turn. Hover over a column and click.");

					while (!moveMade) {
						Thread.sleep(100);

					}

					moveMade = false;

					if (!dropToken(hoverColumn)) {
						c.setTextColor(Color.RED);
						c.println("Invalid move. Try again.");
						Thread.sleep(2000);
						continue;

					}

					if (checkWin()) {
						drawBoard();
						c.println(currentPlayer + " wins!");
						if (currentPlayer.equals("Red")) redWins++;
						else yellowWins++;
						gameWon = true;
						totalGames++;
						showWinningLineAndReplay();
						break;

					}

					switchPlayer();

				}

			}

		}

	}

	// Displays the winning line and prompts replay options
	private void showWinningLineAndReplay() throws InterruptedException {
		drawBoard();
		c.setTextColor(Color.WHITE);
		c.println("Press 'Y' to play again, 'N' to quit.");
		char choice = Character.toLowerCase(c.getChar());
		if (choice == 'y') {
			gameWon = false;
			resetBoard();

		} else if (choice == 'n') {

			System.exit(0); // Terminates the program

		} else {

			c.setTextColor(Color.RED); // Display error message for invalid input
			c.println("Error: Invalid choice!");
			Thread.sleep(2000);
			showWinningLineAndReplay(); // Recursively call to prompt again

		}

	}

	// Adds mouse listeners for user interaction
	private void addListeners() {
		clickHandler = new MouseClickHandler();
		motionHandler = new MouseMotionHandler();
		c.addMouseListener(clickHandler);
		c.addMouseMotionListener(motionHandler);

	}

	// Removes mouse listeners when the game ends
	private void removeListeners() {
		c.removeMouseListener(clickHandler);
		c.removeMouseMotionListener(motionHandler);

	}

	// Handles mouse click events
	private class MouseClickHandler implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			hoverColumn = (e.getX() - 20) / 70; // Determines the column clicked
			moveMade = true; // Indicates that a move was made

		}

		public void mousePressed(MouseEvent e) {}

		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {}

		public void mouseExited(MouseEvent e) {}

	}

	// Handles mouse motion events
	private class MouseMotionHandler implements MouseMotionListener {
		public void mouseMoved(MouseEvent e) {
			hoverColumn = (e.getX() - 20) / 70; // Determines the column hovered
			drawBoard(); // Redraws the board to show hovering token

		}

		public void mouseDragged(MouseEvent e) {}

	}

}
