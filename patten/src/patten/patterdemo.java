package patten;

public class patterdemo {
public static void main(String[] args) {
	  int rows = 5;
      int currentNumber = 1;
      int[][] pattern = new int[rows][rows];

      // Constructing the pattern
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j <= i; j++) {
              pattern[i - j][j] = currentNumber++;
          }
      }

      // Printing the pattern
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < rows; j++) {
              if (pattern[i][j] != 0) {
                  System.out.print(pattern[i][j] + " ");
              } else {
                  System.out.print("  ");
              }
          }
          System.out.println();
      }
  }
}
