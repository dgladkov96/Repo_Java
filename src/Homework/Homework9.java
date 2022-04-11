package Homework;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;


public class Homework9 {

    public static void getCount(ArrayList<String> list)
    {

        // create a hash set and elements of array list are added into it
        Set<String> st = new HashSet<String>(list);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }
    public static int[] removedInt(int value, int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == value) {
                count++;
            }
        }
        int[] restOfValuesArr = new int[arr.length - count];
        int j=0;
        for (int num : arr) {
            if (num != value) {
                restOfValuesArr[j] = num;
                j++;
            }
        }
        return restOfValuesArr;
    }

    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Happy");         //  ["Happy"]
        names.add("GroW");          //  ["Happy", "GroW"]
        names.add("LeaRN");         //  ["Happy", "GroW", "LeaRN"]
        names.add("PeaCEfUL");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL"]
        names.add("Learning");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL", "Learning"]
        names.add("HAPPy");

        getCount(names);
    }
}

