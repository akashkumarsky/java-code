package pratice;

import java.util.Arrays;

public class LongestCommonPrefix1 {
	public static void main(String[] args) {
		String[] arr = {"geeksforgeeks", "geeks", "geeks", "geezereeks"};
		System.out.println(prefix(arr));
		System.out.println(sufix(arr));
	}

	private static String prefix(String[] arr) {
		Arrays.sort(arr);
		String beg = arr[0];
		String ans ="";
		String end = arr[arr.length-1];
		for(int i = 0 ;i<end.length(); i++) {
		if(beg.charAt(i)!=end.charAt(i)) {
			break;
			
		}
		ans +=beg.charAt(i);
		}
		return ans;
	}
	private static String sufix(String [] arr) {
	
		Arrays.sort(arr);
		String start = arr[0];
		String end = arr[arr.length-1];
		String ans ="";
		int i=start.length()-1 , j=end.length()-1;
		while(i>=0&& j>=0) {
			if(start.charAt(i)!=end.charAt(j)) {
				break;
			}
			ans+=start.charAt(i);
			i--;
			j--;
			
		}
		
		String str =RevString.reverse(ans);
		return str;
	}

}
