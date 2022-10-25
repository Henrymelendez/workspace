public class TelevisionValidationTest {

    public static void main(String[] args) {

        Television tv1 = new Television();
        tv1.setVolume(1);
        System.out.println(tv1.getVolume());
        tv1.setVolume(101);
        System.out.println();

        tv1.setBrand("Vizio");
        tv1.setBrand("LG");
        System.out.println();
        tv1.mute();
        System.out.println(tv1.getVolume());

        tv1.mute();
        System.out.println(tv1.getVolume());

    }
}
