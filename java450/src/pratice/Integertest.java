package pratice;

public class Integertest {
	public static void main(String [] args) {
		
		Integer a = 100;
		Integer b = 100;
		Integer c = 200;
		Integer d = 200;
		System.out.println(Integer.valueOf(a)==Integer.valueOf(b));
		System.out.println(Integer.valueOf(c)==(Integer.valueOf(d)));
	}
}
