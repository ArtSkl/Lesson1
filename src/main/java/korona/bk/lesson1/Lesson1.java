package korona.bk.lesson1;

public class Lesson1 {

    // int[] array = new int[1,2,3,5,4,6];

    public static void main(String[] args) {
        System.out.println("Hello Ihar");
        String name = Ihar.NAME;
       // String height = Ihar.height;
        Ihar ihar1 = new Ihar(166, "Mal", true);
        Ihar ihar2 = new Ihar(188, "Ter", true);
        Ihar artsem = new Ihar (186, "Skl", false);
        ihar1.jump((int) (ihar1.height*0.77));
        ihar2.jump((int) (ihar2.height*0.79));
        artsem.jump((int) (artsem.height*0.68));
        ihar2.sleep();
        ihar1.sleep();
        artsem.sleep();

        // отсортировать массив целых чисел не создавая новый массив
        // для типа чар отсортировать массив и в двухмерном массиве можно создавать новый массив
        // две разные программы запускаться из метода мейн
        // результат вывести в консоль

    }
}
