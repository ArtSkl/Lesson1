package korona.bk.lesson2;

public class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    };

    public Circle(int diametre) {
        radius = diametre / 2;
    }

}
