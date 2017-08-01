import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.temporal.WeekFields;
import java.util.Locale;

@RestController
@EnableAutoConfiguration
public class TimerService {

    @RequestMapping("/month")
    String month() {
        return YearMonth.now().toString();
    }


    @RequestMapping("/week")
    String week() {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = LocalDate.now().get(weekFields.weekOfWeekBasedYear());
        return "Week " + weekNumber;
    }


    @RequestMapping("/date")
    String date() {
        return LocalDateTime.now().toString();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TimerService.class, args);
    }

}