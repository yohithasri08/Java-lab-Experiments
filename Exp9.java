
class ReservationThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Reservation Thread: Ticket reservation in progress - " + i);

                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Reservation thread interrupted.");
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Reservation thread completed.");
    }
}

class StatusThread implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Status Thread: Ticket confirmation successful - " + i);

                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Status thread interrupted.");
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Status thread completed.");
    }
}

public class Exp9 {
    public static void main(String[] args) {
        System.out.println("Ticket Reservation System Started");
        System.out.println("----------------------------------");

        // Create a thread using the Thread class
        ReservationThread reservation = new ReservationThread();

        // Create a thread using the Runnable interface
        StatusThread status = new StatusThread();
        Thread confirmation = new Thread(status);

        // Start both threads concurrently
        System.out.println("Starting reservation and confirmation threads...");

        reservation.start();
        confirmation.start();

        // Display the main thread message
        System.out.println("Both threads are executing concurrently.");

        // Wait for both threads to complete
        try {
            reservation.join();
            confirmation.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("----------------------------------");
        System.out.println("All ticket reservation operations completed.");
        System.out.println("Ticket Reservation System Ended");
    }
}
