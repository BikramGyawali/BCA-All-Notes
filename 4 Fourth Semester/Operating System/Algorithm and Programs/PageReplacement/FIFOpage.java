package PageReplacement;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FIFOpage {
	static int pageFault(int pages[], int puraPages, int frameSize) {
		HashSet<Integer> s = new HashSet<>(frameSize);
		Queue<Integer> indexes = new LinkedList<>();
		int pageFaults = 0;
		for (int i = 0; i < puraPages; i++) {
			if (s.size() < frameSize) {
				if (!s.contains(pages[i])) {
					s.add(pages[i]);
					pageFaults++;
					indexes.add(pages[i]);
				}
			} else {
				if (!s.contains(pages[i])) {
					int val = indexes.poll();
					s.remove(val);
					s.add(pages[i]);
					indexes.add(pages[i]);
					pageFaults++;
				}
			}
			// Show frames in one row, left to right
			for (int page : indexes) {
				System.out.print(page + " ");
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