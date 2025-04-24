package korona.bk.mentoring.generic;

import korona.bk.mentoring.oop.Animal;

public class Box<T extends Animal> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
