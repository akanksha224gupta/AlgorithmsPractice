package Practice;

import java.util.PriorityQueue;

public class MaximumProfits {

	static int countSale = 0;
	static PriorityQueue<Integer> que;
	static int maxProfit = 0;
	static int sizeOfPQ = 0;

	public static void main(String[] args) {
		int[] prices = { 334, 500, 169, 724, 478, 358, 962, 464, 705, 145, 281, 827, 961, 491, 995, 942, 827 };
		//int[] prices = { 604, 902, 153, 292, 382, 421, 716, 718, 895, 447, 726, 771, 538, 869, 912, 667, 299, 35, 894, 703, 811, 322, 333, 673, 664 };
		//System.out.println(maxProfit(7, 25, prices));
		System.out.println(maxProfit(2,17,prices));
	}

	static int maxProfit(int K, int N, int A[]) {
		que = new PriorityQueue<>(K);
		int buyPrice = A[0];
		int sellPrice = 0;
		sizeOfPQ = K;
		for (int i = 1; i < N; i++) {
			int price = A[i];
			if (price > buyPrice) {
				if (price > sellPrice) {
					sellPrice = price;
					maxProfit = Math.max(maxProfit, (sellPrice - buyPrice));
				} 
				continue;
			} else {
				buyPrice = price;
				addProfitIntoPQ();
			}
		}
		if(maxProfit>0) {
			addProfitIntoPQ();
		}
		int totProfit = 0;
		for (Integer profit : que) {
			totProfit += profit;
		}
		return totProfit;
	}

	private static void addProfitIntoPQ() {
		if (countSale < sizeOfPQ) {
			que.offer(maxProfit);
			countSale++;
		} else if (que.peek() < maxProfit) {
			que.poll();
			que.offer(maxProfit);
		}
		maxProfit = 0;
	}

}
