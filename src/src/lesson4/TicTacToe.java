package lesson4;

/**
 java 1 Homework4
 @author Olga Drevina
 @version 23.01.2022
 */

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    final char CHAR_X = 'x';
    final char CHAR_O = 'o';
    final char CHAR_DOT = '.';
    Random random;
    Scanner scanner;
    char[][] table;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (checkWin(CHAR_X)) {
                System.out.println("YOU WON!!!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(CHAR_O)) {
                System.out.println("AI WON!!!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
        }
        System.out.println("GAME OVER");
        printTable();
    }

    void initTable() {
        for (int x = 0; x < table[0].length; x++) {
            for (int y = 0; y < table[0].length; y++) {
                table[x][y] = CHAR_DOT;
            }
        }
    }

    void printTable() {
        for (int x = 0; x < table[0].length; x++) {
            for (int y = 0; y < table[0].length; y++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1..3]");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = CHAR_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(5);
            y = random.nextInt(5);
        } while (!isCellValid(x, y));
        table[x][y] = CHAR_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == CHAR_DOT;
    }

    boolean checkWin(char ch) {
        boolean resultRow = checkRow(ch);
        if (resultRow)
            return true;
        boolean resultColumn = checkColum(ch);
        if (resultColumn)
            return true;
        boolean resultdiagonal = checkDiagonal(ch);
        if (resultdiagonal)
            return true;
        return false;
    }

    boolean checkRow(char ch) {

        for (int x = 0; x < table[0].length; x++) {
            boolean rowWin = true;
            for (int y = 0; y < table[0].length; y++) {
                if (table[x][y] == ch && rowWin == true) {
                    rowWin = true;
                } else {
                    rowWin = false;
                }
            }
            if (rowWin)
                return true;
        }

//        if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
//        if (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;
//        if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
//        if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
//        if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;
//        if (table[0][0] == ch  && table[1][1] == ch && table[2][2] == ch) return true;
//        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
//        if (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;

        return false;
    }

    boolean checkColum(char ch) {

        for (int y = 0; y < table[0].length; y++) {
            boolean columnWin = true;
            for (int x = 0; x < table[0].length; x++) {
                if (table[x][y] == ch && columnWin == true) {
                    columnWin = true;
                } else {
                    columnWin = false;
                }
            }
            if (columnWin)
                return true;
        }
        return false;
    }

    boolean checkDiagonal(char ch) {
        boolean diagonal1Win = true;
        boolean diagonal2Win = true;
        for (int x = 0; x < table[0].length; x++) {

            for (int y = 0; y < table[0].length; y++) {
                if (x == y) {
                    if (table[x][y] == ch && diagonal1Win == true) {
                        diagonal1Win = true;
                    } else {
                        diagonal1Win = false;
                    }
                }
                if (x + y == table[0].length - 1) {
                    if (table[x][y] == ch && diagonal2Win == true) {
                        diagonal2Win = true;
                    } else {
                        diagonal2Win = false;
                    }
                }
            }
        }
        if (diagonal1Win || diagonal2Win)
            return true;
        return false;
    }

    boolean isTableFull() {
        for (int x = 0; x < table[0].length; x++) {
            for (int y = 0; y < table[0].length; y++) {
                if (table[x][y] == CHAR_DOT) {
                    return false;
                }
            }
        }
        return true;
    }
}

