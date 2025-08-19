class a implements Runnable {
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Thread A");
        }
    }
}

class b implements Runnable {
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Thread B");
        }
    }
}

public class runableimplement {
    public static void main(String[] args) {
        a a1 = new a();
        b b1 = new b();
        Thread t = new Thread(a1);
        Thread t1 = new Thread(b1);
        t.start();
        t1.start();

    }
}
