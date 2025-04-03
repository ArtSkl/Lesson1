package korona.bk.lessons.lesson2;

public class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {

        this.radius = radius;
    };

    public Circle(int diametre) {

        radius = diametre / 2;
    }

    @Override
    public String print() {
        System.out.println("Circle");
        return null;

    }

   /* public void roll; {
        System.out.println("Circle rolls");*/
    }


