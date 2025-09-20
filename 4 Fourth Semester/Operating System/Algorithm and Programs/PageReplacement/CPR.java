import java.util.LinkedList;
import java.util.Scanner;

public class CPR {
	static int pageFault(int pages[], int puraPages, int frameSize) {
		LinkedList<Integer> frames = new LinkedList<>();
		boolean[] refBits = new boolean[frameSize];
		int pageFault = 0, pointer = 0;

		for (int i = 0; i < puraPages; i++) {
			int page = pages[i];
			boolean pageVetiyo = false;
			for (int j = 0; j < frames.size(); j++) {
				if (frames.get(j) == page) {
					pageVetiyo = true;
					refBits[j] = true;
					break;
				}
			}
			if (!pageVetiyo) {
				pageFault++;
				while (true) {
					if (frames.size() < frameSize) {
						frames.add(page);
						refBits[frames.indexOf(page)] = true;
						break;
					} else {
						if (!refBits[pointer] == false) {
							frames.set(pointer, page);
							refBits[pointer] = true;

							break;
						} else {
							refBits[pointer] = false;
							pointer = (pointer + 1) % frameSize;
						}
					}
				}
			}
			for (int f : frames) {
				System.out.print(f + " ");
			}
			System.out.println();

		}
		return pageFault;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of pages:");
		int puraPages = sc.nextInt();
		int pages[] = new int[puraPages];
		System.out.println("Enter the pages ");
		for (int p = 0; p < puraPages; p++) {
			pages[p] = sc.nextInt();
		}
		System.out.println("Enter the number of frames:");
		int frameSize = sc.nextInt();

		int totalPageFaults = pageFault(pages, puraPages, frameSize);

		System.out.println("Total Page Faults: " + totalPageFaults);
	}
}
