package korona.bk.mentoring.generic;

import korona.bk.mentoring.oop.Predator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(123);
        List<String> listA = new ArrayList<>();
        // listA.add(123);
        Box<Predator> predatorA = new Box<>();
       //box.setValue(123);
        Integer[] arrInt = {1,2,3,4,5};
        Character[] arrChar = {'a', 'b', 'c'};
        Utils.printArray(arrInt);
        Utils.printArray(arrChar);
    }
}
