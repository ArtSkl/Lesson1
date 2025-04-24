package korona.bk.lessons.lesson2;

public class Circle implements Rollable, FigureInterface {

    private final double radius;
    private final double square;

    public Circle(double radius) {

        this.radius = radius;
        this.square = radius * 3.14;
    }



    public Circle(int diametre) {

        radius = diametre / 2;
        square = diametre * 3.14;
    }


    @Override
    public double getSquare() {
        return radius;
    }

    @Override
    public String print() {
        System.out.println("Circle");
        return "Круг Миша";

    }

    @Override
    public FigureType getType() {
        return FigureType.CIRCLE;
    }

    @Override
    public void roll() {
        System.out.println("Круг катится");
    }
}

