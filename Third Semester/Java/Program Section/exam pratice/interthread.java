class Example extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {

            for (int i = 0; i < 100; i++) {
                total += i;
            }
            this.notify();
        }
    }
}

public class interthread {
    public static void main(String[] args) {
        Example e = new Example();
        e.start();
        synchronized (e) {
            try {
                e.wait();
                System.out.println(e.total);
            } catch (Exception ex) {
                System.out.println("Error");
            }
        }
    }
}
