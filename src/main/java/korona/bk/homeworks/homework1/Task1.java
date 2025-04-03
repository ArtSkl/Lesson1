package korona.bk.homeworks.homework1;

public class Task1 {

    public static void main(String[] args) {

        int[] array = {8, 6, 9, 7, 4, 9, 0};
        ArrayUtils.printIntArray(array);
        ArrayUtils.arrIntSort(array);
        ArrayUtils.printIntArray(array);

        char[] charArray = {'A', 'r', 't', 's', 'e', 'm', 'O', 'h', 'u', 'e', 'n', 'e', 'n'};
        System.out.println("Artsem Ohuenen b4 sort: ");
        ArrayUtils.printCharArray(charArray);
        ArrayUtils.arrCharSort(charArray);
        System.out.println("Artsem Ohuenen after sort: ");
        ArrayUtils.printCharArray(charArray);

}
}