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
		int[] f = new int[PuraProcesses];  //procesStatus
		int st=0,tot=0;
		float avgwt=0,avgta=0;
		for (int p = 0; p < PuraProcesses; p++) {
			System.out.println("Enter process" + (p + 1) + " Brust Time:");
			burstTime[p] = sc.nextInt();
			System.out.println("Enter process" + (p + 1) + " Release Time:");
			releaseTime[p] = sc.nextInt();
			processId[p] = p + 1;
			f[p]=0;
		}

		while(true){
			int c=PuraProcesses, min=9999;
			if (tot==PuraProcesses)
				break;

			for (int i=0; i<PuraProcesses; i++){
				if ((releaseTime[i]<=st) && (f[i]==0) && (burstTime[i]<min)){
					min=burstTime[i];
					c=i;
				}
			}

			if (c==PuraProcesses)
				st++;
			else{
				completionTime[c]=st+burstTime[c];
				st+=burstTime[c];
				turnAroundTime[c]=completionTime[c]-releaseTime[c];
				waitingTime[c]=turnAroundTime[c]-burstTime[c];
				f[c]=1;
				tot++;
			}
		}
	}
}
