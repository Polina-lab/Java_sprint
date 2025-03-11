package sprint;

import java.time.LocalDate;

public class DayChecker {
    public static String checkDayType(LocalDate date) {
        String result = "";
        //System.out.println(date.getDayOfWeek());
        switch (date.getDayOfWeek()) {
            case SATURDAY:
            case SUNDAY:
                result="Weekend";
                break;
            case WEDNESDAY:
                result="Hump Day!";
                break;
            default:
                result="Weekday";
                break;
        }
        return result;
    }
}
