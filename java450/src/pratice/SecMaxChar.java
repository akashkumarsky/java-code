package pratice;

public class SecMaxChar {
	static String secondMax(String str1) {
		int [] arr = new int [26];
		int max1st = 0;
		int max2nd =0;
		int size = str1.length();
		String ans ="";
		char [] strArr = str1.toCharArray();
		for(int i =0 ; i< strArr.length; i++) {
			int idx =strArr[i]-'a';
			arr[idx]++;
		}
		for(int i =0; i<strArr.length;i++) {
			if(arr[i]>max1st) {
				max1st =arr[i];
			}
		}
		for(int i =0; i<strArr.length;i++) {
			if(arr[i]<max1st && arr[i]>max2nd) {
				max2nd =arr[i];
			}
		}
		for(int i= 0; i<strArr.length; i++) {
			if(arr[i]==max2nd) {
				ans += (i+'a');
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		String str1 = "javvvaaa";
		String str2 = "jaavv"; 
		System.out.println(secondMax(str1));
		
	}
}
