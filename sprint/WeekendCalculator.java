package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class WeekendCalculator {
    public long countWeekendDays(LocalDate date1, LocalDate date2){
        
        long result=0;
        ArrayList<LocalDate> dates = new ArrayList<>();
        while(!date1.isAfter(date2)){
            dates.add(date1);
            date1=date1.plusDays(1);
        }
        for(LocalDate date : dates){
            if(date.getDayOfWeek()==DayOfWeek.SUNDAY || date.getDayOfWeek()==DayOfWeek.SATURDAY){
                result++;
            }
        }
        return result;
    }
}
