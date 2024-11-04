package pratice;

public class RevString {
public static void main(String[] args) {
	String str = "AKASH";
	String ans1 = reverse(str);
	System.out.println(ans1);
	for (int i = 0; i < ans1.length(); i++) {
		System.out.print(ans1.charAt(i));
	}
	
	System.out.println();
	
}

public static String reverse(String str) {
	int size = str.length();
	String ans = "";
	for (int i = size-1; i >=0; i--) {
		ans+=str.charAt(i);
	}
	
	return ans;
	
}
}
