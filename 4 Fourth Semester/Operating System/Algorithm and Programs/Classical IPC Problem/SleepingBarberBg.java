import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class SleepingBarberBg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of chairs in waiting room:");
		int waitingChairs = sc.nextInt();
		System.out.println("Enter the number of Customers:");
		int customerCount = sc.nextInt();
		BarberShop barberShop = new BarberShop(waitingChairs);
		new Thread(() -> barberShop.barberKam()).start();
		for (int i = 0; i < customerCount; i++) {
			int customerId = i;
			new Thread(() -> barberShop.customerArrivers(customerId)).start();
			try {
				Thread.sleep((long) (Math.random() * 500)); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class BarberShop {
	private final Semaphore barberReady;
	private final Semaphore customerReady;
	private final Semaphore accessSeats;
	private int khaliChairs;
	public BarberShop(int khurchi) {
		this.barberReady = new Semaphore(0);
		this.customerReady = new Semaphore(0);
		this.accessSeats = new Semaphore(1);
		this.khaliChairs = khurchi;
	}
	public void barberKam() {
		while (true) {
			try {
				customerReady.acquire(); 
				accessSeats.acquire(); 
				khaliChairs++; 
				barberReady.release(); 
				accessSeats.release(); 
				System.out.println("Barber is cutting hair.");
				Thread.sleep((long) (Math.random() * 1000)); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void customerArrivers(int id) {
		try {
			accessSeats.acquire();
			if (khaliChairs > 0) {
				khaliChairs--; 
				System.out.println("Customer " + id + " is waiting. Available chairs: " + khaliChairs);
				customerReady.release(); 
				accessSeats.release();
				barberReady.acquire(); 
				System.out.println("Customer " + id + " is getting a haircut.");
				Thread.sleep((long) (Math.random() * 1000));
				System.out.println("Customer " + id + " is done with the haircut.");
			} else {
				accessSeats.release(); 
				System.out.println("Customer " + id + " leaves as no chairs are available.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
