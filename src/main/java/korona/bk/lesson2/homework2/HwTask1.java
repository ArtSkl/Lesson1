package korona.bk.lesson2.homework2;

public class HwTask1 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        int n = 6;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == n) {
                    System.out.println("Индексы: [" + i + ", " + j + "]");
                }
            }
        }
    }
}

