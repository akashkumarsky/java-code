package string;

import java.util.ArrayList;
import java.util.List;

public class Q9_Print_all_Subsequences {
	
	public static List<String> subSequences(String str){
		List<String> ans = new ArrayList<String>();
		String output ="";
		int index =0;
		solve(str,output,index,ans);
		return ans;
	}
	
	private static void solve(String str, String output, int index, List<String> ans) {
		
		if(index>=str.length()) {
			ans.add(output);
			return;
		}
		//excluding
		solve(str,output,index+1,ans);
		
		//including output String
		output =output+ str.charAt(index);
		solve(str,output,index+1,ans);
		
	}

	public static void main(String[] args) {
		 String a="abr";
		 List<String> ans = subSequences(a);
		
		 for(String s : ans) {
			 System.out.print("[");
			 System.out.print(s);
			 System.out.print("],");
		 }
	}

 
}
