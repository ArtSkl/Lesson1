package korona.bk.mentoring.collection;

import korona.bk.mentoring.oop.Animal;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer i = 5;
        List<Integer> array = new ArrayList<>(); // динамический массив быстрый доступ по индексу (быстро достаёт)
        List<String> listB = new LinkedList<>(); // двусвязный список используется для быстрой вставки и удаления элементов
        Set<Integer> setI = new HashSet<>(); // собирает множество не упорядоченно и хранит и выводит неупорядоченно (не сохраняет порядок добавления)
        setI.add(1);
        setI.add(5);
        setI.add(2);
        setI.add(21);
        setI.add(51);
        setI.add(23);
        setI.add(11);
        setI.add(533);
        setI.add(25);
        System.out.println(setI);
        Set<Integer> setJ = new LinkedHashSet<>(); // собирает множество упорядоченно по порядку ввода и хранит и выводит упорядоченно по порядку ввода (сохраняет порядок добавления)
        setJ.add(1);
        setJ.add(5);
        setJ.add(2);
        System.out.println(setJ);
        Set<Integer> setK = new TreeSet<>(); // собирает множество упорядоченно по мере возрастания значений и хранит и выводит упорядоченно по мере возрастания значений (не сохраняет порядок добавления)
        setK.add(1);
        setK.add(5);
        setK.add(2);
        setK.add(21);
        setK.add(51);
        setK.add(23);
        setK.add(11);
        setK.add(533);
        setK.add(25);
        System.out.println(setK);
        Map<Character, String> mapA = new HashMap<>();
        mapA.put('a',"Eugene");
        mapA.put('B',"Eugene");
        System.out.println(mapA);
        Map<Character, String> mapB = new LinkedHashMap<>();
        mapB.put('a',"Eugene");
        mapB.put('B',"Eugene");
        System.out.println(mapB);
        Map<Character, String> mapC = new TreeMap<>();
        mapC.put('a',"Eugene");
        mapC.put('B',"Eugene");
        System.out.println(mapC);
        Map<Character, String> mapD = new Hashtable<>();
        mapD.put('a',"Eugene");
        mapD.put('B',"Eugene");
        System.out.println(mapD);
        Set<Animal> setAnimal1 = new HashSet<>();
        setAnimal1.add(new Animal(12, "Kote"));
        setAnimal1.add(new Animal(12, "Kote"));
        System.out.println(setAnimal1);
        Set<Animal> setAnimal2 = new TreeSet<>();
        setAnimal2.add(new Animal(122, "a"));
        setAnimal2.add(new Animal(13, "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ"));
        System.out.println(setAnimal2);

    }
}
