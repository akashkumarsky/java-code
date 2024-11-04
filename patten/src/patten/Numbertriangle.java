package patten;

public class Numbertriangle {
	static void numTrinangle(int n) {
		for (int i = 1; i <= n; i++) {
			int count =i;
			for (int j = 1; j <= i; j++) {
				
				System.out.print(count + "   ");
				count +=n-j;

			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		numTrinangle(7);
	}
}
