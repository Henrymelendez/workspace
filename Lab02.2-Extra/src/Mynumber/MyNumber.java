package Mynumber;

public class MyNumber {


    public static int computeRandomInt(int start, int end){


        int range = end - start;



        return (int) (Math.random() * range) + start;
    }
}
