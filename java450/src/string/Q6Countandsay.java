package string;

public class Q6Countandsay {
	static String recuCountAndSay(int n) {
		int count =0;
		StringBuilder result = new StringBuilder();
		if(n==1) return "1";
		
		
		String s = recuCountAndSay(n-1);
		
		
		for(int i=0;i<s.length();i++) {
			count++;
			if(i==s.length()-1|| s.charAt(i)!=s.charAt(i+1)) {
				result.append(count).append(s.charAt(i));
				count=0;
			}
		}
		return  result.toString();
	}
	public static void main(String [] args) {
		System.out.println(recuCountAndSay(3));
	}
}
