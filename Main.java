// Class 1: Student
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

// Class 2: Car
class Car {
    String model;
    double price;

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Price: $" + price);
    }
}

// Class 3: Employee
class Employee {
    String empName;
    int empId;

    Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + empName);
    }
}

// Class 4: Book
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Title: " + title + ", Author: " + author);
    }
}

// Class 5: Laptop
class Laptop {
    String brand;
    int ram;

    Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    void display() {
        System.out.println("Laptop Brand: " + brand + ", RAM: " + ram + "GB");
    }
}

// Class 6: Mobile
class Mobile {
    String brand;
    double price;

    Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Mobile Brand: " + brand + ", Price: $" + price);
    }
}

// Class 7: City
class City {
    String name;
    int population;

    City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    void display() {
        System.out.println("City: " + name + ", Population: " + population);
    }
}

// Class 8: Animal
class Animal {
    String name;
    String type;

    Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void display() {
        System.out.println("Animal: " + name + ", Type: " + type);
    }
}

// Class 9: Product
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

// Class 10: Movie
class Movie {
    String title;
    int year;

    Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    void display() {
        System.out.println("Movie: " + title + ", Year: " + year);
    }
}


public class Main {
    public static void main(String[] args) {
        
        
        System.out.println("---- Student Objects ----");
        for (int i = 1; i <= 10; i++) {
            new Student("Student" + i, 18 + i).display();
        }

        System.out.println("\n---- Car Objects ----");
        for (int i = 1; i <= 10; i++) {
            new Car("Model" + i, 20000 + (i * 1000)).display();
        }

        System.out.println("\n---- Employee Objects ----");
        for (int i = 1; i <= 10; i++) {
            new Employee("Employee" + i, 1000 + i).display();
        }

        System.out.println("\n---- Book Objects ----");
        for (int i = 1; i <= 10; i++) {
            new Book("Book" + i, "Author" + i).display();
        }

        System.out.println("\n---- Laptop Objects ----");
        for (int i = 1; i <= 10; i++) {
            new Laptop("Brand" + i, 4 + (i * 2)).display();
        }

        System.out.println("\n---- Mobile Objects ----");
        for (int i = 1; i <= 10; i++) {
            new Mobile("Brand" + i, 500 + (i * 50)).display();
        }

        System.out.println("\n---- City Objects ----");
        for (int i = 1; i <= 10; i++) {
            new City("City" + i, 100000 + (i * 5000)).display();
        }
        System.out.println("\n---- Animal Objects ----");
        for (int i = 1; i <= 10; i++) {
            new Animal("Animal" + i, (i % 2 == 0) ? "Wild" : "Domestic").display();
        }

        System.out.println("\n---- Product Objects ----");
        for (int i = 1; i <= 10; i++) {
            new Product("Product" + i, 10 + (i * 5)).display();
        }

        System.out.println("\n---- Movie Objects ----");
        for (int i = 1; i <= 10; i++) {
            new Movie("Movie" + i, 2000 + i).display();
        }
    }
}