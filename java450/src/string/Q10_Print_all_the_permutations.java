package string;

import java.util.ArrayList;
import java.util.List;

public class Q10_Print_all_the_permutations {

	public static void main(String[] args) {
		
		String str= "ABC";
		//List<String> ans =allPermutations(str);
		List<String> ans1 =allPermutations1(str);
		for(String s:ans1) {
			System.out.println(s);
		}

	}

	// using extra space method-----------------------------------------------------------------------
	private static List<String> allPermutations(String str) {
		List<String> ans = new ArrayList<String>();
		String output="";
		boolean freq[] = new boolean[str.length()];
		solvePermutations(ans,output,freq, str);
		return ans;
		
	}

	private static void solvePermutations(List<String> ans, String output, boolean[] freq, String str) {
		if(output.length()==str.length()) {
			ans.add(output);
			return;
		}
		for(int i =0; i<str.length();i++) {
			if(!freq[i]) {
				freq[i]=true;
				
				output=output+str.charAt(i);
				solvePermutations(ans, output, freq, str);
				output=output.substring(0,output.length()-1);
				freq[i] = false;
			}
		}
	}
	//-------------------------------------------------------------------------------------------------------
	
	//using swap method--best approach-----------------------------------------------------------------------
	private static List<String> allPermutations1(String str) {
		List<String> ans = new ArrayList<String>();
		int index =0;
		char[] charArr =str.toCharArray();
		solvepermutations1(ans,index,charArr);
		return ans;
	}
	

	private static void solvepermutations1(List<String> ans, int index, char[] charArr) {
		if(index==charArr.length) {
			ans.add(new String(charArr));
			return;
		}
		for(int i=index;i<charArr.length;i++) {
			swap(charArr,i,index);
			solvepermutations1(ans, index+1, charArr);
			swap(charArr,i,index);
		}
	}

	private static void swap(char[] charArr, int i, int j) {
		char temp = charArr[i];
		charArr[i] = charArr[j];
		charArr[j] = temp;
		
	}
	
	
	// End of swap method
}
