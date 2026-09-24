class Student {

    // Data members
    int rollNo;
    String name;
    int marks;

    // Constructor
    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Method to check result
    void checkResult() {
        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

// Main class
public class StudentDemo {
    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student(101, "Anu", 85);
        Student s2 = new Student(102, "Ravi", 35);

        // Calling methods
        System.out.println("Student 1 Details");
        s1.displayDetails();
        s1.checkResult();

        System.out.println();

        System.out.println("Student 2 Details");
        s2.displayDetails();
        s2.checkResult();
    }
}