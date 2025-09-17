import java.util.Scanner;

public class RRobinBG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of processes:");
		int PuraProcesses = sc.nextInt();
		System.out.println("Enter Quantum Time");
		int Quantum = sc.nextInt();
		int[] processId = new int[PuraProcesses];
		int[] burstTime = new int[PuraProcesses];
		int[] releaseTime = new int[PuraProcesses];
		int[] completionTime = new int[PuraProcesses];

		int[] remainingTime = new int[PuraProcesses];

		for (int p = 0; p < PuraProcesses; p++) {
			System.out.println("Enter process" + (p + 1) + " Burst Time:");
			burstTime[p] = sc.nextInt();
			System.out.println("Enter process" + (p + 1) + " Release Time:");
			releaseTime[p] = sc.nextInt();
			processId[p] = p + 1;
			remainingTime[p] = burstTime[p];
		}

		int systemTime = 0, completeProcess = 0;

		float totalTT = 0, totalWT = 0;
		while (completeProcess < PuraProcesses) {
			boolean sakiyo = false;
			for (int i = 0; i < PuraProcesses; i++) {
				if (remainingTime[i] > 0 && releaseTime[i] <= systemTime) {

					sakiyo = true;
					if (remainingTime[i] <= Quantum) {
						systemTime += remainingTime[i];
						remainingTime[i] = 0;
						completionTime[i] = systemTime;
						completeProcess++;
					} else {
						systemTime += Quantum;
						remainingTime[i] -= Quantum;

					}
				}
			}
			if (!sakiyo) {
				systemTime++;

			}
		}

		System.out.println("Process ID\tRelease Time\tBurst Time\tCompletion Time\tTurn Around Time\tWaiting Time");
		for (int n = 0; n < PuraProcesses; n++) {
			int turnAroundTime = completionTime[n] - releaseTime[n];
			int waitingTime = turnAroundTime - burstTime[n];
			totalTT += turnAroundTime;
			totalWT += waitingTime;
			System.out.println(processId[n] + "\t\t" + releaseTime[n] + "\t\t" +
					burstTime[n] + "\t\t" + completionTime[n] + "\t\t" +
					turnAroundTime + "\t\t\t" + waitingTime);
		}

		System.out.println("\nAverage Turn Around Time: " + (totalTT / PuraProcesses));
		System.out.println("Average Waiting Time: " + (totalWT / PuraProcesses));

		sc.close();

	}
}
