package FlowControl;

public class FlowControlClient {

    public static void main(String[] args) {
        System.out.println(FlowControl.isItEvenNumber(10)); // True
        System.out.println(FlowControl.isItEvenNumber(9)); // False
        System.out.println(FlowControl.isItEvenNumber(3));// False
        System.out.println(FlowControl.isItEvenNumber(30));// True


        System.out.println(FlowControl.hexCharToDecimal('A')); // 10
        System.out.println(FlowControl.hexCharToDecimal('G')); // 71 ASCII Decimal Value
        int index = 0;

        for (int i = 0; i <= 10; i ++){
            System.out.println(i);
        }

        while(index > 0){
            System.out.println(index);
            index--;
        }

        do{
            System.out.println(index);
            index++;
        }while (index <= 1);


    }
}
