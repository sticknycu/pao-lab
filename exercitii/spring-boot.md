### Spring Boot Tasks

Implementeaza o solutie folosind Spring Boot, pentru a implementa un mini-sistem bancar.

O sa ai o clasa ’Account’ prin care vrem sa stocam informatiile conturilor clientilor nostri, clasa ’Client’ prin care ne definim toti clientii existenti. Exista relatie one-to-many.

- Clasa Account contine id-ul contului, suma contului, alias-ul, id-ul clientului, tipul de cont si numarul contului (16 cifre).
- Clasa Client contine informatii despre client cum ar fi ’detaliile personale ale clientului’ (nume, prenume, an nastere, loc nastere, ora nasterii), mail, tipul de client.
- Tipul de cont este o clasa enum ’AccountType’ si contine urmatoarele tipuri: PERSONAL, BUSINESS.

Toate clasele o sa contina campurile: id-ul, creationDate, disableDate si updatedDate (fara enum).


1. Implementeaza toate modelele necesare ale aplicatiei, service-urile si repository-urile in functie de tipul modelului.
2. Creeaza in controller metode de GET pentru a obtine un obiect, POST pentru a crea un obiect, PUT pentru a edita tot obiectul, PATCH pentru am modifica doar o parte din el si DELETE pentru a sterge.
3. Un DTO este o clasa care se cheama Data Transfer Object. Creeaza un folder in layer-ul 'model' unde sa creezi pentru fiecare obiect de tip model (inafara de enum), un obiect de tip DTO.
Un obiect de tip DTO nu contine adnotarea @Entity si adnotarea @Table. Instaleaza libraria MapStruct si creeaza layer-ul 'mapper' unde sa creezi mappere exact dupa exemplul oferit pe site-ul MapStruct si sa convertesti un Entity la un DTO.
Mai exact, foloseste repository pentru a obtine un entity, iar dupa aceea in service o sa convertesti, exact dupa linia unde ai obtinut din repository entitatea respectiva, o sa te folosesti de clasa mapper ca sa convertesti o entitate la un DTO.
4. Creeaza un layer care se cheama 'layout' care va contine obiecte de tip 'request' si 'response'. Creeaza in layout clase de tip 'response' care sa contina toate campurile unui DTO/Entitate, dar fara sa contina campul id. In controller expune clasele Response ca sa vina ca raspuns, nu entitatile sau DTO-urile. Construieste in service, la finalul metodei clasele de tip response, folosind mappere.
5. Creeaza in controller o metoda 'POST' prin care se transmite un 'RequestBody' care contine campurile: sorted (crescator/descrescator), page si limit, prin care o sa returnezi un raspuns in functie de RequestBody-ul care se transmite (adica sortate si paginate).