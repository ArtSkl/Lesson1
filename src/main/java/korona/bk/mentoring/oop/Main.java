package korona.bk.mentoring.oop;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Инкапсуляция -
 * Полиморфизм -
 * Абстракция -
 * Наследование -
 * **/

public class Main {
    public static void main(String[] args) {
        Animal dog = new Predator(11, "Friend", true);
        Animal cat = new Hyaenidae(8, "Asshole", true, false);
        Animal hamster = new Animal(1, "Hamster");
        Plant oak = new Plant();
        oak.setAge(200);
        oak.setType("Tree");
        //oak.age = 12;
        //String tree = "Tree";
        //oak.type = tree;
        System.out.println(oak);
        Animal[] pets = {dog, cat, hamster};
        Animal biggestAge = pets[0];
        for (int i = pets.length - 1; i >= 1; i--) { //цикл
            if (biggestAge.getAge() < pets[i].getAge())
            {
                biggestAge.setAge(pets[i].getAge());

            }
        }
        System.out.println("----   " + biggestAge.getType() + "   ----");
        System.out.println(dog.getAge());
        System.out.println(cat.getAge());
        Predator dog2 = new Predator(dog.getAge(), dog.getType(), true);
        dog2.makeSoundPredator();
        cat.makeSound();
        hamster.makeSound();


    }

}


