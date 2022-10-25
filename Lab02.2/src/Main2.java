public class Main2 {

    private static int intField;
    private static String myStringField;


    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod(){
         int mylocal= 0;
         String mylocalString = "";

        System.out.println(myStringField);
        System.out.println(mylocal + " "+ mylocalString);
    }
}
