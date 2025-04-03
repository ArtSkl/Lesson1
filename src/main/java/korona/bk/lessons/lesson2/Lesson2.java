package korona.bk.lessons.lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        Circle circle1 = new Circle(1.2);
        Figure figure = new Circle(2);


        Picture picture = new Picture("Van Gogh", figure);

        picture.print();
    }


}
