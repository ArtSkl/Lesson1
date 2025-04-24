package korona.bk.lessons.lesson1;

public class Ihar {

    public static final String NAME = "Ihar";
    public final double height;
    public final String lastName;
    public final Boolean trully;

    public Ihar (double height, String lastName, Boolean trully) {

        this.height = height;
        this.lastName = lastName;
        this.trully = trully;
    }

    public void jump(int heightJump){

        System.out.println(NAME + " " + lastName + " " + "Jumping and pumping till " + heightJump);
    }
    public void sleep(){

        System.out.println(NAME + " sleeps");
    }
}
