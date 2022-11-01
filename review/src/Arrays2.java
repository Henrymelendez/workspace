import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Arrays2 {

    public static void main(String[] args) {

        String[] fam = new String[10];
        fam[0] = "john";
        fam[1] = "chris";
        fam[2] = "jack";

        System.out.println(Arrays.toString(fam));


        String[] ints = {"2","40","7","5"};
        int[] res = new int[ints.length];

        for(int i = 0; i < ints.length; i++){
            res[i] = Integer.parseInt(ints[i]);
        }

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(res));

        String[] myStringArrayA = {"Hello", "Boston"};
        String[] myStringArrayB = {"Hello", "Boston"};
        String[] myStringArrayC = {"Boston", "Hello"};

        System.out.println(Arrays.equals(myStringArrayA,myStringArrayB));
        System.out.println(Arrays.equals(myStringArrayA, myStringArrayC));

        String s =  "I love Boston.  Yes, you do love boston.";
        String[] initialWordsInArray = s.split("[, ?.@]+");
        String[] arr = new String[initialWordsInArray.length];
        int[] n = new int[initialWordsInArray.length];
        int currentIndex= 0;


        for(int i = 0; i < initialWordsInArray.length; i++){

            int foundIndex = isFound(initialWordsInArray, initialWordsInArray[i]);

            if(foundIndex >= 0){
                n[foundIndex]++;
            }
            else {
                arr[currentIndex] = initialWordsInArray[i];
                n[currentIndex] = 1;
            }

        }

        String str = "Life is Good!";
        char[] sarr = str.toCharArray();

        System.out.println(sarr[0]);


        Map<String, Integer> result = new HashMap<>();

        for(int i = 0; i < initialWordsInArray.length; i++){

            result.put(initialWordsInArray[i].toLowerCase(), result.getOrDefault(initialWordsInArray[i].toLowerCase(), 0) + 1);
        }

        for(Map.Entry<String, Integer> item : result.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }



    }

    private static int isFound(String[] arr, String s) {
        int foundIndex = -1;

        for (int i = 0; i < arr.length; i++){

            if(arr[i].equalsIgnoreCase(s)){
                foundIndex = i;
                break;
            }

        }

        return foundIndex;
    }












}
