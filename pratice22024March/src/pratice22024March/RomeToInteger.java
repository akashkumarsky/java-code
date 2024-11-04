package pratice22024March;

public class RomeToInteger {
	public int getval(char ch) {
		switch(ch) {
		case'I': return 1;
		case'V': return 5;
		case'X': return 10;
		case'L': return 50;
		case'C': return 100;
		case'D': return 500;
		case'M': return 1000;
		default : return 0;
		}
	}
	public int rometoInt(String str) {
		int sum =0;
		int size = str.length();
		char ch ;
		for(int i =0 ;i<size; i++) {
			ch =str.charAt(i);
			if((i+1)<size && getval(ch)<getval(str.charAt(i+1))) {
				sum-=getval(ch);
			}else {
				sum+=getval(ch);
			}
		}
		return sum;
	}
	public static void main(String [] args) {
		String str = "XL";
		RomeToInteger  rt = new RomeToInteger();
		int ans = rt.rometoInt(str);
		System.out.println(ans);
	}
}
