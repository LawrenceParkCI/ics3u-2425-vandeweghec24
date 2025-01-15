package culminating;

import java.awt.Color;

import java.awt.Font;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

import java.awt.event.MouseMotionListener;

import hsa_new.Console;

import java.util.Random;



public class CFTest {



    private static final int ROWS = 6;

    private static final int COLUMNS = 7;

    private static final char EMPTY = ' ';

    private char[][] grid;

    private String currentPlayer;

    private boolean gameWon;

    private Console c;

    private boolean playCPU;

    private int hoverColumn = -1;

    private boolean moveMade = false;



    // Scoreboard Variables

    private int redWins = 0;

    private int yellowWins = 0;

    private int totalGames = 0;



    // Mouse Listeners

    private MouseClickHandler clickHandler;

    private MouseMotionHandler motionHandler;



    public CFTest(Console console) {

        this.c = console;

        grid = new char[ROWS][COLUMNS];

        resetBoard();

        currentPlayer = "Red";

        gameWon = false;

    }



    public static void main(String[] args) throws InterruptedException {

        Console c = new Console(35, 100, 16, "Connect Four");



        c.setTextColor(Color.WHITE);

        c.setTextBackgroundColor(Color.BLACK);

        c.setFont(new Font("ArialRounded", Font.BOLD, 14));



        CFTest game = new CFTest(c);

        game.startGame();

    }



    private void startGame() throws InterruptedException {

        showRules();



        c.println("Choose Game Mode:");

        c.println("1. Play Against Another Player");

        c.println("2. Play Against CPU");

        int choice = c.readInt();

        playCPU = (choice == 2);



        // Add mouse listeners after setup

        addMouseListeners();



        playGame();



        // Remove listeners after the game ends

        removeMouseListeners();

    }



    private void showRules() throws InterruptedException {

        c.clear();

        c.setTextColor(Color.WHITE);

       c.setFont(new Font("ArialROunded", Font.BOLD, 48));

        c.println("=== CONNECT FOUR RULES ===");

        c.println("- Two players take turns dropping colored discs into a 7-column, 6-row grid.");

        c.println("- The first player to connect four of their discs vertically, horizontally, or diagonally wins.");

        c.println("- If the grid is filled without any player connecting four, the game is a draw.");

        c.println("===========================");

        c.println("\nPress any key to continue...");

        c.getChar();

    }



    private void resetBoard() {

        for (int i = 0; i < ROWS; i++) {

            for (int j = 0; j < COLUMNS; j++) {

                grid[i][j] = EMPTY;

            }

        }

        hoverColumn = -1;

        moveMade = false;

        gameWon = false;

        currentPlayer = "Red";

    }



    private void drawBoard() {

        c.clear();



        // Draw Grid

        c.setColor(Color.BLUE);

        c.fillRect(20, 20, COLUMNS * 70, ROWS * 70);



        // Draw tokens

        for (int i = 0; i < ROWS; i++) {

            for (int j = 0; j < COLUMNS; j++) {

                int x = 20 + j * 70;

                int y = 20 + i * 70;

                c.setColor(grid[i][j] == 'R' ? Color.RED : (grid[i][j] == 'Y' ? Color.YELLOW : Color.BLACK));

                c.fillOval(x + 5, y + 5, 60, 60);

                c.setColor(Color.WHITE);

                c.drawOval(x + 5, y + 5, 60, 60);

            }

        }



        // Draw hovering token

        if (hoverColumn >= 0 && hoverColumn < COLUMNS) {

            int hoverX = 20 + hoverColumn * 70 + 5;

            c.setColor(currentPlayer.equals("Red") ? Color.RED : Color.YELLOW);

            c.fillOval(hoverX, 5, 60, 60);

        }



        // Draw visually appealing scoreboard

        drawScoreboard();

    }



    private void drawScoreboard() {

        c.setColor(Color.DARK_GRAY);

        c.fillRect(520, 20, 300, 200);



        c.setColor(Color.WHITE);

        c.setFont(new Font("ArialRounded", Font.BOLD, 18));

        c.drawString("Scoreboard", 580, 50);



        c.setFont(new Font("ArialRounded", Font.BOLD, 16));

        c.setColor(Color.RED);

        c.drawString("Red Wins: " + redWins, 540, 90);



        c.setColor(Color.YELLOW);

        c.drawString("Yellow Wins: " + yellowWins, 540, 130);



        c.setColor(Color.WHITE);

        c.drawString("Total Games: " + totalGames, 540, 170);

    }



    private boolean dropToken(int column) {

        if (column < 0 || column >= COLUMNS || grid[0][column] != EMPTY) {

            return false;

        }

        for (int i = ROWS - 1; i >= 0; i--) {

            if (grid[i][column] == EMPTY) {

                grid[i][column] = currentPlayer.charAt(0);

                return true;

            }

        }

        return false;

    }



    private boolean checkWin() {

        int[][] directions = {{0, 1}, {1, 0}, {1, 1}, {1, -1}};

        for (int row = 0; row < ROWS; row++) {

            for (int col = 0; col < COLUMNS; col++) {

                char token = grid[row][col];

                if (token == EMPTY) continue;



                for (int[] dir : directions) {

                    int count = 0;

                    for (int i = 0; i < 4; i++) {

                        int r = row + i * dir[0];

                        int c = col + i * dir[1];

                        if (r >= 0 && r < ROWS && c >= 0 && c < COLUMNS && grid[r][c] == token) {

                            count++;

                        } else {

                            break;

                        }

                    }

                    if (count == 4) return true;

                }

            }

        }

        return false;

    }



    private void switchPlayer() {

        currentPlayer = currentPlayer.equals("Red") ? "Yellow" : "Red";

    }



    public void playGame() throws InterruptedException {

        while (true) {

            resetBoard();

            drawBoard();



            while (!gameWon && !checkWin()) {

                drawBoard();



                if (currentPlayer.equals("Red") || !playCPU) {

                    c.println(currentPlayer + "'s turn. Hover over a column and click.");

                    while (!moveMade) {

                        Thread.sleep(100);

                    }

                    moveMade = false;



                    if (!dropToken(hoverColumn)) {

                        c.println("Invalid move. Try again.");

                        continue;

                    }

                } else {

                    int column = new Random().nextInt(COLUMNS);

                    dropToken(column);

                    Thread.sleep(1000);

                }



                if (checkWin()) {

                    drawBoard();

                    c.println(currentPlayer + " wins!");



                    if (currentPlayer.equals("Red")) redWins++;

                    else yellowWins++;



                    gameWon = true;

                    totalGames++;

                    break;

                }

                switchPlayer();

            }



            c.println("Play again? (Y/N)");

            if (Character.toLowerCase(c.getChar()) != 'y') break;

        }

    }



    private void addMouseListeners() {

        clickHandler = new MouseClickHandler();

        motionHandler = new MouseMotionHandler();

        c.addMouseListener(clickHandler);

        c.addMouseMotionListener(motionHandler);

    }



    private void removeMouseListeners() {

        c.removeMouseListener(clickHandler);

        c.removeMouseMotionListener(motionHandler);

    }



    private class MouseClickHandler implements MouseListener {

        public void mouseClicked(MouseEvent e) {

            hoverColumn = (e.getX() - 20) / 70;

            moveMade = true;

        }

        public void mousePressed(MouseEvent e) {}

        public void mouseReleased(MouseEvent e) {}

        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}

    }



    private class MouseMotionHandler implements MouseMotionListener {

        public void mouseMoved(MouseEvent e) {

            hoverColumn = (e.getX() - 20) / 70;

            drawBoard();

        }

        public void mouseDragged(MouseEvent e) {}

    }

}

