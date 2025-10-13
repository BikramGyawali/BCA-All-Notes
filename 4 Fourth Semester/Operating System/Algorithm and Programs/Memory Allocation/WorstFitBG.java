import java.util.Scanner;
public class WorstFitBG{
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of memory slot");
		int slots = sc.nextInt();
		int []memorySizes= new int [slots];
		boolean[]filled = new boolean[slots];
		for (int b=0;b<slots;b++){
			System.out.println("Enter the size of memory slot "+(b+1));
			memorySizes[b]=sc.nextInt();
		}
		System.out.println("Enter the number of processes");
		int processes = sc.nextInt();
		int []processSizes= new int [processes];
	int []allocation = new int[processes];
		for (int b=0;b<processes;b++){
			System.out.println("Enter the size of process "+(b+1));
			processSizes[b]=sc.nextInt();
			allocation[b]=-1;
		}
		 for (int i = 0; i < processes; i++) {
            int worstIdx = -1;
            for (int j = 0; j < slots; j++) {
                if (!filled[j] && memorySizes[j] >= processSizes[i]) {
                    if (worstIdx == -1 || memorySizes[j] > memorySizes[worstIdx]) {
                        worstIdx = j;
                    }
                }
            }
            if (worstIdx != -1) {
                allocation[i] = worstIdx;
                memorySizes[worstIdx] -= processSizes[i];
            }
        }
			System.out.println("Process No.\tProcess Size\tMemory Slot No.");
		for (int i = 0; i < processes; i++) {
			System.out.print((i + 1) + "\t\t" + processSizes[i] + "\t\t");
			if (allocation[i] != -1) {
				System.out.println((allocation[i] + 1));
			} else {
				System.out.println("Not Allocated");
			}
		}
		sc.close();
	}
}