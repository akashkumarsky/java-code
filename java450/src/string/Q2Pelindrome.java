package string;

public class Q2Pelindrome {
	public static boolean isPelindrome(String str) {
	int j = str.length()-1;
		for(int i =0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(j--)){
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		String str = "dcppcd";
		if(isPelindrome(str)) {
			System.out.println(str+" is pelindrome");
		}else {
			System.out.println(str+" is Not pelindrome");
		}
	}
}
