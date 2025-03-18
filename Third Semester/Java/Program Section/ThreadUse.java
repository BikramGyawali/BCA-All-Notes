
/* condition to use`
 * 1. extends the Thread class
   2. use run() in the class name
   3. use start() with the object of the class
*/
class forI extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i" + i);
        }
    }
}

class forJ extends Thread {
    public void run() {
        for (int j = 0; j <= 10; j++) {
            System.out.println("j" + j);
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
