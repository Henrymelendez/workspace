import java.util.EnumSet;

public class MyFamilyClient {

    public static void main(String[] args) {

        MyFamily[] names = MyFamily.values();

        for(MyFamily name : names){
            System.out.println(name);
        }

        System.out.println();

        for(MyFamily name : EnumSet.range(MyFamily.FRANK, MyFamily.HENRY)){
            System.out.println(name);
        }
    }
}
