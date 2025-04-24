package korona.bk.homeworks.homework1;


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

        for (int m = 0; m < rows; m++) {
            for (int n = 0; n < cols; n++) {
                oneDimArr[index++] = arrSkl[m][n];
            }
        }

        for (int m = 1; m < oneDimArr.length; m++) {
            char key = oneDimArr[m];
            int n = m - 1;

            while (n >= 0 && oneDimArr[n] > key) {
                oneDimArr[n + 1] = oneDimArr[n];
                n--;
            }
            oneDimArr[n + 1] = key;
        }

        char[][] arrSklSorted = new char[rows][cols];
        index = 0;
        for (int m = 0; m < rows; m++) {
            for (int n = 0; n < cols; n++) {
                arrSklSorted[m][n] = oneDimArr[index++];
            }
        }



        System.out.print("Одномерный массив: ");
        ArrayUtils.printCharArray(oneDimArr);
        System.out.print(" ** separator ** ");
        ArrayUtils.printChar2DArray(arrSklSorted);
    }


}