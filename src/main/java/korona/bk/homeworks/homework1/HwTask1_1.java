package korona.bk.homeworks.homework1;


public class HwTask1_1 {

    public static void main(String[] args) {

        char[] charArray = {'A', 'r', 't', 's', 'e', 'm', 'O', 'h', 'u', 'e', 'n', 'e', 'n'};

        ArrayUtils.arrCharSort(charArray);

        System.out.println("Отсортированный массив: ");
        ArrayUtils.printCharArray(charArray);

    }
}

