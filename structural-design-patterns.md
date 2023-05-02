### Structural Design Patterns

#### Story:

You have been hired by a company that provides a suite of financial management tools for small businesses. The company's existing platform has become outdated and difficult to use, and they have asked you to design a new system that is easy to use, flexible, and scalable. The system should be able to manage different types of financial data, generate reports, and provide personalized advice and recommendations.

#### Requirements:

1. The system needs to be able to handle different types of financial data, such as expenses, revenue, and investments.

- Classes: FinancialData, ExpenseData, RevenueData, InvestmentData
- Design Pattern: Bridge pattern


- Explanation: The FinancialData class can be used as a base class for different types of financial data, such as ExpenseData, RevenueData, and InvestmentData. The Bridge pattern can be used to decouple the abstraction of the financial data from its implementation, allowing the system to handle different types of financial data with a flexible and modular approach.


2. The system needs to be able to generate reports on financial activity.

- Classes: Report, FinancialData
- Design Pattern: Composite pattern


- Explanation: The Report class can be used to generate reports on financial activity, and the FinancialData class can be used to manage financial data. The Composite pattern can be used to create a hierarchical structure of financial data, allowing the system to generate reports on different types of financial activity with a flexible and customizable approach.


3. The system needs to be able to provide personalized advice and recommendations based on financial data.

- Classes: Advisor, FinancialData
- Design Pattern: Decorator pattern


- Explanation: The Advisor class can be used to provide personalized advice and recommendations based on financial data, and the FinancialData class can be used to manage financial data. The Decorator pattern can be used to dynamically add or remove advice and recommendations based on different types of financial data and user preferences.


4. The system needs to be able to handle different types of financial accounts, such as bank accounts and credit card accounts.

- Classes: Account, BankAccount, CreditCardAccount
- Design Pattern: Adapter pattern


- Explanation: The Account class can be used as a base class for different types of financial accounts, such as BankAccount and CreditCardAccount. The Adapter pattern can be used to adapt different types of financial accounts to the same interface, allowing the system to handle different types of financial accounts with a uniform and standardized approach.

5. The system needs to be able to provide a simple and user-friendly interface for managing financial data.

- Classes: Interface, Facade
- Design Pattern: Facade pattern


- Explanation: The Interface class can be used to provide a simple and user-friendly interface for managing financial data, and the Facade class can be used to manage complex financial operations behind the scenes. The Facade pattern can be used to create a simplified interface for the user, hiding the complexity of the financial operations and improving the overall user experience.


###### Adapter Pattern

- Converts the interface of a class into another interface that the client expects.

Example: A web application that needs to integrate with a third-party payment gateway that uses a different API than the application's internal payment processing system.

```java
public interface PaymentGateway {
    public void processPayment();
}

public class InternalPaymentGateway implements PaymentGateway {
    public void processPayment() {
        // Implement internal payment processing logic
    }
}

public class ThirdPartyPaymentGateway {
    public void submitPayment() {
        // Implement third-party payment processing logic
    }
}

public class PaymentGatewayAdapter implements PaymentGateway {
    private ThirdPartyPaymentGateway gateway;
    
    public PaymentGatewayAdapter(ThirdPartyPaymentGateway gateway) {
        this.gateway = gateway;
    }
    
    public void processPayment() {
        gateway.submitPayment();
    }
}
```

###### Bridge Pattern

- Sepates an abstraction from its implementation, allowing both to vary independently.

Example: A web application that needs to support different types of databases (e.g. MySQL, Oracle, etc.).

```java
public interface Database {
    public void connect();
    public void disconnect();
}

public class MySQLDatabase implements Database {
    public void connect() {
        // Implement MySQL database connection logic
    }
    
    public void disconnect() {
        // Implement MySQL database disconnection logic
    }
}

public class OracleDatabase implements Database {
    public void connect() {
        // Implement Oracle database connection logic
    }
    
    public void disconnect() {
        // Implement Oracle database disconnection logic
    }
}

public abstract class DataObject {
    protected Database database;
    
    public DataObject(Database database) {
        this.database = database;
    }
    
    public abstract void save();
}

public class Customer extends DataObject {
    public Customer(Database database) {
        super(database);
    }
    
    public void save() {
        database.connect();
        // Implement customer save logic
        database.disconnect();
    }
}
```

###### Composite Pattern

- Allows you to compose objects into tree structures to represent part-whole hierarchies.

Example: A web application that needs to represent a menu hierarchy (e.g. main menu, submenus, etc.).

```java
public interface MenuComponent {
    public void add(MenuComponent component);
    public void remove(MenuComponent component);
    public void display();
}

public class MenuItem implements MenuComponent {
    private String name;
    
    public MenuItem(String name) {
        this.name = name;
    }
    
    public void add(MenuComponent component) {
        // Cannot add to a menu item
    }
    
    public void remove(MenuComponent component) {
        // Cannot remove from a menu item
    }
    
    public void display() {
        System.out.println(name);
    }
}

public class Menu implements MenuComponent {
    private List<MenuComponent> components = new ArrayList<>();
    
    public void add(MenuComponent component) {
        components.add(component);
    }
    
    public void remove(MenuComponent component) {
        components.remove(component);
    }
    
    public void display() {
        for (MenuComponent component : components) {
            component.display();
        }
    }
}
```

###### Decorator Pattern

- Allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class.

Example: A web application that needs to add additional features to a user account based on the user's subscription level.

```java
public interface UserAccount {
    public void login();
    public void logout();
}

public class BasicUserAccount implements UserAccount {
    public void login() {
        // Implement basic login logic
    }
    public void logout() {
        // Implement basic logout logic
    }
}

public abstract class UserAccountDecorator implements UserAccount {
    protected UserAccount userAccount;
    
    public UserAccountDecorator(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public void login() {
        userAccount.login();
    }
    
    public void logout() {
        userAccount.logout();
    }
}

public class PremiumUserAccount extends UserAccountDecorator {
    public PremiumUserAccount(UserAccount userAccount) {
        super(userAccount);
    }
    
    public void login() {
        super.login();
        // Implement premium login logic
    }
    
    public void logout() {
        super.logout();
        // Implement premium logout logic
    }
}
```

###### Facade Pattern
- Provides a simplified interface to a complex subsystem, making it easier to use and understand.

Example: A web application that needs to interact with a complex backend system (e.g. database, network, etc.).

```java
public class DatabaseSubsystem {
    public void connect() {
        // Implement database connection logic
    }
    
    public void disconnect() {
        // Implement database disconnection logic
    }
    
    public void executeQuery(String query) {
        // Implement database query logic
    }
}

public class NetworkSubsystem {
    public void connect() {
        // Implement network connection logic
    }
    
    public void disconnect() {
        // Implement network disconnection logic
    }
    
    public String sendData(String data) {
        // Implement network data sending logic
    }
}

public class BackendFacade {
    private DatabaseSubsystem database;
    private NetworkSubsystem network;
    
    public BackendFacade() {
        database = new DatabaseSubsystem();
        network = new NetworkSubsystem();
    }
    
    public void connect() {
        database.connect();
        network.connect();
    }
    
    public void disconnect() {
        database.disconnect();
        network.disconnect();
    }
    
    public String executeQuery(String query) {
        return database.executeQuery(query);
    }
    
    public String sendData(String data) {
        return network.sendData(data);
    }
}
```
