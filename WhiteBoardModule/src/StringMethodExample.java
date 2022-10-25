import java.util.Locale;

public class StringMethodExample {

    public static void main(String[] args) {

        // exercise contains(..) method
        System.out.println("exercise contains(..) method");
        String testString = "hello world!";
        boolean contains = testString.contains("wor"); //true
        System.out.println(" " + contains);
        boolean xyz = testString.contains("xxxyz"); // false
        System.out.println(" " + xyz);


        // exercise endsWith(...) method
        System.out.println("exercise endsWith(...) method");
        boolean endsWithMethod = testString.endsWith("ld!"); // true
        System.out.println(endsWithMethod);
        boolean endsWithFalse = testString.endsWith("ee"); // false
        System.out.println(endsWithFalse);

        // exercise equals(...) method
        System.out.println("equals Method");
        String helloWord = "hello world!";
        String goodbyeWorld = "goodbye world";

        System.out.println(testString.equals(helloWord)); // true
        System.out.println(testString.equals(goodbyeWorld)); // false


        // exercise equalsIgnoreCase(...) method
        System.out.println("exercise equalsIgnoreCase(...) method");
        String lowerCase = "HELLO WORLD!";
        lowerCase = lowerCase.toLowerCase();
        System.out.println(testString.equals(lowerCase)); // true

        String captial = "hello world!";
        captial = captial.toUpperCase();
        System.out.println(testString.equals(captial)); // false

        //exercise indexOf(..) method
        System.out.println("exercise indexOf(..) method");

        int indexOfW = testString.indexOf("w");
        int indexOfZ = testString.indexOf("z");
        System.out.println(indexOfW); // 6
        System.out.println(indexOfZ); // -1

        // exercise length() method
        System.out.println("exercise length() method");
        String[] s = {"a", "b", "c", "d"}; // 4
        System.out.println(s.length); // 4

        // exercise spilt(..) method
        System.out.println("exercise split(..) method");
        String[] splitString = testString.split(" ");

        System.out.println(splitString.length); //2

        for(String word : splitString){
            System.out.println(word);
        }

        //exercise StartsWith(..) method
        System.out.println("exercise StartsWith(..) method ");
        String t = "hello";

        System.out.println(testString.startsWith(t)); // true
        System.out.println(testString.startsWith("john")); // false

        //exercise strip() method
        System.out.println("exercise strip method");
        String whitespaces = "  Hello World  ";
        System.out.println(whitespaces); // hello world with leading and trailing whitespaces
        System.out.println(whitespaces.strip()); // hello world without leading or trailing whitespaces


        // exercise substring method
        System.out.println("exercise substring(..) Method");

        System.out.println(testString.substring(2)); // llo world!
        System.out.println(testString.substring(1,testString.length()-1)); // ello world!

        // exercise toLowerCase(..) Method
        System.out.println("exercise toLowerCase(...) Method");
        String caps = "GOODBYE";
        caps = caps.toLowerCase(); // goodbye in lowercase
        System.out.println(caps);

        // exercise toUpperCase(..) Method
        System.out.println("exercise toLowerCase(..) Method");
        testString = testString.toUpperCase(); // hello world in all caps
        System.out.println(testString);

        StringBuffer sBuffer = new StringBuffer(100)
                .append("20");
        System.out.println(sBuffer);

        String ref = "ABCEd";
        boolean matches = ref.matches("[a-zA-z]{5}");
        System.out.println(matches);


    }

}
