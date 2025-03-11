package sprint;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class CalendarBuilder {
    public static String buildCalendar(String month, int year){

        Month monthEnum = Month.valueOf(month.toUpperCase());
        int daysInMonth = monthEnum.length(Year.isLeap(year));
        LocalDate firstDay = LocalDate.of(year, monthEnum, 1);
        int startDay = firstDay.getDayOfWeek().getValue();

        StringBuilder result = new StringBuilder();
        result.append(month.toUpperCase()).append(" ").append(year).append("\n");
        result.append("Mon Tue Wed Thu Fri Sat Sun\n");

        int currentDay = 1;
        for (int i = 1; i < startDay; i++) {
            result.append("    ");
        }

        while (currentDay <= daysInMonth) {
            for (int i = startDay; i <= 7 && currentDay <= daysInMonth; i++) {
                if (currentDay < 10) {
                    result.append("  ").append(currentDay);
                } else {
                    result.append(" ").append(currentDay);
                }
                
                if (i < 7 && currentDay < daysInMonth) {
                    result.append(" ");
                }
                
                currentDay++;
            }
            
            if (currentDay <= daysInMonth) {
                result.append("\n");
            }
            startDay = 1;
        }
        



        return result.toString().trim();
    }
}