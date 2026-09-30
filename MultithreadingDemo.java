
// Multithreading using Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " : " + i);
        }
    }
}

// Multithreading using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " : " + i);
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {

        // Creating threads using Thread class
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        System.out.println("Using Thread Class:");
        t1.start();
        t2.start();
        t3.start();

        // Creating threads using Runnable interface
        MyRunnable obj = new MyRunnable();

        Thread t4 = new Thread(obj, "Thread 4");
        Thread t5 = new Thread(obj, "Thread 5");
        Thread t6 = new Thread(obj, "Thread 6");

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("\nUsing Runnable Interface:");
        t4.start();
        t5.start();
        t6.start();
    }
}

