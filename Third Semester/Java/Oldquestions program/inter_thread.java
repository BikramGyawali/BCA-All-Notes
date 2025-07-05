class test extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {

                total += i;
            }
            this.notify();
        }

    }
}

public class inter_thread {
    public static void main(String[] args) {

        test t = new test();
        t.start();

        synchronized (t) {

            try {
                t.wait();
                System.out.println("Total is: " + t.total);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}
