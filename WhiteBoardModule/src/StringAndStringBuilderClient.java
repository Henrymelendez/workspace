public class StringAndStringBuilderClient {

    public static void main(String[] args) {

        StringAndStringBuilder st = new StringAndStringBuilder();


        String one = st.constructMyAddressUsingString();
        String two = st.constructMyAddressUsingStringBuilder();

        System.out.println(one.equals(two));
        System.out.println(one == two);

    }
}
