package PageReplacement;

import java.util.LinkedList;

import java.util.Scanner;

public class ArkoChance {
	static int pageFault(int pages[], int puraPages, int frameSize) {
		LinkedList<Integer> frames = new LinkedList<>();
		boolean[] reference = new boolean[frameSize];

		int pageFaults = 0, pointer = 0;
		for (int i = 0; i < puraPages; i++) {
			int page = pages[i];
			boolean found = false;
			for (int j = 0; j < frames.size(); j++) {
				if (frames.get(j) == page) {
					reference[j] = true;
					found = true;
					break;
				}
			}

			if (!found) {
				pageFaults++;
				while (true) {
					if (frames.size() < frameSize) {
						frames.add(page);
						reference[frames.indexOf(page)] = true;
						break;
					} else if (reference[pointer]) {
						reference[pointer] = false;
						pointer = (pointer + 1) % frameSize;

					} else {
						frames.set(pointer, page);
						reference[pointer] = true;
						pointer = (pointer + 1) % frameSize;
						break;
					}
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
