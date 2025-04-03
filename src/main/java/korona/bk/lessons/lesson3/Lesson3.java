package korona.bk.lessons.lesson3;

public class Lesson3 {
    public static void main(String[] args) {
       // Converter.converterIntToInteger(1204);

        Tree tree1 = new Tree(100, "ber", 100);
        Tree tree2 = new Tree(100, "ber", 100);
        System.out.println("tree1==tree2 :" + (tree1==tree2));
        System.out.println("tree1 equals tree2 :" + (tree1.equals(tree2)));

        //System.out.println("tree1==tree2 :" + (tree1.name  == tree2.name) + (tree1.age  == tree2.age) + (tree1.height  == tree2.height));

        //System.out.println("tree1 :" + tree1.toString(tree1));

        Oak oak1 = new Oak (100, "Oak1", 100);

       //System.out.println(Oak.toString(oak1));
    }
}
