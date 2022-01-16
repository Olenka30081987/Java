package lesson3;

import java.util.Arrays;

/**
 java 1 Homework3
 @author Olga Drevina
 @version 19.01.2022
 */

public class Homework3 {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println(Arrays.toString(returnArray(5, 80)));
    }

    static void invertArray() {
        int[] arr = {1, 0, 0, 0, 1, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 4) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] returnArray(int len, int intivialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = intivialValue;
        }
        return arr;
    }
}

