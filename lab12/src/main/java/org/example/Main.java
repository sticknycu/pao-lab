package org.example;

class GenericClass<T> {

    private T parameter;

    public GenericClass(T parameter) {
        this.parameter = parameter;
    }

    public void modifyObject(T parameter) {
        ///
    }
}

class NumberOperations<T extends Number> {

    private T parameter;

    public NumberOperations(T parameter) {
        this.parameter = parameter;
    }

    public Double add(T number1, T number2) {
        return number1.doubleValue() + number2.doubleValue();
    }
}

class Animal {

    private Integer age;

    private String number;

    public Animal(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

class Dog extends Animal {

    public Dog(Integer age) {
        super(age);
    }
}

class Cat extends Animal {

    public Cat(Integer age) {
        super(age);
    }
}

class GenericAnimal<T extends Animal> {

    private T genericAnimal;

    // constructor
    // metode
}