public class Arrays {

    public static void main(String[] args) {

        int[] ints = {3,9,6,2,1,10,5,11};

        for(int i = 0; i < ints.length;i++){

            for(int j = 0; j < ints.length-1; j++ ){

                if(ints[j] > ints[j+1]){

                    int temp = ints[j+1];
                    ints[j+1] = ints[j];
                    ints[j] = temp;

                }
            }

        }

        System.out.println(java.util.Arrays.toString(ints));

    }
}
