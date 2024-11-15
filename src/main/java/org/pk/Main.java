package org.pk;

public class Main {
    public static void main(String[] args) {
        Employee james = new Employee(1, "jones", "james");
        Employee cook = new Employee(2, "alister", "cook");
        Employee ben = new Employee(3, "stokes", "ben");
        Employee wood = new Employee(4, "mark", "wood");
        Employee max = new Employee(5, "mad", "max");

        SimpleHashTable sm = new SimpleHashTable();
        sm.put("james", james);
        sm.put("cook", cook);
        sm.put("ben", ben);
        sm.put("wood", wood);
        sm.put("mad", max);

        sm.printHashTable();
    }
}