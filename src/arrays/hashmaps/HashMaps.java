package arrays.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void hashExamples(){
        //Creating an object of the HashMap class that implements the Map interface.
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("Dollar", 128);
        hashMap.put("Pound", 126);
        hashMap.put("Euro", 125);

        // Accessing a value using a key
        int currencyValue = hashMap.get("Euro");
        System.out.println("Selected currency value: " + currencyValue);

        // Removing a key-value pair
        hashMap.remove("Pound");

        // Iterating over the keys
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Value: " + hashMap.get(key));
        }
    }
}
