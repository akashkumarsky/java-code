package string;

public class Q7LongestPalindromString {
	static String longestpali(String str) {
		String ans="";
		
		return ans;
	}

	//Expansion from center method
	static String longestPalindrom(String str) {
		// Time Complexity: O(n squre)
		// Space Complexity: O(1)
		int start = 0;
		int end = 0;
		for (int i = 0; i < str.length(); i++) {
			int len1 = centerExpend(str, i, i + 1);// for even string length
			int len2 = centerExpend(str, i, i);//for odd string length
			
			int maxLen = Math.max(len1, len2);
			if (end - start < maxLen) {
				start = i - (maxLen - 1) / 2;
				end = i + maxLen / 2;
				
			}
		}
		
		return str.substring(start, end + 1);
	}

	static int centerExpend(String str, int i, int j) {

		while (i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)) {
			i--;
			j++;
		}
		return j - i - 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mojologiccigolmojo";

		System.out.println(longestPalindrom(str));
		
		

	}

}
