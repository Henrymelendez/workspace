import java.util.Arrays;

public class ArrayExampleClient {

    public static void main(String[] args) {
        System.out.println("Exercise #1 *******");
        ArrayExample ex = new ArrayExample();
        ex.convertAndDisplayNamesToUpperCase();

        int[] ex2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Exercise #2 *********");
        int[] exercise2Res = ex.findOddNumbersFromArray(ex2);
        System.out.println(Arrays.toString(exercise2Res));


        System.out.println("Exercise #3 ********");
        int[] arr = {8, 3, 2, 1, 4, 5, 6, 10, 8, 2, 3};

        int res = ArrayExample.findLargestNumberFromArray(arr);
        System.out.println(res);

        System.out.println("Exercise #4 ********");
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Henry", "John", "Jack", "jill");
        System.out.println();
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Henry", "danny", "ben", "rupesh");

    }
}
