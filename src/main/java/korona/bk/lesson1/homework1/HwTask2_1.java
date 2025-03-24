package korona.bk.lesson1.homework1;

import java.util.Arrays;

public class HwTask2_1 {
    public static void main(String[] args) {


        char[][] arrSkl = {
                {'A', 'r', 't'},
                {'S', 'k', 'l'}
        };


        char[] oneDimArr = {
                arrSkl[0][0], arrSkl[0][1], arrSkl[0][2],
                arrSkl[1][0], arrSkl[1][1], arrSkl[1][2]
        };
        for (int i = 0; i < oneDimArr.length - 1; i++) {
            for (int j = 0; j < oneDimArr.length - i - 1; j++) {
                if (oneDimArr[j] > oneDimArr[j + 1]) {
                    char temp = oneDimArr[j];
                    oneDimArr[j] = oneDimArr[j + 1];
                    oneDimArr[j + 1] = temp;
                }
            }
        }

        System.out.print(oneDimArr);

        char[][] arrSklSorted = {
                {oneDimArr[0], oneDimArr[1], oneDimArr[2]},
                {oneDimArr[3], oneDimArr[4], oneDimArr[5]}
        };
        System.out.print(" ** separator ** " + Arrays.deepToString(arrSklSorted));

    }
}

