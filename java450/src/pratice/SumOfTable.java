package pratice;

public class SumOfTable {
	static int totalSum(int table , int times) {
		int sum=0;
	//	sum = table *( times*(times+1)/2);
		
		sum = table*times*(times+1)/2;
		
		return sum;
		
	}
	public static void main(String[] args) {
		int table =2;
		int times =10;
		System.out.println("Sum of the table is : " +totalSum(table,times));
	}
}
