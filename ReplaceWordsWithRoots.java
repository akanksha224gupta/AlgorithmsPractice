package Practice;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReplaceWordsWithRoots {

	public static void main(String[] args) {
		System.out.println(replaceWords(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery"));
	}
	
	
	public static String replaceWords(List<String> dictionary, String sentence) {
        String[] tokens = null;
		if (sentence != null && sentence.length() > 0) {
			tokens = sentence.split(" ");
		}
		Set<String> dictTree = new TreeSet<>();
		for (String word : dictionary) {
			dictTree.add(word);
		}
        StringBuilder sb = new StringBuilder();
        
		for (String token : tokens) {
			for (String root : dictTree) {
				if (token.startsWith(root)) {
					token = root;
					break;
				}
			}
			sb.append(token).append(" ");
		}
		
		return sb.toString().trim();
    }

}
