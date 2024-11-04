package javaArray;
//find the maximum and minimum element in an array.
public class Q2_Max_And_Min_Of_Array {
	
	static void maxAndMin(int [] arr) {
		
		for(int i = 0 ; i<arr.length; i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]+" is a maximum and "+arr[0]+  " is minmum element in the arry");
	}
	
	
	
	public static void main(String [] args) {
		int [] arr = new int[] {77,5,6,24,64,9,22,1};
		maxAndMin(arr);
		
	}

}
