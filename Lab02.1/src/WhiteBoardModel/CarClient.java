package WhiteBoardModel;

public class CarClient {

    public static void main(String[] args) {

        Car c1 = new Car("Honda", "Civic", 1999);
        Car c2 = new Car("Ford", "F-150", 2003);

        c1.turnOn();
        c1.drive();
        c1.turnOff();

        System.out.println();

        c2.turnOn();
        c2.drive();
        c2.turnOff();

    }
}
