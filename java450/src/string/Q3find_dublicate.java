package string;

import java.util.Arrays;

public class Q3find_dublicate {
	public static boolean checkdublicate(String str) {
		char [] ch = str.toCharArray();
		Arrays.sort(ch);
		int i =0;
		int j = i+1;int size = str.length()-1;
		while(i<size) {
			if(ch[i++]!=ch[j++])return false;
		}
		return true;
	}
	public static void main(String [] args) {
		String str = "apcd";
		if(checkdublicate(str)) {
			System.out.println("dublicate found");
		}else System.out.println("dublicate not found");
	}
}
