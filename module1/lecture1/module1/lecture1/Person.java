package module1.lecture1.module1.lecture1;

public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("module1.lecture1.module1.lecture1." +fullName+" говорит "
        );
    }

    public void talk() {
        System.out.println("module1.lecture1.module1.lecture1. " +fullName+" говорит "
        );
    }
}
