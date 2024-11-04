package pratice;

public class RomantoInteger {
	public static void main(String[] args) {
		String str = "CL";
		System.out.println(romToInt(str));
	}

	private static int romToInt(String str) {
		int sum =0;
		int size = str.length();
		char ch;
		for (int i = 0; i < size; i++) {
			ch = str.charAt(i);
			if((i+1)<size && getCharVal(ch)<getCharVal(str.charAt(i+1))){
				sum-=getCharVal(ch);
			}else sum+=getCharVal(ch);
		}
		return sum;
		
	}

	private static int getCharVal(char ch) {
		switch (ch) {
		case 'I':return 1;
		case 'V':return 5;
		case 'X':return 10;
		case 'L':return 50;
		case 'C':return 100;
		case 'D':return 500;
		case 'M':return 1000;
		default:
			return 0;
		}


	}

	
}
