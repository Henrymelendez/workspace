public class StringAndStringBuilder {





    public String constructMyAddressUsingString(){
            String address = "";
            address += "123 Agawam Street";
            address += "Revere";
            address += "MA";
            address += "02151";
        return address;
    }


    public String constructMyAddressUsingStringBuilder(){
        StringBuilder sb = new StringBuilder();
        sb.append("123 Agawam Street");
        sb.append("Revere");
        sb.append("MA");
        sb.append("02151");

        return sb.toString();


    }
}
