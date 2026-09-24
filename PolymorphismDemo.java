class Calculator {

    // Method Overloading - Compile-time Polymorphism

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Parent class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    // Method Overriding - Runtime Polymorphism
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class PolymorphismDemo {

    public static void main(String[] args) {

        // Compile-time Polymorphism
        System.out.println("----- Compile-time Polymorphism -----");

        Calculator calc = new Calculator();

        System.out.println("Addition of 2 integers: "
                           + calc.add(10, 20));

        System.out.println("Addition of 3 integers: "
                           + calc.add(10, 20, 30));

        System.out.println("Addition of 2 double values: "
                           + calc.add(10.5, 20.5));


        // Runtime Polymorphism
        System.out.println("\n----- Runtime Polymorphism -----");

        Animal animal = new Dog();

        animal.sound();
    }
}