package patten;

public class number1 {
	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i<=n; i++) {

			for (int j = n - i + 1; j <= n; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		
	}
}
