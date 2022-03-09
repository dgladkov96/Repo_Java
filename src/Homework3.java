import java.sql.SQLOutput;

public class Homework3 {
    public static void main(String[] args) {
        /**
         * C-->F
         * C-->K
         *
         * F-->C
         * F-->K
         *
         * K-->C
         * K-->F
         *
         * Convert Celsius to Fahrenheight
         *
         * fT = cT x 9/5 + 32
         *
         */
        double cTemp = 19;
        double fTemp = cTemp * 9 / 5 + 32;
        System.out.println(cTemp + "°C is equal to " + fTemp + "°F");

        double cTemp2 = 19;
        double kTemp = cTemp2 + 273.15;
        System.out.println(cTemp2 + "°C is equal to " + kTemp + "K");

        double fTemp2 = 70;
        double cTemp3 = (fTemp2 -32) *5/9;
        System.out.println(fTemp2 + "°F is equal to " +cTemp3 + "°C");

        double fTemp3 = 70;
        double kTemp2 = (fTemp3 + 459.67) * 5/9;
        System.out.println(fTemp3 + "°F is equal to " + kTemp2 + "K");

        double kTemp3 = 400;
        double cTemp4 = kTemp3 - 273.15;
        System.out.println(kTemp3 + "K is equal to " + cTemp4 + "°C");

        double ktemp4 = 400;
        double fTemp4 = (ktemp4 * 9/5) - 459.67;
        System.out.println(ktemp4 + "K is equal to " + fTemp4 + "°F");




    }


}
