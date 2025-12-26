import java.util.Scanner;

public class PadauniAndLekhauniSamasShya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Padauni Manxe");
        int padauni = sc.nextInt();
        System.out.println("Enter the number of Lekhauni Manxe");
        int lekhauni = sc.nextInt();

        BadekoData badekoData = new BadekoData(padauni, lekhauni);

        for (int i = 0; i < padauni; i++) {
            int padauniId = i;
            new Thread() {
                public void run() {
                    try {
                        badekoData.padauniKaam(padauniId);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }

        for (int i = 0; i < lekhauni; i++) {
            int lekhauniId = i;
            new Thread() {
                public void run() {
                    try {
                        badekoData.lekhauniKaam(lekhauniId);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }

        sc.close();
    }
}

class BadekoData {
    private int padauni;
    private int lekhauni;
    private int padauniCount = 0;
    private boolean lekhauniActive = false;

    public BadekoData(int padauni, int lekhauni) {
        this.padauni = padauni;
        this.lekhauni = lekhauni;
    }

    public synchronized void padauniKaam(int id) throws InterruptedException {
        while (lekhauniActive) {
            wait();
        }
        padauniCount++;
        System.out.println("Padauni Manxe " + id + " is reading. Active readers: " + padauniCount);
        Thread.sleep((long) (Math.random() * 1000));
        padauniCount--;
        System.out.println("Padauni Manxe " + id + " finished reading. Active readers: " + padauniCount);
        if (padauniCount == 0) {
            notifyAll();
        }
    }

    public synchronized void lekhauniKaam(int id) throws InterruptedException {
        while (lekhauniActive || padauniCount > 0) {
            wait();
        }
        lekhauniActive = true;
        System.out.println("Lekhauni Manxe " + id + " is writing.");
        Thread.sleep((long) (Math.random() * 1000));
        lekhauniActive = false;
        System.out.println("Lekhauni Manxe " + id + " finished writing.");
        notifyAll();
    }
}
