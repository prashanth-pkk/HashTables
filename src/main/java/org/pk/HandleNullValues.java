package org.pk;

import java.util.Hashtable;

public class HandleNullValues {
    public static void main(String[] args) {
        try {
            Hashtable<String, String> hashtable = new Hashtable<>();
            hashtable.put("abc", null);
        } catch (NullPointerException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
