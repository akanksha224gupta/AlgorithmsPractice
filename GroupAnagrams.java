package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> lst = groupAnagrams(strs);
		System.out.println(lst);

	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> freq = new HashMap<>();
        for(String str : strs){
            char[] chStr = str.toCharArray();
            Arrays.sort(chStr);
            String nStr = new String(chStr);
            List<String> words = null;
            if(freq.containsKey(nStr)){
                words = freq.get(nStr);
                if(words == null){
                    words = new LinkedList<>();
                }
                words.add(str);
                freq.put(nStr,words);
            } else {
            	words = new LinkedList<>();
            	words.add(str);
                freq.put(nStr,words);
            }
        }
        List<List<String>> result = new LinkedList<>();
        for(List<String> word : freq.values()) {
            result.add(word);
        }
        return result;
    }

}
