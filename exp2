// Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Multiple Inheritance using Interfaces
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Display implements Printable, Showable {

    public void print() {
        System.out.println("Printing data");
    }

    public void show() {
        System.out.println("Showing data");
    }
}

// Main class
public class InheritanceDemo {

    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("----- Single Inheritance -----");
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel Inheritance
        System.out.println("\n----- Multilevel Inheritance -----");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        // Hierarchical Inheritance
        System.out.println("\n----- Hierarchical Inheritance -----");
        Cat c = new Cat();
        c.eat();
        c.meow();

        // Multiple Inheritance using Interfaces
        System.out.println("\n----- Multiple Inheritance -----");
        Display obj = new Display();
        obj.print();
        obj.show();
    }
}