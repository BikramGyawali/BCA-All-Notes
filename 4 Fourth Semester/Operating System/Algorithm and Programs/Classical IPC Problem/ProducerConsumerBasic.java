import java.util.Scanner;

public class ProducerConsumerBasic {
	public static void main(String[] args) {
		int buffer_Aakar = 5;
		int[] buffer = new int[buffer_Aakar];
		int vitra = 0, bira = 0;
		int choice = 0;
		Scanner hehe = new Scanner(System.in);
		while (choice != 3) {
			System.out.println("\n1. Producer\t2. Consumer\t3. Exit\nEnter your choice:");
			choice = hehe.nextInt();
			switch (choice) {
				case 1:
					if ((vitra + 1) % buffer_Aakar == bira) {
						System.out.println("Buffer Voriyo (Buffer Full)...");
					} else {
						System.out.print("Enter data to produce: ");
						buffer[vitra] = hehe.nextInt();
						vitra = (vitra + 1) % buffer_Aakar;
					}
					break;
				case 2:
					if (bira == vitra) {
						System.out.println("Buffer khali vayo (Buffer Empty)...");
					} else {
						int consumedData = buffer[bira];
						System.out.println("Consumed data: " + consumedData);
						bira = (bira + 1) % buffer_Aakar;
					}
					break;
				case 3:
					System.out.println("Niklim Niklim...");
					break;
				default:
					System.out.println("Invalid choice, try again.");
			}
		}
		hehe.close();
	}
}
