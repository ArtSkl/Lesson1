package korona.bk.lessons.lesson2;

public class Triangle implements FigureInterface {


    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public String print() {
        return "Треугольник";
    }

    @Override
    public FigureType getType() {
        return null;
    }
}
