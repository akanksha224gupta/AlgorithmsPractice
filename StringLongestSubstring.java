package Practice;

import java.util.HashSet;
import java.util.Set;

// abcabcd
public class StringLongestSubstring {

	public static void main(String[] args) {
		String str = "abcabcd";
		if (!str.isEmpty()) {
			System.out.println(findLongestSubstringWithNonRepeatingChars(str));
		}
	}

	private static String findLongestSubstringWithNonRepeatingChars(String str) {
		int len = str.length() - 1;
		int lenSub = 0;
		int max = 0;
		int start = 0;
		Set<Character> sb = null;
		for (int i = 0; i <= len; i++) {
			sb = new HashSet<>();
			for (int j = i; j <= len; j++) {
				boolean added = sb.add(str.charAt(j));
				if (added) {
					lenSub++;
				} else {
					break;
				}
			}
			if (lenSub > max) {
				start = i;
				max = lenSub;
			}
			sb = null;
			lenSub = 0;
		}
		System.out.println("Start" + start + " max : " + max);
		return str.substring(start, (start + max));
	}
}
