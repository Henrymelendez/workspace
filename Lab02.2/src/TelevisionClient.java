public class TelevisionClient {


    public static void main(String[] args) {

        Television tv1 = new Television("samsung", 32);
        Television tv2 = new Television("Sony", 40);
        Television tv3 = new Television();
        Television tv4 = new Television("Sony", 40);


        tv1.turnOn();
        tv1.turnOff();
        tv2.turnOn();
        tv2.turnOff();
        tv3.turnOn();
        tv3.turnOff();


        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println(tv4);
    }

}
