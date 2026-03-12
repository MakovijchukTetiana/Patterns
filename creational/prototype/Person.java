package creational.prototype;

public class Person implements Prototype {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public Prototype doClone() {
        return new Person(name);
    }

    public String toString() {
        return "Цю людину звати " + name;
    }
}