import java.util.Scanner;

public class DiningBg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Philosophers:");
		int n = sc.nextInt();
		Philosopher[] philosophers = new Philosopher[n];
		Fork[] forks = new Fork[n];

		for (int i = 0; i < n; i++) {
			forks[i] = new Fork(i);
		}

		for (int i = 0; i < n; i++) {
			philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % n]);
			new Thread(philosophers[i]).start();
		}

		System.out.println("Philosophers are dining...");
		sc.close();
	}
}

class Fork {
	public final int id;
	private boolean prayog;

	public Fork(int id) {
		this.id = id;
		this.prayog = false;
	}

	public synchronized void pickUp(int philosopherId) throws InterruptedException {
		while (prayog) {
			wait();
		}
		prayog = true;
		System.out.println("Philosopher " + philosopherId + " picked up Fork " + id);
	}

	public synchronized void putDown() {
		prayog = false;
		System.out.println("Fork " + id + " is put down.");
		notifyAll();
	}
}

class Philosopher implements Runnable {
	private final int id;
	private final Fork dabareFork;
	private final Fork rightFork;

	public Philosopher(int id, Fork dabareFork, Fork rightFork) {
		this.id = id;
		this.dabareFork = dabareFork;
		this.rightFork = rightFork;
	}

	@Override
	public void run() {
		try {
			while (true) {
				think();
				eat();
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	private void think() throws InterruptedException {
		System.out.println("Philosopher " + id + " is thinking.");
		Thread.sleep((long) (Math.random() * 1000));
	}

	private void eat() throws InterruptedException {
		Fork first = dabareFork.id < rightFork.id ? dabareFork : rightFork;
		Fork second = dabareFork.id < rightFork.id ? rightFork : dabareFork;

		first.pickUp(id);
		second.pickUp(id);

		System.out.println("Philosopher " + id + " is eating.");
		Thread.sleep((long) (Math.random() * 1000));

		first.putDown();
		second.putDown();
	}
}
