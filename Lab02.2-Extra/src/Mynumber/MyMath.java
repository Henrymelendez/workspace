package Mynumber;

public class MyMath {

    public static final int MINIMUM_AGE = 5;
    public static final int MAXIMUM_AGE = 100;

    public static int min(int x, int y){

        return x < y ? x : y;
    }

    public static int max(int x, int y){

        return x > y ? x : y;
    }

    public static boolean isAgeInRange(int age){

        return age < MAXIMUM_AGE && age > MINIMUM_AGE;
    }
}
