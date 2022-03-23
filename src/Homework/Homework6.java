package Homework;

public class Homework6 {


    public static void main(String[] args) {
        /** Q1:
         * Create the abbreviation
         *
         * make America great again -> MAGA
         * Good Morning -> GM
         * happy birthday to you dear friend -> HBTYDF
         * hEllo -> H
         * Air ballon -> AB
         *
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */
        String sentence1 = "outFit OF the DAY";
        String[] words = sentence1.split(" ");
        String Acro = "";
        for (int y = 0; y <= words.length-1 ; y++) {
            Acro += words[y].substring(0, 1).toUpperCase();

        }
        System.out.println(Acro);




        /**
         * Q2:
         * Reverse the given String
         *
         * make america great again -> again great america make
         * good Morning -> Morning good
         * learn -> learn
         * happy birthday to you -> you to birthday happy
         *
         */
        String bday = "happy birthday to you";
        String revString = "";
        String[] hbd = bday.split(" ");

        for (int x = hbd.length - 1 ; x >= 0 ; x--) {
            revString += (hbd[x] + " ");
        }
        System.out.println("\nbday -> " + bday);
        System.out.println("revString -> " + revString);

        /**
         * Q3:
         * Convert the String value in to Titlecase
         *
         * make america great again -> Make America Great Again
         * gOOd morNING -> Good Morning
         * learn -> Learn
         * happy birTHday TO yOu -> Happy Birthday To You
         *
         */
        String maga = "make america great again";
        String [] magaArray = maga.split(" ");
        String magaTitlecase ="";
        for (String index : magaArray) {
            // store first letter of each word in index in String variable firstLetter
            String firstLetter = index.substring(0,1);
            // store every char after first letter in String variable restofWord
            String restofWord = index.substring(1);
            //store titlecase format of String maga in magaTitlecase
            magaTitlecase += firstLetter.toUpperCase() + restofWord.toLowerCase() + " ";

        }
        System.out.println("\n" + magaTitlecase);

        /**
         * Q4:
         * Find the minimum value from the given array
         *
         * int[] numbers = {-1, 1};     ->  -1
         * int[] numbers = {1, 21, 87, 23};     -> 1
         * int[] numbers = {87, 23, 89, 0, 54, 23}; -> 0
         */
       int [] numbers = {87, 23, 89, 0, 54, 23};
       int min = numbers[0];
       int max = numbers[0];

       for (int a = 0; a < numbers.length; a++) {
           if (numbers[a] < min) {
               //if number in a position is less than first value in 0 index, assign min to num[a]
               min = numbers[a];
               // num[0] < min -> 87 < 87 -> F; min doesnt change; min = 87
               // num[1] < 87 -> 23 < 87 -> T; new min = 23
               // num[2] < 23 -> 89 < 23 -> F; min stays 23
               // num[3] < 23 -> 0 < 23 -> T; new min = 0
               // num[4] < 0 -> 54 < 0 -> F; min stays 0
               // num[5] < 0 -> 23 < 0 -> F ; min stays 0

           }
       }
       System.out.println("\nMin value is " + min);

    }

    }