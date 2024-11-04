package patten;

public class NumberSquare {
	static void square(int n) {
		
		//1st half
		for (int i = n; i > 0; i--) {
			//for space
			for (int j = n; j > i; j--) {

				System.out.print(j + " ");

			}
			//mid triangle part of the square
			for (int j = 2; j <= (2*i)-1; j++) {

				System.out.print(i + " ");

			}
			
			// last part of square
			for (int j = i; j <=n; j++) {
				System.out.print(j + " ");
				
			}
			
			
			System.out.println();
		}
		//other half
		for (int i = 2; i <=n; i++) {

			for (int j = n; j > i; j--) {

				System.out.print(j + " ");

			}
			for (int j = 2; j <= (2*i)-1; j++) {

				System.out.print(i + " ");

			}
			

			for (int j = i; j <=n; j++) {
				System.out.print(j + " ");
				
			}
			
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		square(9);
	}
}
