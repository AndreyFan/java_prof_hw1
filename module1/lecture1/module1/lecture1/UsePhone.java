package module1.lecture1.module1.lecture1;

public class UsePhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone(672434548, "samsung", 190);
        Phone phone2 = new Phone(662154548, "iphone", 175);
        Phone phone3 = new Phone(632412748, "panasonic", 180);
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        System.out.println();

        phone1.receiveCall("Peter");
        phone2.receiveCall("Olga");
        phone3.receiveCall("Ilia");

        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
    }

}
