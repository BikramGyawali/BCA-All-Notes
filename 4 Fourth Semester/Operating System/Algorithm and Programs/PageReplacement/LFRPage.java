import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class LFRPage {
	static int pageFault(int pages[], int puraPages, int frameSize) {
		HashMap<Integer, Integer> pageFrequency = new HashMap<>();
		LinkedList<Integer> frames = new LinkedList<>();
		int pageFault = 0;
		for (int i = 0; i < puraPages; i++) {
			int page = pages[i];

			if (!frames.contains(page)) {
				pageFault++;
				if (frames.size() < frameSize) {
					frames.add(page);

				} else {
					int lfrPage = -1;
					int minFreq = Integer.MAX_VALUE;
					for (int f : frames) {
						int freq = pageFrequency.getOrDefault(f, 0);
						if (freq < minFreq) {
							minFreq = freq;
							lfrPage = f;
						}
					}
					frames.remove((Integer) lfrPage);
					frames.add(page);
				}
			}
			pageFrequency.put(page, pageFrequency.getOrDefault(page, 0) + 1);
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
