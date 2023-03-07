public class Main {

        public static void main(String[] args) {
            Animal cat = new Cat();
            Animal dog = new Dog();

            AnimalType.CAT.getNumber();

            AnimalType animalType = AnimalType.DOG;
            System.out.println(animalType.getNumber());

            Interfata1 interfataExtinsa = new ClasaImplementeazaInterfata();
            interfataExtinsa.print();



        }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data)) {
            return;
        }
        System.out.print(data.intValue());
    }
}

enum AnimalType {
    CAT("Cat", 0L) {
        @Override
        Integer getNumber() {
            System.out.println("CAT");
            return 0;
        }
    },
    DOG("Dog", 1L) {
        @Override
        Integer getNumber() {
            System.out.println("DOG");
            return 1;
        }
    };

    AnimalType(String name, Long date) {
        this.name = name;
        this.date = date;
    }

    Integer getNumber() {
        return DOG.getNumber();
    }

    private String name;

    private Long date;
}

class Animal {
    public Animal() {
        System.out.println("Se apeleaza constructorul din clasa Animal");
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("Se apeleaza constructorul din clasa Cat");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("Se apeleaza constructorul din clasa Dog");
    }
}

interface Interfata1 {

    void print();
}

interface Interfata2 {
    void print();
}

class Interfata1Impl implements Interfata1 {

    public void print() {
        System.out.println("Interfata1Impl");
    }
}

class Interfata2Impl implements Interfata2 {

        public void print() {
            System.out.println("Interfata2Impl");
        }
}

interface InterfataExtinsa extends Interfata1, Interfata2 {
    void print();
}

class ClasaImplementeazaInterfata implements InterfataExtinsa {

    public void print() {
        System.out.println("ClasaImplementeazaInterfata");
    }
}