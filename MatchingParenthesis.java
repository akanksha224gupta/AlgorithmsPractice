package Practice;

import java.util.Stack;

public class MatchingParenthesis {

	public static void main(String[] args) {
		MatchingParenthesis mp = new MatchingParenthesis();
		System.out.println(mp.isValid("()"));
		System.out.println(mp.isValid("()[]{}"));
		System.out.println(mp.isValid("(]"));
		System.out.println(mp.isValid("([)]"));
		System.out.println(mp.isValid("{[]}"));
	}
	
	public boolean isValid(String s) {
		Stack<Character> stk = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c=='('|| c=='{'||c=='['){
                stk.push(c);
            } else {
                Character braces = stk.pop();
                if(c.equals(')') && braces.equals('(')) {
                    continue;
                } else if (c.equals('{') && braces.equals('}')) {
                    continue;
                }  else if (c.equals('[') && braces.equals(']')) {
                    continue;    
                }  else { 
                    return false;
                }
            }
        }
        
        if(stk.isEmpty()){
            return true;
        }
        return false;
    }

}
