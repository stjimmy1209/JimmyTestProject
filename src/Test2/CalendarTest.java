package Test2;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Date date = cal.getTime();

        System.out.println(date.toLocaleString());



    }

}
