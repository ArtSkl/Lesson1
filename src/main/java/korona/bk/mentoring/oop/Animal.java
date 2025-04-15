package korona.bk.mentoring.oop;

public class Animal {
    private int age;
    private String type;

    public Animal() {
    }

    public Animal(int age, String type) {
        this.age = age;
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void makeSound(){
        System.out.println("Animal Sound");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printPropertiesAnimal(int age){
        System.out.println(age);
    }

    public void printPropertiesAnimal(String type){
        System.out.println(type);
    }

    public void printPropertiesAnimal(int age, String type){
        System.out.println(age + " " + type);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}
