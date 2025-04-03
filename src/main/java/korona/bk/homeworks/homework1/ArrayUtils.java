package korona.bk.homeworks.homework1;

public class ArrayUtils {
    public static void printIntArray(int[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");

    }

    public static void printCharArray(char[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }

    public static void printChar2DArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[");
            for (int j = 0; j < array[i].length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(array[i][j]);
            }
            System.out.println("]");
        }
    }

    public static void arrCharSort(char[] arrChar) {
        for (int i = 0; i < arrChar.length - 1; i++) {
            for (int j = 0; j < arrChar.length - i - 1; j++) {
                if (arrChar[j] > arrChar[j + 1]) {
                    char temp =  arrChar[j];
                    arrChar[j] = arrChar[j + 1];
                    arrChar[j + 1] = temp;
                }
            }
        }
    }

    public static void arrIntSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}

