package pratice;

import java.util.Stack;

public class ParathesesValidation {
	public boolean validation1(String str) {
		Stack<Character> st = new Stack<>();
		for(Character ch : str.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}else {
				if(st.isEmpty()) {
					return false;
				}else {
					int top = st.peek();
					if((ch==')'&& top == '(') || (ch=='{'&& top == '}') || (ch=='['&& top == ']')) {
						st.pop();
					}
				}
			}
		}
		return st.isEmpty();
	}
	public boolean validation(String str) {
		Stack<Character>st = new Stack<>();
		for(Character ch : str.toCharArray()) {
			if(ch == '(') {
				st.push(')');
			}else if(ch=='{') {
				st.push('}');
			}else if(ch== '[') {
				st.push(']');
			}else if(st.isEmpty() || st.pop()!=ch) {
				return false;
			}
		}
		return st.isEmpty();
		
	}
	public static void main(String [] args) {
		String str = "{([])}";
		ParathesesValidation pv = new ParathesesValidation();
		boolean ans =pv.validation1(str);
		System.out.println(ans);
	}
}
