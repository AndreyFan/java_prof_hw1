package module1.lecture1.module1.lecture1;

public class Phone {
    Integer number;
    String model;
    int weight;

    public Phone( Integer number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String name) {
        System.out.println("Звонит "+name);
    }

    public Integer getNumber() {
        return number;
    }
}
