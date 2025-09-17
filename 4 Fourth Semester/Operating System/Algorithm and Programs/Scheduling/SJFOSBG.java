import java.util.Scanner;

public class SJFOSBG {
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
		int[] processStatus = new int[PuraProcesses];
		int systemTime = 0, finished = 0;
		float avgwt = 0, avgta = 0;
		for (int p = 0; p < PuraProcesses; p++) {
			System.out.println("Enter process" + (p + 1) + " Brust Time:");
			burstTime[p] = sc.nextInt();
			System.out.println("Enter process" + (p + 1) + " Release Time:");
			releaseTime[p] = sc.nextInt();
			processId[p] = p + 1;
			processStatus[p] = 0;
		}

		while (true) {
			int c = PuraProcesses, min = 9999;
			if (finished == PuraProcesses)
				break;

			for (int i = 0; i < PuraProcesses; i++) {
				if ((releaseTime[i] <= systemTime) && (processStatus[i] == 0) && (burstTime[i] < min)) {
					min = burstTime[i];
					c = i;
				}
			}

			if (c == PuraProcesses)
				systemTime++;
			else {
				completionTime[c] = systemTime + burstTime[c];
				systemTime += burstTime[c];
				turnAroundTime[c] = completionTime[c] - releaseTime[c];
				waitingTime[c] = turnAroundTime[c] - burstTime[c];
				processStatus[c] = 1;
				processId[finished] = c + 1;
				finished++;
			}
		}
		System.out.println("Process ID\tRelease Time\tBrust Time\tCompletion Time\tTurn Around Time\tWaiting Time");
		for (int n = 0; n < PuraProcesses; n++) {
			avgwt += waitingTime[n];
			avgta += turnAroundTime[n];
			int idx = processId[n] - 1; // FIX
			System.out.println(processId[n] + "\t\t" + releaseTime[idx] + "\t\t" +
					burstTime[idx] + "\t\t" + completionTime[idx] + "\t\t" +
					turnAroundTime[idx] + "\t\t\t" + waitingTime[idx]);
		}

		System.out.println("\n Average Turn Around Time: " + (float) (avgta / PuraProcesses));
		System.out.println("\n Average Waiting  Time: " + (float) (avgwt / PuraProcesses));
		sc.close();
		for (int i = 0; i < PuraProcesses; i++) {
			System.out.print("| P" + processId[i] + " ");
		}
	}
}
