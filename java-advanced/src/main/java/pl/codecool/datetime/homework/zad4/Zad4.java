package pl.codecool.datetime.homework.zad4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;

public class Zad4 {

   public List<LocalDate> daysOfWeekendCount(LocalDate localDate) {
       var year = localDate.getYear();
       var month = localDate.getMonthValue();

       LocalDate firstDateOfTheMonth = YearMonth.of(year, month).atDay(1);

       return firstDateOfTheMonth.datesUntil(firstDateOfTheMonth.plusMonths(1))
               .filter(date -> date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY)
               .collect(Collectors.toList());
   }
}
