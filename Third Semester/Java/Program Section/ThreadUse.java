
 /* condition to use`*/
class forI extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i"  + i);
        }
    }
}

class forJ extends Thread {
    public void run() {
        for (int j = 0; j <= 10; j++) {
            System.out.println("j"  + j);
        }
    }
}

public class ThreadUse {
    public static void main(String[] args) {
        forI hehe = new forI();
        hehe.start();
        forJ haha = new forJ();
        haha.start();

    }
}
