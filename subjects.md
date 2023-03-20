<h3>Subjects</h3>
Diverse subiecte/intrebari discutate la laborator.



<h5>SOLID Principles & Constant Interface </h5>

Aveti aici despre: [SOLID Principles](https://www.baeldung.com/solid-principles)
Si despre [Constant Interface](https://stackoverflow.com/questions/2659593/what-is-the-use-of-interface-constants)


<h5>Mostenire abstract/normal class</h5>

Am mai incercat niste chestii pe care le-am discutat la laborator cu unul din colegii vostrii, nu stiu cat de clar a fost pentru toata lumea, dar sunt cazurile urmatoare:




- Am o clasa de baza: BaseClass, o clasa Animal care extinde clasa BaseClass si dupa aceea clasa Cat, toate clase normale, atunci constructorii nu sunt necesari. 

Codul compileaza si fara sa adaugam constructorii. In cazul in care avem constructor in BaseClass, nu avem constructor in Animal si avem constructor in clasa Cat, atunci o sa se apeleze constructorul din BaseClass, chiar daca apelam sau nu constructorul din BaseClass in clasa Animal.
	
Totul se apeleaza normal, se apeleaza constructorul din Cat(), dupa aceea cel din Animal() si dupa aceea cel din BaseClass().
	

<u>Ideea din spate este ca in Java se apeleaza constructorul din clasa de baza implicit, inainte de a apela constructorul din clasa derivata.</u>


Astfel, daca in clasa de baza, BaseClass, avem constructori cu parametrii, iar noi nu avem un constructor care sa apeleze constructorul cu parametrii in clasa Animal, o sa primim o eroare de compilare deoarece compilatorul nu gaseste niciun constructor care sa mapeze pe constructorul din clasa BaseClass. (asta in cazul in care nu definim un constructor fara parametrii in BaseClass)
	
Din acelasi motiv, nu merge sa facem constructorul privat in clasa BaseClass, daca clasa Animal extinde clasa BaseClass, o sa tipe compilatorul la noi.

- Am o clasa de baza BaseClass, o clasa Animal care extinde clasa BaseClass, iar clasa Animal este o clasa abstracta, iar clasa Cat care extinde clasa Animal, clasa Cat fiind o clasa normala, <u>atunci totul se intampla exact la fel</u>.

Am pus pe github si codul la "incercarea" asta.
	
Gasiti [aici](https://www.baeldung.com/java-abstract-classes-constructors) si mai multe explicatii.


<h5>Order of initialization</h5>

<img src="imgs/order_of_initialization.png">

<h5>'final' keyword on method parameters</h5>

V-am zis la primul laborator ca se poate adauga 'final' si la parametrii metodelor.

Cred ca merita aruncat un ochi peste [asta](https://stackoverflow.com/questions/2236599/final-keyword-in-method-parameters) si [asta](https://stackoverflow.com/questions/500508/why-should-i-use-the-keyword-final-on-a-method-parameter-in-java).

<h5>Abstract Rules</h5>

- Only instance methods can be marked abstract within a class, not variables, constructors, or static methods.
- An abstract method can only be declared in an abstract class.
- A non-abstract class that extends an abstract class must implement all inherited abstract methods.
- An abstract class is most commonly used when you want another class to inherit properties of a particular class, but you want the subclass to fill in some of the implementation details.
- An abstract class is not required to include any abstract methods.

A method cannot be marked as both abstract and private. This rule makes sense if you think about it. How would you define a subclass that implements a required method if the method is not inherited by the subclass? The answer is that you can't, which is why the compiler will complain if you try to do it.

While it is not possible to declare a method abstract and private, it is possible (albeit redundant) to declare a method final and private.

<h5>Declaring an Immutable Class</h5>

Although there are a variety of techniques for writing an immutable class, you should be familiar with a common strategy for making a class immutable:
- Mark the class as final or make all of the constructors private.
- Mark all the instance variables private and final.
- Don't define any setter methods.
- Don't allow referenced mutable objects to be modified.
- Use a constructor to set all properties of the object, making a copy if needed.

COPY ON READ ACCESSOR METHODS

Besides delegating access to any private mutable objects, another approach is to make a copy of the mutable object any time it is requested.

```java
public ArrayList<String> getFavoriteFoods() {
    return new ArrayList<String>(this.favoriteFoods);
}
```
Of course, changes in the copy won't be reflected in the original, but at least the original is protected from external changes. This can be an expensive operation if called frequently by the caller.

<h5>Enum Classes - Constructors </h5>

Enum Classes can only have private constructors.

Enum without a constructor:

```java
enum Day{
SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
```

Enum with a constructor:

```java
enum Size {
    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    private final String pizzaSize;
    // private enum constructor
    private Size(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }
}
```
Why can’t we have a public enum constructor?

We need the enum constructor to be private because enums define a finite set of values (SMALL, MEDIUM, LARGE). If the constructor was public, people could potentially create more value. (for example, invalid/undeclared values such as ANYSIZE, YOURSIZE, etc.).

Enum in Java contains fixed constant values. So, there is no reason in having a public or protected constructor as you cannot create an enum instance. Also, note that the internally enum is converted to class. As we can’t create enum objects explicitly, hence we can’t call the enum constructor directly.

<h5>Method References</h5>

V-am zis la laborator de method reference, poate [asta](https://www.baeldung.com/java-method-references) va ajuta sa va clarificati mai mult despre idee.

<h5>Program to interfaces</h5>
Un lucru foarte important pe care vi l-am mentionat la laborator este sa programati folosind interfete.

Cred ca v-ar ajuta sa cititi urmatorul articol pentru a intelege problema mai bine. Nu este neaparat de Java, acest lucru trebuind sa fie respectat in orice limbaj de programare, cu mai mult sau mai putin POO.

Incercati sa va faceti putin timp sa il [cititi](https://www.baeldung.com/cs/program-to-interface). 
