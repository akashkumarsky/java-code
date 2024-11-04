package string;

public class Q1Reverse_the_String {
	static String strrev1(String str) {
		String temp ="";
		for(int i=str.length()-1;i>=0;i--) {
			temp = temp+str.charAt(i);
		}
		return temp;
	}
	static void strReverse(String str) {
		char[] ch = str.toCharArray();
		int c = ch.length-1;
		for(int i =0 ; i<ch.length/2;i++) {
			if(ch[i]!=ch[c]) {
				char temp = ch[i];
				ch[i]=ch[c];
				ch[c]=temp;
				c--;
			}
		}
		for(char i: ch) {
			System.out.print(i);
		}
	}
	public static void main(String [] args) {
		String str = "akash";
		strReverse(str);
		System.out.println();
		System.out.print(strrev1(str));
		
	}
}