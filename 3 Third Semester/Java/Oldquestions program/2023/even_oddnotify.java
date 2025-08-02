class Pointer implements Runnable {
    static int counter = 100;
    int reminder;
    static Object ob = new Object();

    Pointer(int r) {
        reminder = r;
    }

    public void point() {
        System.out.println(Thread.currentThread().getName() + "" + counter++);
    }

    public void run() {

        while (true) {
            synchronized (ob) {
                if (counter > 200)
                    break;

                if (counter % 2 != reminder) {
                    try {
                        ob.wait();
                    } catch (Exception e) {
                        System.out.println("Error");
                    }
                } else {

                    point();
                    ob.notifyAll();
                }

            }

        }
    }
}

public class even_oddnotify {
    public static void main(String[] args) {
        Pointer even = new Pointer(0);
        Pointer odd = new Pointer(1);
        Thread eventh = new Thread(even, "Even Number");
        Thread oddth = new Thread(odd, "Odd Number");
        eventh.start();
        oddth.start();
    }
}
