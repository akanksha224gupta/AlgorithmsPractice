package Practice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindTopKNosInAStream {
	static final int K_LIMIT = 5;
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			// let k = 5
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(K_LIMIT);
			int fill =0;
			while(in.hasNext()) {
				int i = in.nextInt();
				if(i!=-1) {
					if(fill<K_LIMIT) {
						pq.offer(i);
						fill++;
					} else {
						if(pq.peek()<i) {
							pq.poll();
							pq.offer(i);
						}
					}
				} else {
					break;
				}
			}
			
			System.out.println("The top k elements are : " + pq);
		}
		System.out.println("Call you find mininum k");
		findTopKNosInAStream();
	}
	private static void findTopKNosInAStream() {
		try (Scanner in = new Scanner(System.in)) {
			// let k = 5
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(K_LIMIT, Comparator.reverseOrder());
			int fill =0;
			while(in.hasNext()) {
				int i = in.nextInt();
				if(i!=-1) {
					if(fill<5) {
						pq.offer(i);
						fill++;
					} else {
						if(pq.peek()>i) {
							pq.poll();
							pq.offer(i);
						}
					}
				} else {
					break;
				}
			}
			
			System.out.println("The bottom k elements are : " + pq );
		}
	}

}
