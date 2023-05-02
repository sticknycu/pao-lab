### Creational Design Patterns:

#### Story:

You have been tasked with designing a software system for a car rental company. The system needs to be able to manage different types of cars, handle reservations and cancellations, and generate reports on rental activity. The system should be easy to use, reliable, and scalable.

#### Requirements:

1. The system needs to be able to manage different types of cars, such as sedans, SUVs, and sports cars.

- Classes: Car, Sedan, SUV, SportsCar
- Design Pattern: Factory Method pattern


- Explanation: The Car class can be used as a base class for different types of cars, such as Sedan, SUV, and SportsCar. The Factory Method pattern can be used to define a factory class for each type of car, allowing the system to create and manage different types of cars without having to modify the client code.

2. The system needs to be able to handle reservations and cancellations.

- Classes: Reservation, Cancellation
- Design Pattern: Singleton pattern


- Explanation: The Reservation and Cancellation classes can be used to manage reservations and cancellations, respectively. The Singleton pattern can be used to ensure that there is only one instance of each class in the system, reducing the risk of errors or conflicts.

3. The system needs to be able to generate reports on rental activity.

- Classes: Report, RentalActivity
- Design Pattern: Prototype pattern


- Explanation: The Report class can be used to generate reports on rental activity, and the RentalActivity class can be used to manage rental data. The Prototype pattern can be used to create and modify copies of the Report class, allowing the system to generate customized reports based on different types of rental activity.


4. The system needs to be able to handle different types of rentals, such as hourly, daily, and weekly rentals.

- Classes: Rental, HourlyRental, DailyRental, WeeklyRental
- Design Pattern: Factory Method pattern


- Explanation: The Rental class can be used as a base class for different types of rentals, such as HourlyRental, DailyRental, and WeeklyRental. The Factory Method pattern can be used to define a factory class for each type of rental, allowing the system to create and manage different types of rentals without having to modify the client code.

5. The system needs to be able to handle different types of customers, such as individuals and businesses.

- Classes: Customer, IndividualCustomer, BusinessCustomer
- Design Pattern: Abstract Factory pattern


- Explanation: The Customer class can be used as a base class for different types of customers, such as IndividualCustomer and BusinessCustomer. The Abstract Factory pattern can be used to define a factory class for each type of customer, allowing the system to create and manage different types of customers without having to modify the client code.

6. The system needs to be able to handle different types of locations, such as city and airport locations.

- Classes: Location, CityLocation, AirportLocation
- Design Pattern: Builder pattern


- Explanation: The Location class can be used to manage different types of locations, such as CityLocation and AirportLocation. The Builder pattern can be used to define a builder class for each type of location, allowing the system to create and manage different types of locations with a flexible and customizable approach.


7. The system needs to be able to generate rental agreements for customers.

- Classes: RentalAgreement, Customer
- Design Pattern: Prototype pattern


- Explanation: The RentalAgreement class can be used to generate rental agreements for customers, and the Customer class can be used to manage customer data. The Prototype pattern can be used to create and modify copies of the RentalAgreement class, allowing the system to generate customized rental agreements based on different types of customers and rentals.


8. The system needs to be able to handle different types of payment methods, such as credit cards and online payments.


- Classes: Payment, CreditCardPayment, OnlinePayment
- Design Pattern: Factory Method pattern


- Explanation: The Payment class can be used as a base class for different types of payments, such as CreditCardPayment and OnlinePayment. The Factory Method pattern can be used to define a factory class for each type of payment, allowing the system to create and manage different types of payments without having to modify the client code.


9. The system needs to be able to handle different types of car upgrades, such as GPS and satellite radio.


- Classes: Upgrade, GPSUpgrade, SatelliteRadioUpgrade
- Design Pattern: Builder pattern


- Explanation: The Upgrade class can be used as a base class for different types of car upgrades, such as GPSUpgrade and SatelliteRadioUpgrade. The Builder pattern can be used to define a builder class for each type of upgrade, allowing the system to create and manage different types of upgrades with a flexible and customizable approach.


10. The system needs to be able to handle different types of car maintenance, such as oil changes and tire rotations.

- Classes: Maintenance, OilChangeMaintenance, TireRotationMaintenance
- Design Pattern: Prototype pattern


- Explanation: The Maintenance class can be used as a base class for different types of car maintenance, such as OilChangeMaintenance and TireRotationMaintenance. The Prototype pattern can be used to create and modify copies of the Maintenance class, allowing the system to generate customized maintenance schedules based on different types of cars and rental activity.



###### Singleton Pattern
- Ensures that a class has only one instance and provides a global point of access to that instance.

Example: A logging system in a web application that needs to write log messages to a single file.

```java
public class Logger {
    private static Logger instance;
    
    private Logger() {
        // Private constructor to prevent instantiation from outside the class
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    public void log(String message) {
        // Write the log message to a file
    }
}
```

###### Factory Method Pattern
- Provides an interface for creating objects, but allows subclasses to decide which class to instantiate.

Example: A web application that needs to support multiple payment gateways (e.g. PayPal, Stripe, etc.) for processing payments.

```java
public abstract class PaymentGateway {
    public abstract void processPayment();
}

public class PayPalGateway extends PaymentGateway {
    public void processPayment() {
        // Implement PayPal payment processing logic
    }
}

public class StripeGateway extends PaymentGateway {
    public void processPayment() {
        // Implement Stripe payment processing logic
    }
}

public interface PaymentGatewayFactory {
    public PaymentGateway createPaymentGateway();
}

public class PayPalGatewayFactory implements PaymentGatewayFactory {
    public PaymentGateway createPaymentGateway() {
        return new PayPalGateway();
    }
}

public class StripeGatewayFactory implements PaymentGatewayFactory {
    public PaymentGateway createPaymentGateway() {
        return new StripeGateway();
    }
}
```

###### Abstract Factory Pattern
- Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

Example: A web application that needs to create user interfaces (UIs) for different platforms (e.g. desktop, mobile, etc.).

```java
public interface Button {
    public void click();
}

public class DesktopButton implements Button {
    public void click() {
        // Implement desktop button click logic
    }
}

public class MobileButton implements Button {
    public void click() {
        // Implement mobile button click logic
    }
}

public interface UIComponentFactory {
    public Button createButton();
}

public class DesktopUIComponentFactory implements UIComponentFactory {
    public Button createButton() {
        return new DesktopButton();
    }
}

public class MobileUIComponentFactory implements UIComponentFactory {
    public Button createButton() {
        return new MobileButton();
    }
}
```

###### Builder Pattern

- Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

Example: A web application that needs to generate reports in different formats (e.g. PDF, CSV, etc.).

```java
public class Report {
    private String title;
    private List<String> data;
    
    public Report(String title, List<String> data) {
        this.title = title;
        this.data = data;
    }
    
    public String getTitle() {
        return title;
    }
    
    public List<String> getData() {
        return data;
    }
}

public interface ReportBuilder {
    public void setTitle(String title);
    public void setData(List<String> data);
    public Report build();
}

public class PDFReportBuilder implements ReportBuilder {
    private String title;
    private List<String> data;
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setData(List<String> data) {
        this.data = data;
    }
    
    public Report build() {
        // Implement PDF report building logic
        return new Report(title, data);
    }
}

public class CSVReportBuilder implements ReportBuilder {
    private String title;
    private List<String> data;
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setData(List<String> data) {
        this.data = data;
    }
    
    public Report build() {
        // Implement CSV report building logic
        return new Report(title, data);
    }
}

public class ReportDirector {
    private ReportBuilder builder;
    
    public ReportDirector(ReportBuilder builder) {
        this.builder = builder;
    }
    
    public Report buildReport(String title, List<String> data) {
        builder.setTitle(title);
        builder.setData(data);
        return builder.build();
    }
}
```

###### Prototype Pattern

- Allows objects to be created by cloning an existing object, rather than by instantiating a class from scratch.

Example: A web application that needs to generate reports based on user input.

```java
public abstract class Report implements Cloneable {
    private String title;
    private List<String> data;
    
    public Report(String title, List<String> data) {
        this.title = title;
        this.data = data;
    }
    
    public String getTitle() {
        return title;
    }
    
    public List<String> getData() {
        return data;
    }
    
    public abstract Report clone();
}

public class PDFReport extends Report {
    public PDFReport(String title, List<String> data) {
        super(title, data);
    }
    
    public Report clone() {
        // Implement PDF report cloning logic
        return new PDFReport(getTitle(), getData());
    }
}

public class CSVReport extends Report {
    public CSVReport(String title, List<String> data) {
        super(title, data);
    }
    
    public Report clone() {
        // Implement CSV report cloning logic
        return new CSVReport(getTitle(), getData());
    }
}

public class ReportCache {
    private static Map<String, Report> cache = new HashMap<>();
    
    public static Report getReport(String type) {
        Report report = cache.get(type);
        return (Report) report.clone();
    }
    
    public static void loadCache() {
        PDFReport pdfReport = new PDFReport("PDF Report", Arrays.asList("data1", "data2"));
        cache.put("pdf", pdfReport);
        CSVReport csvReport = new CSVReport("CSV Report", Arrays.asList("data1", "data2"));
        cache.put("csv", csvReport);
    }
}
```