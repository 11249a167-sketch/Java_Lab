class StudentThread extends Thread {

    private String threadName;

    StudentThread(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + " is running");
    }
}

public class Multithread {

    public static void main(String[] args) {

        StudentThread t1 = new StudentThread("Thread 1");
        StudentThread t2 = new StudentThread("Thread 2");
        StudentThread t3 = new StudentThread("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
