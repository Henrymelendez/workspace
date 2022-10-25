package enums;

import java.util.EnumSet;

public class DayUsingEnum {

    public static void displayDay(Day day){
        System.out.println(day);
    }

}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class Main4 {
    public static void main(String[] args) {

        DayUsingEnum.displayDay(Day.SUNDAY);

        Day[] days = Day.values();

//        for(Day day : days){
//            System.out.println(day);
//        }
        for(Day day : EnumSet.range(Day.MONDAY, Day.FRIDAY)){
            System.out.println(day);
        }

    }


}



