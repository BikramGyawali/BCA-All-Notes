import java.util.Scanner;

public class NPPBG {
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
		int[] processPriority = new int[PuraProcesses];
		boolean[] sakiyo = new boolean[PuraProcesses];
		for (int p = 0; p < PuraProcesses; p++) {
			System.out.println("Enter process" + (p + 1) + " Brust Time:");
			burstTime[p] = sc.nextInt();
			System.out.println("Enter process" + (p + 1) + " Release Time:");
			releaseTime[p] = sc.nextInt();
			System.out.println("Enter process" + (p + 1) + " Priority:");
			processPriority[p] = sc.nextInt();
			processId[p] = p + 1;

		}
		int systemTime = 0, finished = 0;
		float totalTAT = 0, totalWT = 0;

		while (finished < PuraProcesses) {
			int thuloPriorityIndex = -1;
			int thuloPriority = 9999;

			for (int i = 0; i < PuraProcesses; i++) {
				if (!sakiyo[i] && releaseTime[i] <= systemTime && processPriority[i] < thuloPriority) {
					thuloPriority = processPriority[i];
					thuloPriorityIndex = i;
				}
			}
			if (thuloPriorityIndex == -1) {
				systemTime++;
				continue;

			}

			systemTime += burstTime[thuloPriorityIndex];
			completionTime[thuloPriorityIndex] = systemTime;
			turnAroundTime[thuloPriorityIndex] = completionTime[thuloPriorityIndex] - releaseTime[thuloPriorityIndex];
			waitingTime[thuloPriorityIndex] = turnAroundTime[thuloPriorityIndex] - burstTime[thuloPriorityIndex];

			totalTAT += turnAroundTime[thuloPriorityIndex];
			totalWT += waitingTime[thuloPriorityIndex];
			sakiyo[thuloPriorityIndex] = true;
			finished++;

		}
		System.out.println(
				"Process ID\tRelease Time\tBurst Time\tPriority\tCompletion Time\tTurn Around Time\tWaiting Time");
		for (int n = 0; n < PuraProcesses; n++) {
			System.out.println(processId[n] + "\t\t" + releaseTime[n] + "\t\t" +
					burstTime[n] + "\t\t" + processPriority[n] + "\t\t" + completionTime[n] + "\t\t" +
					turnAroundTime[n] + "\t\t\t" + waitingTime[n]);
		}

		System.out.println("\nAverage Turn Around Time: " + (totalTAT / PuraProcesses));
		System.out.println("Average Waiting Time: " + (totalWT / PuraProcesses));

		sc.close();

	}
}
