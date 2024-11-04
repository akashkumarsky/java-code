package string;

public class Q5Vaild_shuffle {
	public static boolean isValid(String  str1,String str2,String goal) {
		//check whether the sum of String and shuffle goal is equal or not
		if((str1+str2).length() != goal.length()) return false;
		//convert String to charArray
		char [] ch1 = str1.toCharArray();
		char [] ch2 = str2.toCharArray();
		char [] chgoal = goal.toCharArray();
		
		//3 pointer 
		int i, j, k;
		i=j=k=0;
		//check k pointer less  then shuffle goal pointer or not 
		while(k<chgoal.length) {
			if(i<ch1.length && ch1[i]==chgoal[k])i++;
			else if (j<ch2.length && ch2[j] == chgoal[k])j++;
			else return false;
			k++;
		}
		//mean No charater preasent in ch1 or ch2  -> return true 
	
		// if charater presant in ch1 or ch2 -> return false 
		return i>=ch1.length && j>=ch2.length;
	}
	public static void main(String [] agrs) {
		String str1 = "xy";
		String str2 = "ab";
		String goal = "xayb";
		if(isValid(str1,str2, goal)){
			System.out.println(goal + " is a shuffle of " +str1+ " and "+ str2);
		}else System.out.println(goal + " is not a shuffle of " +str1+ " and "+ str2);
	}
}
