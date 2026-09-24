import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter marks in Java: ");
        int java = sc.nextInt();

        System.out.print("Enter marks in Python: ");
        int python = sc.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        int maths = sc.nextInt();

        // Calculating total and average
        int total = java + python + maths;
        double average = total / 3.0;

        // Displaying student details
        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Java Marks: " + java);
        System.out.println("Python Marks: " + python);
        System.out.println("Mathematics Marks: " + maths);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        // Checking grade
        if (average >= 90) {
            System.out.println("Grade: A+");
        } else if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Closing Scanner
        sc.close();
    }
}