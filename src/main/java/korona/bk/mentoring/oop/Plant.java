package korona.bk.mentoring.oop;

public class Plant {
    private int age;
    private String type;

    public Plant() {
    }

    public Plant(int age, String type) {
        this.age = age;
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            //System.out.println("Врунишка");
            throw new RuntimeException("Bull Shit");
        } else {
            this.age = age;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}
