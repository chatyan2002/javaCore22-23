package homeworks.homework13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static final SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
    public static final SimpleDateFormat SDTM = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    public static String dateToString(Date date) {
        return SDF.format(date);
    }

    public static String dateTimeToString(Date dateTime) {
        return SDTM.format(dateTime);
    }

    public static boolean isSameDay(Date day1, Date day2) {
        return SDF.format(day1).equals(SDF.format(day2));
    }

   public static Date stringToDateTime(String dateStr) throws ParseException {
        return SDTM.parse(dateStr);
   }
}

