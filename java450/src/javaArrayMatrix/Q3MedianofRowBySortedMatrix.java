package javaArrayMatrix;

public class Q3MedianofRowBySortedMatrix {
	//Assume - r*c is odd
	static int Findmedian(int arr[] [],int row, int col ) {
		int [] newArr =new int[row*col];
		int k =0;
		for(int i =0 ; i<row; i++) {
			for(int j =0; j<col; j++) {
				newArr[k]=arr[i][j];
				k++;
			}
		}
		
		return newArr[newArr.length/2];
	}
	public static void main(String args[]) {
	    int row = 3, col = 3;
	    int[][] arr = {{1, 3, 8},
	                   {2, 3, 4},
	                   {1, 2, 5}};
	                   
	    System.out.println("The median of the row-wise sorted matrix is: "+
	    Findmedian(arr, row, col));
	 
	  }
}
