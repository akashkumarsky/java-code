package javaArray;
//0 ,1 and 2 sort without using alog
public class Q4Zero_One_Two_Sort {
	static void ZeroOneTwo(int[] arr) {
		int zero=0;
		int one = 0;
		int two = 0;
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i]==0) {
				zero++;
			}else if(arr[i]==1) {
				one++;
			}else two++;
			
		}
		int k = 0;
		for(int i=0;i<zero; i++) arr[k++]=0;
		for(int i=0;i<one; i++) arr[k++]=1;
		for(int i=0;i<two; i++) arr[k++]=2;
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		
		                              
		
	}
	
	public static void main(String [] args) {
		int [] arr = new int [] {1,0,2,2,1,1,0};
		ZeroOneTwo(arr);
	}

}
