package word;

import java.util.Locale;

public class Homework4 {
    public static void main(String[] args){
        /**
         * Due date: Mar 13 (Sunday)
         */

        /**
         * Task -1
         * using Ternary operator assign value to int-variable
         *
         * Variable -> result1
         * if the length of sentence1-String is greater or equals to 5
         *      value in result1 should be 10
         * else
         *      value in result should be 15
         *
         * print:
         *      value of sentence1
         *      length of sentence1
         *      value of result1
         */
        String sentence1 = "hhhh";
        int n1 = 10, n2 = 15, result1;
        result1 = (sentence1.length() >= 5) ? (n1) : (n2);
        System.out.println(sentence1 + " has " + sentence1.length() + " characters, therefore result1 is equal to " + result1);





        /**
         * Task - 2
         *
         * Create a String Variable and store your full name in it.
         * Print the following values:
         *  1. length of your full name
         *  2. check if your name ends with "a" (ignore the case)
         *  3. check if your name contains with "a" (ignore the case)
         *
         */
        String myName = "Daniil Gladkov";
        int nameLength = myName.length();
        System.out.println("The length of my name is " + nameLength);
        System.out.println("My name ends with character 'a' : " + myName.endsWith("a"));
        System.out.println("My name contains an 'a' : " + myName.contains("a"));






        /**
         *
         */
        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        /**
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         */
        System.out.println("task3 value contains the characters 'king' : " + task3.contains("kings"));
        System.out.println("the characters 'ew' in string task3 first appear at index " + task3.indexOf("ew", 0));




        String task4 = "kINg";
        /**
         * Convert the value in task4 variable into Titlecase
         *      (FirstCharacterUppercase and rest all in lowercase)
         *
         * "kINg" -> "King"
         * "QUEEN" -> "Queen"
         */
        String task4_Titlecase = task4.substring(0, 1).toUpperCase() + task4.substring(1, 4).toLowerCase();
        System.out.println(task4_Titlecase);
    }
}
