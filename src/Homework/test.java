package Homework;


import java.util.Arrays;
import java.io.*;

public class test {


    public static int[] sortArray(int[] nums) {
        //method to return inputed array in ascending order
        int placeholder = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    placeholder = nums[i];
                    nums[i] = nums[j];
                    nums[j] = placeholder;
                }
            }
        }return nums;


    }
    public static void findCommonvalues(String[] str1, String[] str2) {
        //Q4 method to print out values found in both string arrays=
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j <str2.length; j++) {
                if (str1[i] == str2[j]){
                    System.out.println(str1[i]);
                }
            }
        }
    }

    public static int[] removeInput(int takeOut, int[] arr){
        //Q3 method to remove integer from an array
        if (arr == null) {
            return arr;
        }
        int[] newArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] == takeOut) {
                continue;

            }newArray[k++] = arr[i];

        }return newArray;

    }


    public static int getSum(int x) {
        //Q2
        int sum = 0;
        while (x != 0) {
            sum += x%10; //take remainder of first value of x i.e x = 954, re = 4
            x = x/10; //954/10 = 95, then go back and plug in 95 to sum equation 95 %10 = 5 --> 4+ 5, then repeat
            //95/10 -> 9 %10 -> 9 --> add back to sum --> 4 + 5 + 9
        }
        return sum;

    }


    public static void main(String[] args){
        //Q1
        int[] numbers = {32, 54, 12, 67, 2, 5};
        System.out.println(Arrays.toString(sortArray(numbers)));

        //Q2
        int digits = 123;
        int digits2 = 323;
        int digits3 = 90;
        System.out.println("\n" + getSum(digits));
        System.out.println(getSum(digits2));
        System.out.println(getSum(digits3));



        //Q3
        int out = 23;
        int[] array = {23, 67, 87, 10, 34, 98, 66, 55};
        System.out.println("\n" + Arrays.toString(removeInput(out, array)));

        System.out.println("\n");

        //Q4
        String[] one = {"lost" , "away" , "from" , "home"};
        String[] two = {"here" , "lost" , "home"};

        String[] inputArr3 = {"ab", "abcd", "abc", "abcde", "defg", "koli"};
        String[] inputArr4 = {"abcde", "jhuy", "plot", "koli"};


        findCommonvalues(one, two);
        findCommonvalues(inputArr3, inputArr4);




    }


}
