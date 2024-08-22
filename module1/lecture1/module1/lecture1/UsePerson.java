package module1.lecture1.module1.lecture1;

public class UsePerson {
    public static void main(String[] args) {
        Person person1= new Person();
        person1.fullName="Peter";
        person1.age=60;
        person1.move();

        Person person2 =new Person("Oleg", 30);
        person2.talk();


    }
}
