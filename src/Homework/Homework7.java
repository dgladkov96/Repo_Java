package Homework;

public class Homework7 {
/** Q1:
 * Create a method to make abbreviation for a given sentence
 * Method should return
 *
 * Questions to answer before creating a method:
 *  1. what is the purpose of the method?   -   makeAbbreviation
 *  2. do I need any input from user?   -   1 (String)
 *  3. should we return any value in the end of method? - Yes
 *      If yes, then what is the datatype of returned value? - String
 *
 * make America great again -> MAGA
 * outfit of the day -> OOTD
 * happy birthday to you -> HBTY
 * Good morning -> GM
 * Happy new Year -> HNY
 * Happy birthday to you dear -> HBTYD
 * happy new year to you dear -> HNYTYD
 *
 * public static String makeAbbreviation(String inputStr) {
 *      // code
 * }
 */

public static String makeAbbreviation(String inputStr) {
    String[] words = inputStr.split(" ");
    String Acro = "";
    for (int i = 0; i <= words.length-1 ; i++) {
        Acro += words[i].substring(0, 1).toUpperCase();
    }
    return Acro;

}

/**
 * Q2:
 * Create a method that will change the given sentence in Titlecase
 * Method should return
 *
 * HappY nEW YEAR to YoU dEAr -> Happy New Year To You Dear
 * gooD morNING -> Good Morning
 * make AMERICA GreAT AgAIn -> Make America Great Again
 *
 *Questions to answer before creating a method:
            *  1. what is the purpose of the method?   -   makeTitlecase
 *  2. do I need any input from user?   -   1 (String)
            *  3. should we return any value in the end of method? - Yes
 *      If yes, then what is the datatype of returned value? - String
 */

public static String makeTitlecase(String input2) {
    String[] userArray = input2.split(" ");
    String Titlecase = "";
    for (String index : userArray) {
        // store first letter of each word in index in String variable firstLetter
        String firstLetter = index.substring(0, 1);
        // store every char after first letter in String variable restofWord
        String restofWord = index.substring(1);
        //store titlecase format of String maga in magaTitlecase
        Titlecase += firstLetter.toUpperCase() + restofWord.toLowerCase() + " ";

    }
    return Titlecase;
}
/**
 * Q3:
 * Create method to find the maximum value from given int-array
 * Method should return
 *
 * int[] = {23, 54, 76, 12, 67, 90, 23}     ->  90
 *
 * int[] = {23, 54, 76, 12}     ->  76
 *
 * int[] = {-2, -9, -4, -7, -9, -55}     ->  -2
 *
 * Questions to answer before creating a method:
 *  1. what is the purpose of the method? - findMaxInArray
 *  2. do I need any input from user? - 1 (int[])
 *  3. should we return any value in the end of method? - yes
 *      If yes, then what is the datatype of returned value? - int
 *
 * int maxNum = inputArray[0]
 *
 * if (inputArray[1] > maxNum)
 *      maxNum = inputArray[1]
 * if (inputArray[2] > maxNum)
 *      maxNum = inputArray[2]
 */

public static int findMaxinArray(int [] numbers) {
    int max = numbers[0];
    for (int a = 0; a < numbers.length; a++) {
        if (numbers[a] > max) {
            //if number in a position is greater than first value in 0 index, assign max to num[a]
            max = numbers[a];
            // num[0] < min -> 87 < 87 -> F; min doesnt change; min = 87
            // num[1] < 87 -> 23 < 87 -> T; new min = 23
            // num[2] < 23 -> 89 < 23 -> F; min stays 23
            // num[3] < 23 -> 0 < 23 -> T; new min = 0
            // num[4] < 0 -> 54 < 0 -> F; min stays 0
            // num[5] < 0 -> 23 < 0 -> F ; min stays 0

        }
    }return max;
}
/**
 * Q4:
 * Create a method to find if the given string is palindrome (DO NOT ignore case)
 * Method should return (boolean)
 *
 * "hello" -> "olleh"   (not palindrome)
 * "eye" -> "eye"       (palindrome)
 *
 *
 * "level" -> true
 * "eye" -> true
 * "fall" -> false
 * "Level" -> false
 * "eYe" -> true
 * Eye -> false
 *
 * * Questions to answer before creating a method:
 *  *  1. what is the purpose of the method? - Palindrome
 *  *  2. do I need any input from user? - 1 String
 *  *  3. should we return any value in the end of method? - yes, boolean -> T or F
 *  *      If yes, then what is the datatype of returned value? - Boolean
 */
public static Boolean Palindrome(String userStr) {
    // start a count from 0, b starts from end of string going backwards
    int a = 0, b = userStr.length() - 1;

    //compare character values at (a) and (b) if they are not equal to each other, string is not a palindrome
    while (a < b) {
        if (userStr.charAt(a) != userStr.charAt(b))
            return false;
        //increment a b/c it is moving up the string forwards, starting from beginning
        a++;
        //decrement b b/c it is moving down the string backwards, starting from the end of user string
        b--;
    }
    return true;

}


    /**
     * Q5:
     * Create a method to find the longest String in the given String-array
     * Method should return (String)
     *
     * ["happy", "Happy new year", "peaceful" , "king kong"]    ->    "Happy new year"
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method? - findMaxString
     *  2. do I need any input from user? - 1 (String[])
     *  3. should we return any value in the end of method? - yes
     *      If yes, then what is the datatype of returned value? - String
     */
public static String findMaxString(String[] Str) {
    int index = 0;
    int indexLength = Str[0].length();
    for (int x = 1; x < Str.length; x++) {
        if (Str[x].length() > indexLength) {
            index = x;
            indexLength = Str[x].length();
        }
    }return Str[index];
}


public static void main(String[] args) {
    System.out.println(makeAbbreviation("Cindy is the best"));
    System.out.println(makeTitlecase("\nMAke AMERicA GREat agaIN"));


    int [] number = {23, 54, 76, 12};
    System.out.println("\nLargest in array is -> " + findMaxinArray(number));

    System.out.println("\nUser inputed string is a Palindrome ->" + Palindrome("human"));


    String[] Str = {"I love to eat", "very cheesy pizza", "with a diet coke on the side"};
    System.out.println("\nLongest string is " + findMaxString(Str));


}

}


