public class ComputerClient {

    public static void main(String[] args) {

        ComputerUsingIntPrimatives p1 = new ComputerUsingIntPrimatives();
        ComputerUsingLongPrimatives p2 = new ComputerUsingLongPrimatives();

        System.out.println("int Primitives");

        System.out.println(p1.add(1,4));
        System.out.println(p1.subtract(5,3));
        System.out.println(p1.multiply(2,2));
        System.out.println(p1.divide(10,5));

        System.out.println("Long Primitives");
        System.out.println(p2.add(5,3));
        System.out.println(p2.subtract(10, 2));

    }
}
