import java.util.Scanner;

public class TurtleGame {

    private static char[][] board = new char[5][5];

    private static final int UP = 0;
    private static final int RIGHT = 1;
    private static final int DOWN = 2;
    private static final int LEFT = 3;

    private static int direction = UP;

    private static final char UP_DIR = '^';
    private static final char DOWN_DIR = 'v';
    private static final char LEFT_DIR = '<';
    private static final char RIGHT_DIR = '>';

    private static int xCoord = 0;
    private static int yCoord = 0;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        initialize();
        System.out.println("Игра 'Черепашка' началась! Команды: move, turn left, turn right, print, quit.");
        printBoard();

        while (inp.hasNextLine()) {
            String command = inp.nextLine().toLowerCase();

            if (command.equals("print")) {
                printBoard();
            } else if (command.equals("move")) {
                move();
                printBoard();
            } else if (command.equals("turn left")) {
                turnLeft();
                updateTurtleIcon();
                printBoard();
            } else if (command.equals("turn right")) {
                turnRight();
                updateTurtleIcon();
                printBoard();
            } else if (command.equals("quit")) {
                System.out.println("Пока!");
                break;
            } else {
                System.out.println("Неизвестная команда. Попробуйте: move, turn left, turn right, print, quit.");
            }
        }
    }

    private static void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void updateTurtleIcon() {
        if (direction == UP) board[yCoord][xCoord] = UP_DIR;
        else if (direction == DOWN) board[yCoord][xCoord] = DOWN_DIR;
        else if (direction == LEFT) board[yCoord][xCoord] = LEFT_DIR;
        else if (direction == RIGHT) board[yCoord][xCoord] = RIGHT_DIR;
    }

    private static void turnRight() {
        if (direction == UP) {
            direction = RIGHT;
        } else if (direction == RIGHT) {
            direction = DOWN;
        } else if (direction == DOWN) {
            direction = LEFT;
        } else if (direction == LEFT) {
            direction = UP;
        }
    }

    private static void turnLeft() {
        if (direction == UP) {
            direction = LEFT;
        } else if (direction == LEFT) {
            direction = DOWN;
        } else if (direction == DOWN) {
            direction = RIGHT;
        } else if (direction == RIGHT) {
            direction = UP;
        }
    }

    private static void move() {
        board[yCoord][xCoord] = '.';

        if (direction == UP) {
            if (yCoord > 0) yCoord--;
            else System.out.println("СТЕНАААААААААААА");
        } else if (direction == DOWN) {
            if (yCoord < 4) yCoord++;
            else System.out.println("СТЕНАААААААААААА");
        } else if (direction == LEFT) {
            if (xCoord > 0) xCoord--;
            else System.out.println("СТЕНАААААААААААА");
        } else if (direction == RIGHT) {
            if (xCoord < 4) xCoord++;
            else System.out.println("СТЕНАААААААААААА");
        }

        updateTurtleIcon();
    }

    private static void initialize() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = '.';
            }
        }

        xCoord = (int) (Math.random() * 5);
        yCoord = (int) (Math.random() * 5);
        direction = UP;
        updateTurtleIcon();
    }
}