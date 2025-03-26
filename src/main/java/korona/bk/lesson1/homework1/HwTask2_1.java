package korona.bk.lesson1.homework1;

import java.util.Arrays;

public class HwTask2_1 {
    public static void main(String[] args) {

        char[][] arrSkl = {
                {'A', 'r', 't'},
                {'S', 'k', 'l'}
        };

        int rows = arrSkl.length;
        int cols = arrSkl[0].length;
        char[] oneDimArr = new char[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDimArr[index++] = arrSkl[i][j];
            }
        }

        for (int i = 1; i < oneDimArr.length; i++) {
            char key = oneDimArr[i];
            int j = i - 1;

            while (j >= 0 && oneDimArr[j] > key) {
                oneDimArr[j + 1] = oneDimArr[j];
                j--;
            }
            oneDimArr[j + 1] = key;
        }

        char[][] arrSklSorted = new char[rows][cols];
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arrSklSorted[i][j] = oneDimArr[index++];
            }
        }

        System.out.print("Одномерный массив: " + Arrays.toString(oneDimArr));
        System.out.print(" ** separator ** " + Arrays.deepToString(arrSklSorted));
    }
}