import java.util.Scanner;

public class OSFcFsScheduling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of processes:");
		int PuraProcesses = sc.nextInt();
		int[] processId = new int[PuraProcesses];
		int[] burstTime = new int[PuraProcesses];
		int[] releaseTime = new int[PuraProcesses];
		int[] completionTime = new int[PuraProcesses];
		int[] turnAroundTime = new int[PuraProcesses];
		int[] waitingTime = new int[PuraProcesses];
		for (int p = 0; p < PuraProcesses; p++) {
			System.out.println("Enter process" + (p + 1) + " Brust Time:");
			burstTime[p] = sc.nextInt();
			System.out.println("Enter process" + (p + 1) + " Release Time:");
			releaseTime[p] = sc.nextInt();
			processId[p] = p + 1;
		}
		int asthayi;
		for (int outerLoop = 0; outerLoop < PuraProcesses; outerLoop++) {
			for (int innerLoop = outerLoop + 1; innerLoop < PuraProcesses; innerLoop++) {
				if (releaseTime[outerLoop] > releaseTime[innerLoop]) {
					asthayi = releaseTime[outerLoop];
					releaseTime[outerLoop] = releaseTime[innerLoop];
					releaseTime[innerLoop] = asthayi;

					asthayi = processId[outerLoop];
					processId[outerLoop] = processId[innerLoop];
					processId[innerLoop] = asthayi;

					asthayi = burstTime[outerLoop];
					burstTime[outerLoop] = burstTime[innerLoop];
					burstTime[innerLoop] = asthayi;
				}
			}
		}
		int currentTime = 0;
		for (int i = 0; i < PuraProcesses; i++) {
			if (currentTime < releaseTime[i]) {
				// CPU is idle until process arrives
				currentTime = releaseTime[i];
			}
			currentTime += burstTime[i];
			completionTime[i] = currentTime;
			turnAroundTime[i] = completionTime[i] - releaseTime[i];
			waitingTime[i] = turnAroundTime[i] - burstTime[i];
		}

		System.out.println("Process ID\tRelease Time\tBrust Time\tCompletion Time\tTurn Around Time\tWaiting Time");
		for (int n = 0; n < PuraProcesses; n++) {
			System.out.println(processId[n] + "\t\t" + releaseTime[n] + "\t\t" + burstTime[n] + "\t\t"
					+ completionTime[n] + "\t\t" + turnAroundTime[n] + "\t\t\t" + waitingTime[n]);

		}
		System.out.println("\nGantt Chart:");
		int samaye = 0;
		for (int i = 0; i < PuraProcesses; i++) {
			if (samaye < releaseTime[i]) {
				System.out.print("| Idle ");
				samaye = releaseTime[i];
			}
			System.out.print("| P" + processId[i] + " ");
			samaye += burstTime[i];
		}
		System.out.println("|");
	}
}