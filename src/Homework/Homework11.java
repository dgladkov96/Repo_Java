package Homework;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;


public class Homework11 {
    /**
     * Question-1:
     *      * Create a HashMap with
     *      *      Integer as key and
     *      *      String as value
     *      *
     *      *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPY") , (104 = "live") , (105 = "Happy"), (106 = "Live") }
     *      *
     *      *  Create a method that will the HashMap<Integer, String> as Input
     *      *  print the keys with common values (ignoring cases)
     *      *
     *      *      "Happy" is present with keys = 101, 103, 105
     *      *      "Live" is present with keys = 104, 106
     *      *
     *      *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPiness") , (104 = "life") , (105 = "king and queen"), (106 = "Live") }
     *      *  When no keys are having common values, method should print,
     *      *      "No keys have common values"
     */
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(101, "HAppy");
        myMap.put(102, "King");
        myMap.put(103, "HAPPY");
        myMap.put(104, "live");
        myMap.put(105, "Happy");
        myMap.put(106, "Live");

        getKeys(myMap, "Happy");


        String[] colorNames = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};
        System.out.println(max(colorNames));
    }
    public static void getKeys(HashMap<Integer, String> inputMap, String value) {
        Set <Integer> keys = new HashSet<>();


        //iterate thru hashmap -> if key value equals another key value, store keys in set
        for (Map.Entry<Integer, String> entry: inputMap.entrySet()) {
            if (inputMap.containsValue(value)){
                keys.add(entry.getKey());
                System.out.println(value + " is present with keys " + keys);
            }else {
                System.out.println("No common values found");
            }

        }

    }
    /**
     * Question-2:
     *
     * String[] colorNames = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
     *             "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
     *             "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
     *             "green", "green"};
     *
     *
     * Create a method that will return the name(s) of color appearing max number of times in the array.
     *
     * green - 7
     * blue - 5
     * red - 10
     * yellow - 8
     * grey - 6
     *
     * method will return "red"
     *
     *
     * green - 7
     * blue - 10
     * red - 10
     * yellow - 8
     * grey - 6
     *
     * method will return "red", "blue"
     *
     *
     *
     */
    public static String max(String[] colors) {
        //create hashmap to store colors and their frequency
        HashMap<String, Integer> hm = new HashMap<String, Integer> ();

        for(int i = 0; i < colors.length; i++) {
            if(hm.containsKey(colors[i])) {
                hm.put(colors[i], hm.get(colors[i]) + 1);
            }else {
                hm.put(colors[i], 1);
            }
        }
        // create hashset to iterate thru hashmap
        Set<Map.Entry<String, Integer>> mySet = hm.entrySet();
        String key = "";
        int value = 0;

        for(Map.Entry<String, Integer> MapEntry: mySet) {
            //check for color that appears the most
            if(MapEntry.getValue() > value) {
                value = MapEntry.getValue();
                key = MapEntry.getKey();
            }
        }return key;

    }

}
