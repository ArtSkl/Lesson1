package korona.bk.lesson1.homework1;

import java.util.Arrays;

public class HwTask1_1 {

    public static void main(String[] args) {
        char[] charArray = {'A', 'r', 't', 's', 'e', 'm', 'O', 'h', 'u', 'e', 'n', 'e', 'n'};

        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(charArray));

    }
}

