package korona.bk.lesson1;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        sortIntegerArray();
        sortCharArray();
    }

    public static void sortIntegerArray() {
        int[] array = {8, 6, 9, 7, 4, 9, 0};
        System.out.println("Tel No b4 sort: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Tel No after sort: " + Arrays.toString(array));
    }

    public static void sortCharArray() {
        char[] charArray = {'A', 'r', 't', 's', 'e', 'm', 'O', 'h', 'u', 'e', 'n', 'e', 'n'};
        System.out.println("Artsem Ohuenen b4 sort: " + Arrays.toString(charArray));
        Arrays.sort(charArray);
        System.out.println("Artsem Ohuenen after sort: " + Arrays.toString(charArray));
    }
}