package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReturnRank {

	public static void main(String[] args) {
		int[] arr = {37,12,28,9,100,56,80,5,12};
		for(int i :arrayRankTransform(arr)) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        int[] rank = new int[len];
        Set<Integer> repeat = new HashSet<>();
        Arrays.fill(rank,1);
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(j!=i){
                    if(arr[i]>arr[j]){
                        rank[i]+=1;
                    } else if(arr[i]==arr[j]) {
                    	repeat.add(arr[i]);
                    }
                   
                }
            }
        }
        int reps = repeat.size()-1;
        if(reps>0) {
        	for (int i = 0; i < len; i++) {
				rank[i]-=reps;
			}
        }
        return rank;
    }

}
