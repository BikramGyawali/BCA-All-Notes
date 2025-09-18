package PageReplacement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class OptimalPRA {

	static int pageFault(int pages[], int puraPages, int frameSize) {
		ArrayList<Integer> frames = new ArrayList<>();

		int pageFaults = 0;
		for (int i = 0; i < puraPages; i++) {
			int page = pages[i];

			if (!frames.contains(page)) {
				pageFaults++;
				if (frames.size() == frameSize) {
					int tada = -1, replaceIndex = -1;
					for (int j = 0; j < frames.size(); j++) {
						int framePage = frames.get(j);
						int arkoUse = 99999;
						for (int k = i + 1; k < puraPages; k++) {
							if (pages[k] == framePage) {
								arkoUse = k;
								break;
							}
						}
						if (arkoUse > tada) {
							tada = arkoUse;
							replaceIndex = j;
						}
					}
					frames.set(replaceIndex, page);
				} else {
					frames.add(page);
				}
			}

			for (

			int f : frames) {
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
