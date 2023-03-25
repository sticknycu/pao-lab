package org.example;

import java.util.*;

public class DataStr {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("daaa");
        stringBuilder.append("dddd");

        stringBuilder.toString();

        stringBuilder.reverse();
        //stringBuilder.replace();

        StringBuffer stringBuffer = new StringBuffer();

        List<Person> list = new ArrayList<>();
        list.add(new Person());
        list.get(0);

        list.size();

        list.contains(new Person());

        list.clear();

        list.containsAll(List.of(new Person(), new Person()));

        List<Person> linkedListPerson = new LinkedList<>();


        Set<Person> personSet = new HashSet<>();

        Map<String, Person> hashmapPerson = new HashMap<>();

        hashmapPerson.put("one", new Person());
        hashmapPerson.put("two", new Person());

        hashmapPerson.get("two");

        Map<String, Person> treeMapPerson = new TreeMap<>();

        treeMapPerson.put("one", new Person());

        treeMapPerson.get("one");
    }

}
