import java.util.Scanner;

// Abstract class
abstract class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    abstract void start();

    // Normal method
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Interface
interface Electric {

    void charge();
}

// Child class implementing interface
class ElectricCar extends Vehicle implements Electric {

    ElectricCar(String brand) {
        super(brand);
    }

    // Overriding abstract method
    @Override
    void start() {
        System.out.println("Electric car starts silently.");
    }

    // Implementing interface method
    @Override
    public void charge() {
        System.out.println("Electric car is charging.");
    }
}

// Another child class
class PetrolCar extends Vehicle {

    PetrolCar(String brand) {
        super(brand);
    }

    // Overriding abstract method
    @Override
    void start() {
        System.out.println("Petrol car starts using the engine.");
    }
}

// Main class
public class VehicleDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electric car brand: ");
        String electricBrand = sc.nextLine();

        System.out.print("Enter petrol car brand: ");
        String petrolBrand = sc.nextLine();

        // Dynamic Method Dispatch
        Vehicle v1 = new ElectricCar(electricBrand);
        Vehicle v2 = new PetrolCar(petrolBrand);

        System.out.println("\n----- Electric Car -----");
        v1.displayBrand();
        v1.start();

        // Type casting to access interface method
        Electric e = (Electric) v1;
        e.charge();

        System.out.println("\n----- Petrol Car -----");
        v2.displayBrand();
        v2.start();

        sc.close();
    }
}