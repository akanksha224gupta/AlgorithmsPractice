package Practice;

public class TheFrogPath {

	public static void main(String[] args) {
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		System.out.println(theFrogPath(5, A));
	}
	
	public static int theFrogPath(int X, int[] A) {
        boolean [] found = new boolean[X+1];
        int foundSoFar = 0;
        int len = A.length;
        for(int i=0; i< len; i++){
        	int position = A[i];
            if(position <= X){
                if(!found[position]){
                    found[position] = true;
                    foundSoFar++;
                    if(foundSoFar==X){
                        return i;
                     }
                }
            }
            
        }


        return -1;
    }

}
