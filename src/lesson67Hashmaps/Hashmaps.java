package lesson67Hashmaps;

import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {

        // HashMap = A data structure that stores key-value pairs
        // Keys are unique but Values can be duplicated
        // Does not maintain any order, but is memory efficient
        // HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("Shoes", 3.45);
        map.put("Apples", 3.45);
        map.put("Shirts", 53.45);
//        map.put("Shirts", 53.45); IF THIS WAS INSERTED, IT WOULD OVERRIDE THE PREVIOUS VALUE WITH THIS KEY

        System.out.println(map);

        map.remove("Apple");
        System.out.println(map);

        System.out.println(map.containsKey("Shoes")); // returns boolean
        System.out.println(map.containsValue(3.45)); // returns boolean
        System.out.println(map.get("Apples"));

        if(map.containsKey("Shirts")) {
            System.out.println("The price of shirts is: " + map.get("Shirts"));
        } else {
            System.out.println("There are no shirts");
        }

        System.out.println(map.size());

        //Use a for loop to extrapolate from the hashmap

        for(String key : map.keySet()) {
            System.out.println(key + ": £" + map.get(key)); //could also use printf if wanted
        }

    }
}
