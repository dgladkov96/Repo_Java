package Homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Homework10 {
    /**
            * Question-1:
            * Create a method that can return if a given-String-Array has duplicate values or not.
            *
            * Input: String-Array
         * Return type: boolean
         *
                 *
                 *
                 * create String-List using given-String-Array
         * create a String-Set using String-List
         * compare size of Set and List
         */
public static boolean Duplicates(String[] inputArr) {
     boolean Repeats = false; //set boolean to false
     List<String> myList = Arrays.asList(inputArr); //create list from inputed array
     HashSet<String> inputSet = new HashSet<>(myList); // create set from list
     if (inputSet.size() < myList.size()) { //compare size of set to list, if set is less, there are duplicates bc set cannot hold duplicates
          Repeats = true;
     }return Repeats;

}

    /**
     * Question-2:
     * Create a method that would return the duplicate values of given-String-array (ignore the case)
     *
     * Input: String-Array
     * Return type:     (one of these -> Array, List, Set)
     *
     *
     * String[] names = {"abc" , "abc" , "DEF", "ABC", XYZ", "def"}
     *
     * "abc", "def"
     */
    public static List<String> returnDoubles(String[] userArray) {
        List<String> doubleList = new ArrayList<String>();
        for (int i = 0; i < userArray.length; i++){
            for(int j = i +1; j < userArray.length; j++){
                if (userArray[i].equals(userArray[j])){
                    doubleList.add(userArray[i]);
                }
            }
        }return doubleList;
    }

    public static void main(String[] args){

        String[] myArray = {"Jorge", "Daniil", "Matt", "Collin", "Lasha", "Chris", "Cindy", "Daniil", "Cindy"};
        System.out.println(Duplicates(myArray));

        System.out.println(returnDoubles(myArray));
    }
}
