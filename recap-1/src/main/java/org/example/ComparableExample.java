package org.example;

import java.util.Comparator;

public class ComparableExample {

    public static void main(String[] args) {
        Person person = new Person();

        Person person2 = new Person();


        person.compareTo(person2);

        Comparator<Person> comparator = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        comparator.compare(person, person2);

        Comparator<Person> personComparator = (o1, o2) -> o1.getAge() - o2.getAge();
        personComparator.compare(person, person2);
    }
}
