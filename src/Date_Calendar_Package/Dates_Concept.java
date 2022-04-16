package Date_Calendar_Package;
import sun.nio.ch.SelectorImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates_Concept {
    public static void main(String[] args) {

        Date now = new Date();
        /*
            Datatype of now is Date
         */

        System.out.println("now -> " + now);

        // print date/time in format -> MM/DD/YYYY HH:MM:SS

        // https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM/d/yy h:mm:ss");

        /**
         * format() -> helps to format Date in defined manner as a String
         */
        String formattedDate = sdf.format(now);
        System.out.println("formattedDate -> " + formattedDate);
        /**
         *  M : month in number (7, 11, 12)
         *  MM : month in number (07, 11, 12)
         *  MMM : month in abbreviation (Mar, Apr)
         *  MMMM : month name in full (March, April)
         *
         *  yy : last 2 digits of yeas (22)
         *  yyyy : year in full (2022)
         *
         *  d : date in number (7, 8, 10, 11)
         *  dd : date in number (07, 08, 10, 11)
         *
         *  h : hour in 12-hour format (7, 8, 10, 11)
         *  hh : hour in 12-hour format (07, 08, 10, 11)
         *
         */

        // print date/time in format -> Ham/pm (08am, 8am)
        SimpleDateFormat sdf2 = new SimpleDateFormat("ha");
        String hourData = sdf2.format(now).toLowerCase();
        System.out.println("hourData -> " + hourData);


        // print date/time in format -> full-day-name (Monday)
        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE");
        String dayName = sdf3.format(now);
        System.out.println("dayName -> " + dayName);

        /**
         * if the current date is less than 15
         *      print, it's first half of the month
         * else
         *      print, it's second half of the month
         */
        /*
            Pseudo Code
            1. Create current Date object
            2. Create SimpleDateFormat obj with pattern (d)
            3. using format() get the date-value from current date
            4. convert dateValue into int
            4. if (dateValue < 15)
                   print, it's first half of the month
               else
                   print, it's second half of the month
         */
        Date currDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("d");
        String dateValue = dateFormat.format(currDate);     // dateValue = 4
        int dateValueInt = Integer.parseInt(dateValue);
        if (dateValueInt < 15) {
            System.out.println("it's first half of the month");
        } else {
            System.out.println("it's second half of the month");
        }


        String dateString = "04/07/2050 09-50-50";      // date/month/year hour-min-seconds
        Date newDate = null;

        SimpleDateFormat makeDate = new SimpleDateFormat("dd/MM/yyyy hh-mm-ss");

        try {
            newDate = makeDate.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("newDate -> " + newDate);


        String dateString2 = "04/07/2005 09-50-50";      // date/month/year hour-min-seconds
        Date newDate2 = null;

        SimpleDateFormat makeDate2 = new SimpleDateFormat("dd/MM/yyyy hh-mm-ss");

        try {
            newDate2 = makeDate2.parse(dateString2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("newDate2 -> " + newDate2);

        /**
         * To verify if two dates are equal
         * method: equals()
         * return type: boolean
         */
        boolean isNowEqualsNewDate = now.equals(newDate);
        System.out.println("\nis now equals to newDate -> " + isNowEqualsNewDate);

        /**
         * To verify if a Date comes before another Date
         * method: before()
         * return type: boolean
         */
        boolean isNowBeforeNewDate = now.before(newDate);    // if now comes before newDate, then return true else false
        System.out.println("\nis now comes before to newDate -> " + isNowBeforeNewDate);


        /**
         * To verify if a Date comes after another Date
         * method: after()
         * return type: boolean
         */
        boolean isNowAfterNewDate = now.after(newDate);    // if now comes after newDate, then return true else false
        System.out.println("\nis now comes after to newDate -> " + isNowAfterNewDate);



        System.out.println("\nnewDate2 -> " + newDate2);
        System.out.println("newDate -> " + newDate);
        System.out.println("now -> " + now);

        boolean result = now.after(newDate2) && now.before(newDate);
        System.out.println("result -> " + result);
}}
