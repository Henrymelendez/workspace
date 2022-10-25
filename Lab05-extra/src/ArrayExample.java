public class ArrayExample {

    private String[] name = {"John", "chris", "frank"};

    public void convertAndDisplayNamesToUpperCase() {

        for (String names : name) {
            System.out.println(names.toUpperCase());
        }

    }

    public int[] findOddNumbersFromArray(int[] numbers) {
        int count = 0;
        int[] result;


        if (numbers.length % 2 == 0) {
            result = new int[numbers.length / 2];
        } else {
            result = new int[(numbers.length / 2) + 1];
        }



        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0) {
                result[count] = numbers[i];
                count++;
            }
        }


        return result;

    }


    public static int findLargestNumberFromArray(int[] numbers) {

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] > max){
                max = numbers[i];
            }
        }


        return max;

    }


    public static void convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs(String myname, String... myFriends) {

        System.out.println(myname.toUpperCase());

        for (String friend : myFriends) {
            System.out.println(friend.toUpperCase());
        }
    }


}
