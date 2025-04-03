package korona.bk.lessons.lesson3;

public class Oak extends Tree {

private String type = "Old and Dry";

    private String getType () {
        return type;
    };

    public Oak(int age, String name, double height) {
        super(age, name, height);
    };

}
