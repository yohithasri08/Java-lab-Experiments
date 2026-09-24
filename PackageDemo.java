// Importing user-defined package
import student.Student;

// Importing built-in package
import java.util.Scanner;

public class PackageDemo {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        // Creating object of Student class
        Student s = new Student(rollNo, name, marks);

        System.out.println("\n----- Student Details -----");

        // Calling methods
        s.displayDetails();
        s.checkResult();

        sc.close();
    }
}