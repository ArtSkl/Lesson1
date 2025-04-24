package korona.bk.lessons.lesson3;

import java.util.Objects;

public class Tree {
    private final int age;
    private final String name;
    private final double height;

    public Tree(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;

    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return age == tree.age && Double.compare(height, tree.height) == 0 && Objects.equals(name, tree.name);
    }


/*
    public static String toString(Tree tree1) {
        return "Tree{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';*/
    //}
}



