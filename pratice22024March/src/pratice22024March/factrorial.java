package pratice22024March;

public class factrorial {
	public static int callfact(int a) {
		int fact = 1;
		while (0 < a) {
			fact = fact * a;
			a--;
		}

		return fact;
	}
	

	public static void main(String[] args) {
		System.out.print(callfact(5));
	}
}
