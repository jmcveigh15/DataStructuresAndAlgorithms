package src.hashtables;

import java.util.HashMap;
import java.util.Map;

public class JDKHashMap {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        Map<String, Employee> hashmap = new HashMap<String, Employee>();
        hashmap.put("Jones", janeJones);
        hashmap.put("Doe", johnDoe);
        hashmap.put("Smith", marySmith);
        // Employee employee = hashmap.put("Doe", mikeWilson);
        Employee employee = hashmap.putIfAbsent("Doe", mikeWilson);
        System.out.println(employee);

        System.out.println(hashmap.getOrDefault("fgcgfhvfchg", mikeWilson));

        System.out.println(hashmap.remove("Jones"));

        // System.out.println(hashmap.containsKey("Doe"));
        // System.out.println(hashmap.containsValue(janeJones));

        /*
        Iterator<Employee> iterator = hashmap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */

        hashmap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));
    }

}
