package patten;

public class AbcHoloDimand {
	static void holoDimand(int n) {
		char currentChar = 'A';
		for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            // Print characters in ascending order
            
            for (int j = 1; j <= 2 * i - 1; j++) {
            	if(j ==1 || j==2 * i - 1) {
                System.out.print(currentChar + " ");
                currentChar++;
            	}else  System.out.print( "  ");
            }
            
            // Move to the next line
            System.out.println();
        }
		currentChar = (char)(currentChar-3);
		for (int i = n-1; i >0; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            // Print characters in ascending order
            
            for (int j = 1; j <= 2 * i - 1; j++) {
            	if(j ==1 || j==2 * i - 1) {
                System.out.print(currentChar + " ");
                currentChar--;
            	}else  System.out.print( "  ");
            }
            
            // Move to the next line
            System.out.println();
        }
	}

	public static void main(String[] args) {
		holoDimand(7);
	}
}
