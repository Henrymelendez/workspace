public class WrapperExampleClient {

    public static void main(String[] args) {

       Integer intObj =  WrapperExample.convertStringToIntegerObject("7");
       int i = WrapperExample.convertStringToIntPrimative("7");

        System.out.println(intObj);
        System.out.println(i);

        System.out.println(intObj.getClass());

    }
}
