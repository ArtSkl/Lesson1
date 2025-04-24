package korona.bk.lessons.lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        Circle circle1 = new Circle(1.2);
        FigureInterface figure = new Circle(2.2);
        Rollable fig2 = new Circle(3.1);

        if (figure instanceof Circle) {
            Circle figure1 = (Circle) figure;
            figure1.roll();
            figure1.print();
        }


        Picture picture = new Picture("Ван-гог", figure);

        Roller roller = new Roller();
        Printer printer = new Printer();
        roller.roll(circle1);
        printer.print(circle1);


    }


}
// 1 создать класс - принтер, с единственным методом принт, кот будет принимать ФигуреИнтерфейс
// 2 создать класс - кататель - роллер с единственным методом ролл,
// который будет принимать интерфейс Роллабл.