import java.util.Scanner;

public class BankersBG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of processes");
		int processNum= sc.nextInt();
		System.out.println("Enter the number of resources");
		int resourceNum= sc.nextInt();

		int[][] max = new int[processNum][resourceNum];
		int[][] allocation = new int[processNum][resourceNum];
		int[][] chiyeko = new int[processNum][resourceNum];
		int[] vako = new int[resourceNum];
		System.out.println("Enter the max matrix");
		for(int i=0;i<processNum;i++) {
			for(int j=0;j<resourceNum;j++) {
				max[i][j]=sc.nextInt();
			}
		}
	}
}
