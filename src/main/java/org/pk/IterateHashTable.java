package org.pk;

import java.util.Hashtable;
import java.util.Map;

public class IterateHashTable {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("a", "apple");
        ht.put("b", "ball");
        ht.put("c", "cat");
        ht.put("d", "dog");

        //iterating
        System.out.println("Iterating using the keySet(): ");
        for (String key : ht.keySet()) {
            System.out.println(key + " -> " + ht.get(key));
        }

        //iterating by using values() method
        System.out.println("Iterating using the values() ");
        for (String key : ht.values()) {
            System.out.println(key);
        }

        //Iterating by using entrySet()
        System.out.println("Iterating using the entrySet() ");
        for (Map.Entry<String, String> entry : ht.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
