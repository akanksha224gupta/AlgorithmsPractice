package Practice;

public class ReverseStringUsingSplit {

	public static void main(String[] args) {

		String str = "Do or do not, there is no try.";
		String[] splits = str.split(" ");
		StringBuilder bldr = new StringBuilder();
		for(int i = splits.length-1; i>=0; i--) {
			bldr.append(splits[i]).append(" ");
		}
		System.out.println(bldr.toString());
		
	}

}
