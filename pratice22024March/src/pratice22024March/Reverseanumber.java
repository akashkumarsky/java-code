package pratice22024March;

public class Reverseanumber {
	static void rev(int n) {
		if(n<=9) { 
			System.out.print(n);
			return;
			}else {
		
		System.out.print(n%10);
		rev(n/10);
		
			}

	}

	public static void main(String[] args) {
		rev(45343);
	}
}
