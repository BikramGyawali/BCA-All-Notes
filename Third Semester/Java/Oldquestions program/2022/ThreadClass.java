class A extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            int n = 2;
            System.out.println(n * i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            int n = 3;
            System.out.println(n * i);
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        new A().start();
        new B().start();
    }
}
