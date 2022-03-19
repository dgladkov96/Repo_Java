package word;

public class Homework5 {
    public static void main(String[] args){
        /**
         * store a country name in a variable
         * print name of the country
         * print length of country name // note: cannot use length() method
         * hint: use split() method and length variable from array
         *
         */
        String country = "Ukraine";
        System.out.println("Country = " + country);
        String[] arrOFcountry = country.split("");
        System.out.println("Country name length = " + arrOFcountry.length);


        /** Q2
         * print number of words in sentence-2 value
         *
         */
        String sentence2 = "\nHealth was Earlier said to Be the ability of the body functioning WEll.";
        String[] arrOfSentence2 = sentence2.split(" ");
        System.out.println(arrOfSentence2.length);

        /** Q3
         * create abbreviation for 4 word sentence
         * HInt: split, charAt, toUppercase, subString, toUppercase)
         */
        String fourWords = "\nHow are you doing";
        String UpperFour = fourWords.toUpperCase();
        System.out.println(UpperFour);
        String[] Arrfourwords = UpperFour.split(" ");
        System.out.println(Arrfourwords);
        String H = Arrfourwords[0] + " "; // "HOW"
        String A = Arrfourwords[1] + " "; // "ARE"
        String Y = Arrfourwords[2] + " "; // "YOU"
        String D = Arrfourwords[3]; // "DOING"
        String HAYD = H + A + Y + D;
        System.out.println(HAYD);


        /**
         * Q4:
         * Create an int-variable and store any value in it
         * if the value is divisible by 5, print "divisible by 5"
         * if the value is divisible by 3, print "divisible by 3"
         * if the value is divisible by 5 and 3, print "divisible by 5 and 3"
         * if the value is NOT divisible by 5 and 3, print "NOT divisible by 5 and 3"
         *
         * int num = 32
         */

        int Q4 = 32;
        if (Q4 % 5 == 0 && Q4 % 3 == 0) {
            System.out.println(Q4 + " is divisible by 5 & 3");
        } else if (Q4 % 5 ==0) {
            System.out.println(Q4 + " divisible by 5");
        } else if (Q4 % 3 == 0) {
            System.out.println(Q4 + " divisible by 3");
        } else{
            System.out.println(Q4 + " is NOT divisible by 5 & 3");

        }

        /**
         * Q5:
         * Create two variables to store student-score and max-score (max score a student can get)
         * based on student percentage, print the grade:
         *
         * 91-100%      -> Grade A
         * 81-90.99%    -> Grade B
         * 71-80.99%    -> Grade C
         * 61-70.99%    -> Grade D
         * below 60.99% -> Grade E
         *
         * double studentScore = -5 (studentScore <= maxScore)
         * int maxScore = -1 (maxScore > 0)
         *
         * (studentScore/maxScore)*100 = 92.2
         *
         * Your grade = A, percentage = 92.2
         * if student-score is invalid, print "Invalid student score entered"
         * if max-score is invalid,  print "Invalid max score entered"
         */
        double studentScore = 70.99;
        int maxScore = 100;
        Double studentPercent = studentScore/maxScore * 100;


        if (maxScore < 0) {
            System.out.println("Invalid max score entered");
        } else if (studentScore >= maxScore) {
            System.out.println("Invalid student score entered");
        } else if (studentPercent >= 91) {
            System.out.println("Grade A");
        } else if (studentPercent >=81 && studentPercent < 91) {
            System.out.println("Grade B");
        } else if (studentPercent >=71 && studentPercent < 81) {
            System.out.println("Grade C");
        } else if (studentPercent >= 61 && studentPercent <71) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");



        }



        /**
         * Q6:
         * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"}
         * print the values which has length greater than 5 and starts with l
         *
         * expected ans:
         * learning
         * living standard
         *
         */
        String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"};
        for (int i=0; i < words.length ; i++) {
            if (words[i].length() > 5 && words[i].substring(0, 1).equals("l")) {
                System.out.println(words[i]);


            }
        }



        }




    }

