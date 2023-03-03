# Programare Avansata pe Obiecte

### Resurse

In folderul "books" sunt cateva carti de Java/Spring/Hibernate/Arhitectura care pot fi utile acum si pe viitor. Am pus si o "prioritate" (reprezinta numarul din fata fiecarei carti), dupa cum pot fi citite.

In folderul "cursuri 2022" sunt cursurile de anul trecut.

In folderul "algorithms" sunt carti de algoritmica.

Websites:
- [Baeldung](https://www.baeldung.com/java-tutorial)
- [Java Design Patterns](https://www.journaldev.com/1827/java-design-patterns-example-tutorial)
- [Vlad Mihalcea Blog](https://vladmihalcea.com/blog/)
- [Spring](https://spring.io/)
- [StackOverflow](https://stackoverflow.com/questions/tagged/java?tab=Votes)
- [ChatGPT](https://chat.openai.com/)

### Notare
Fiecare student va lucra la un proiect individual.

Proiectul este structurat în mai multe etape.


Conditia de punctare a proiectelor:
- să nu prezinte erori de compilare
- să se implementeze cerintele date

```
Proiectele se vor prezenta online, fiecare va fi programat cate 20 minute pentru prezentare.
La prezentare o sa primiti si intrebari despre limbaj si despre ce am facut pana in momentul respectiv.
O sa primiti un doc in saptamana in care este deadline-ul de predare al temei, cu fiecare la ce ora este programat si ziua, iar dupa aceea o sa imi semnalati daca nu puteti prezenta atunci si putem modifica.
```

#### Termen de predare si examinare

- Etapa I: saptamana 3 – 7 aprilie **(5p)**
- Etapa II: saptamana 24 – 28 mai **(5p)**

❕ *Laboratorul inseamna 40% din nota finala. Nota de laborator se obtine astfel: 50% prima etapa + 50% a doua etapa a proiectului + bonus*


##### Etapa I
1) Definirea sistemului
- Să se creeze o lista pe baza temei alese cu cel puțin 10 acțiuni/interogări care se pot face în cadrul sistemului și o lista cu cel puțin 8 tipuri de obiecte.
2) Implementare
- Sa se implementeze în limbajul Java o aplicație pe baza celor definite la primul punct. 
- Aplicația va conține:
- - clase simple cu atribute private / protected și metode de acces
- - cel puțin 2 colecții diferite capabile să gestioneze obiectele definite anterior (eg: List, Set, Map, etc.) dintre care cel puțin una sa fie sortata –se vor folosi array-uri uni-/bidimensionale în cazul în care nu se parcurg colectiile pana la data checkpoint-ului.
- - utilizare moștenire pentru crearea de clase adiționale și utilizarea lor încadrul colecțiilor;
- - cel puțin o clasă serviciu care sa expună operațiile sistemului
- - o clasa Main din care sunt făcute apeluri către servicii 

##### Etapa II
1) Extindeți proiectul din prima etapa prin realizarea persistentei utilizând o baza de date relationala si JDBC. 
- Să se realizeze servicii care sa expună operații de tip create, read, update si delete pentru cel puțin 4 dintre clasele definite.
- Se vor realiza servicii singleton generice pentru scrierea și citirea din baza de date.
2) Realizarea unui serviciu de audit
- Se va realiza un serviciu care sa scrie într-un fișier de tip CSV de fiecare data când este executată una dintre acțiunile descrise în prima etapa. 
- Structura fișierului: nume_actiune, timestamp.

##### Teme sugerate (Va puteti alege si alte teme, sunt doar sugestii de teme pe care le puteti alege)
1) catalog (student, materie, profesor) 
2) biblioteca (sectiuni, carti, autori, cititori) 
3) programare cabinet medical (client, medic, programare) 
4) gestiune stocuri magazin (categorii, produse, distribuitori) 
5) aplicatie bancara (conturi,extras de cont, tranzactii, carduri, servicii) 
6) platfora e-learning (cursuri, utilizatori, cursanti, quizuri) 
7) sistem licitatii (licitatii, bids, produse, utilizatori) 
8) platforma food delivery (localuri, comenzi, soferi, useri) 
9) platforma imprumuturi carti -tip bookster (companii afiliate, utilizatori, carti) 
10) platformae-ticketing (evenimente, locatii, clienti)

##### Observatii
1) Toata lumea trebuie sa foloseasca Git & Maven. Proiectele nu se trimit ca arhiva.
2) Proiectul trebuie sa aiba documentatie. Fiecare scrie documentatia cum vrea, in doc/pdf sau in cod. Trebuie sa stii sa explici ce ai facut in cod, nu e de ajuns doar sa-l scrii.
2) Versiunea Java o sa fie **MINIM** 17.
3) O sa folosim Docker & Docker-Compose pentru baza de date.
4) O sa folosim Github Workflows pentru pipelines. Se pot accepta alternative pentru cei care vor sa foloseasca altceva.
5) Cei mai activi o sa aiba o surpriza la final de semestru.

##### Bonusuri (aprox. 14 laboratoare in total - Max 3p)
1) Kahoot. Primii 5 studenti primesc 0.1 per kahoot. (Maxim 1p - 4 laboratoare o sa fie rezervate pentru prezentari si pregatire pentru examen)
2) Intrebari laborator. Fiecare activitate se puncteaza cu 1. Primii 5 studenti cu cele mai multe puncte primesc 1p, primii ceilalti 5 primesc 0.5. (Maxim 1p)
3) La final o sa facem cateva notiuni de Spring, iar cine face mini-temele o sa primeasca maxim 1p. (Maxim 1p)

#### Cracking the Coding Interview
- [Structuri de Date](https://youtu.be/RBSGKlAvoiM)
- [Grafuri](https://youtu.be/09_LlHjoEiY)
- [Algoritmi - Exercitii - LeetCode](https://leetcode.com/problems/) - De obicei cele easy/medium se dau, nu chestii grele
- [FreeCodeCamp - Coding Interview Prep](https://www.freecodecamp.org/learn/coding-interview-prep/)
- [Daily Coding Problem](https://www.dailycodingproblem.com/) -- FAANG

##### Laborator 1

* Intrebari, diferente C++ si Java, comparare cu alte limbaje, etc.
* Notiuni basic de Git.
* if-uri, for-uri, while-uri, do-while-uri, switch-uri, primitive, clase, mostenire (basic), interfete (basic), array-uri.
* constructori, destructori, garbage collector, jvm (JIT, AOT compilers), memorie, blocks.
* Modul de notare, observatii, bonusuri.

##### Laborator 2
* getters, setters, equals, hashcode, comparation (equals/hashcode), yield blocuri switch, return switch, switch variable, text-block string, pattern matching (instanceof, scope)
* final, static (blocks + keyword), imutabilitate
* Modificatori de access: public, protected, default, public
* Abstractizare, Incapsulare, Mostenire, Polimorfism (static/dinamic --> supraincarcare/suprascriere), Abstract methods in enums
* Clase Abstracte, Interfete (+ Clasa Abstracta vs Interfata) Records, Nested Classes (basic)
* Clasa String (cu metode + imutabilitate)

##### Laborator 3 - Interview Lab
Continuare lab2: abstract class in enums, nested classes, extindere interfete (un fel de diamond problem), order of initialization, polimorfism (static & non static class), clasa Arrays.
* Interfata functionala, Lambda Function, Predicate, Consumer, Function, Supplier, Optional, Collections, Stream API
* Binary Search, Binary Trees
* Threading (basic), Comparator Interface, Load Factor & Capacity
* StringBuilder vs StringBuffer + complexitati
* List, ArrayList vs LinkedList + complexitati
* Set, HashSet vs TreeSet vs LinkedHashSet + complexitati
* Map, HashMap vs Hashtable vs LinkedHashMap + complexitati
* Coliziuni hashmap (chaining, linear probing)
* Queue, PriorityQueue vs Deque + complexitati
* Vector vs Stack + complexitati

##### Laborator 4 - Interview Lab
* TODO