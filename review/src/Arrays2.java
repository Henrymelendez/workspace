import java.util.Arrays;
import java.util.Locale;

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
        String[] arr = s.toLowerCase().split("[, ?.@]+");
        String[] resu = new String[arr.length];


        for(int i = 0; i < arr.length; i++){

            int count = 0;

            for(int j = i; j < arr.length; j++){

                if(arr[i].equals(arr[j])){
                    count++;
                }
            }

            if(count == 1){
                resu[i] = arr[i];
            }
        }


        for(int i =0; i < resu.length; i++){
            if(resu[i] != null){
                System.out.println(resu[i]);
            }
        }
        System.out.println();

        String str = "Life is Good!";
        char[] sarr = str.toCharArray();

        System.out.println(sarr[0]);




    }

}
