package org.example;

import java.sql.Date;
import java.sql.SQLOutput;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        long b = 2;
        float c = 3;
        double d = 4;
        char c1 = 'c';


        Integer a1 = Integer.valueOf(5); // Integer a1 = 5;
        Integer a2 = Integer.valueOf("5");  // Integer a1 = 5;

        //Integer a3 = Integer.valueOf("5a");

        //Integer a4 = Integer.parseInt("5aa5");
        //System.out.println(a4);

        Float f0 = 6f;
        Float f1 = Float.valueOf(5);
        Float f2 = Float.parseFloat("+5");

        Double d1 = 5d;
        Character character = 'c';

        String str1 = "Hello World";
        str1.contains("Hello");

        str1.isEmpty();

        str1.length();

        str1.toUpperCase();
        str1.toLowerCase();

        str1.concat("");

        String str2 = str1 + "ce";

        System.out.println(5 + 6); // 1
        System.out.println(5 + "6");

        System.out.println(5 + 6 + ": number");

        System.out.println("number: " + 5 + 6);

        if (f0 == 6) {
            System.out.println("f0 is 6");
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0, j = 0; i < 50 && j % 2 == 0; i++) {
            System.out.println("i + j: " + i + " " + j);
        }

        System.out.println();
        int jj = 1;
        while (jj < 10) {
            if (jj == 5) {
                break;
            }

            if (jj % 2 == 0) {
                //continue;
            }

            System.out.print(jj);

            jj++;
        }

        System.out.println();
        int i = 0;
        do {
            i++;
            System.out.print(i + " ");
        } while (i < 10);


        /*Scanner scanner = new Scanner(System.in);

        int iii = scanner.nextInt();

        switch (iii) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
                break;
        }

        /*for (int i1 = 0; i1 < 3; i1++) {
            System.out.print("i1 " + i1);
        }*/

        /*switch (iii) {
            case 1 -> {
                System.out.println("1");
                System.out.println("si inca un 1");
            }
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default -> System.out.println("default");
        }*/

        //calculateEuroFirstMethod();

        /*AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void getValue() {

            }
        };*/

        int[] arr1 = new int[100];

        System.out.println();

        String strr = """
                String blocks
                1 bla bla
                yes
                """.concat("concat new");


        String strrr = "dd" +
                "dd" +
                5;

        String strr2 = "" +
                "String blocks\n" +
                "1 bla bla\n" +
                ("yes\n".contains("yes"));

        System.out.println("Strr: " + strr);

        System.out.println("Strr2: " + strr2);

        AbstractClass concreteClass1 = new ConcreteClass(1);
        AbstractClass concreteClass2 = new ConcreteClass2(2);

        if (concreteClass1 instanceof final ConcreteClass conc) {
            conc.printStr();
        }

        EnumClass.CASE_1.getValueForConstant();


        FunctionalInterface1 functionalInterface1 = new FunctionalInterface1() {
            @Override
            public void executeFunction() {
                System.out.println("Result executeFunction");
            }
        };
        functionalInterface1.executeFunction();

        FunctionalInterface1 functionalInterface11 = () -> System.out.println("Result executeFunction");
        functionalInterface1.executeFunction();


        FunctionalInterface2 functionalInterface2 = new FunctionalInterface2() {
            @Override
            public Double calculatePow2(Integer number) {
                return Math.pow(number, 2);
            }
        };
        functionalInterface2.calculatePow2(5);

        FunctionalInterface2 functionalInterface21 = (number) -> Math.pow(number, 2);
        functionalInterface21.calculatePow2(5);


        List<Person> personList = new ArrayList<>();

        var list1 = personList.stream()
                .filter(person -> person.getAge() > 5)
                .toList(); // aici se face o lista imutabila

        var list2 = personList.stream()
                .filter(person -> person.getAge() > 5)
                .collect(Collectors.toList()); // aici se face o lista mutabila

        var list3 = personList.stream()
                .map(person -> {
                    if (person.getAge() == 18) {
                        DriveLicenseInformation driveLicenseInformation = new DriveLicenseInformation();
                        driveLicenseInformation.setCreationDate(Date.from(Instant.now()));
                    }

                    return person;
                })
                .sorted()
                .distinct()
                .filter(person -> person.getAge() > 5)
                .toList();
    }

    public static int calculateEuroFirstMethod() {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        int j = 50;
        return switch (i) {
            case 1 -> j * 2;
            case 2 -> j * 3;
            case 3 -> j * 4;
            case 4 -> {
                int i1 = j + i * 5;
                yield j + 5 * i1;
            }
            default -> j * 10;
        };
    }
}