class Students implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread" + Thread.currentThread().getName() + "-" + i);
        }
    }
}

class Teacher implements Runnable {
    public void run() {
        for (int i = 20; i < 30; i++) {
            System.out.println("Thread:" + Thread.currentThread().getName() + "-" + i);
        }
    }
}

public class runable {
    public static void main(String[] args) {
        Students s = new Students();
        Teacher t1 = new Teacher();
        Thread tt = new Thread(t1, "teacher");
        Thread t = new Thread(s, "student");
        tt.setPriority(Thread.MAX_PRIORITY);
        t.start();
        tt.start();
    }
}
