import java.util.LinkedList;
import java.util.Scanner;

public class LRUPage {

	static int pageFault(int pages[], int puraPages, int frameSize) {
		LinkedList<Integer> frames = new LinkedList<>();

		int pageFaults = 0;
		for (int i = 0; i < puraPages; i++) {
			int page = pages[i];

			if (!frames.contains(page)) {
				pageFaults++;
				if (frames.size() < frameSize) {

					frames.add(page);
				} else {
					frames.removeFirst();
					frames.add(page);
				}
			} else {
				frames.remove((Integer) page);
				frames.add(page);
			}
			for (int f : frames) {
				System.out.print(f + " ");
			}
			System.out.println();
		}
		return pageFaults;
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