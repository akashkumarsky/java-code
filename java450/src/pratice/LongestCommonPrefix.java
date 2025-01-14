package pratice;

import java.util.Arrays;

public class LongestCommonPrefix {
	public String prefix(String[] strs) {
		Arrays.sort(strs);
		char[] start = strs[0].toCharArray();
		char[] end = strs[strs.length - 1].toCharArray();
		StringBuilder ans = new StringBuilder();
		for(int i = 0 ;i <start.length;i++) {
			if(start[i]!=end[i]) {
				break;
			}
			ans.append(start[i]);
		}
		return ans.toString();

	}

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		LongestCommonPrefix lc = new LongestCommonPrefix();
		String ans =lc.prefix(strs);
		System.out.println(ans);
	}
}
