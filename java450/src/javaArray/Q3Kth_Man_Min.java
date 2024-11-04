package javaArray;
//find the kth max and min element in the array
public class Q3Kth_Man_Min {
	static void kthElement(int [] arr, int k) {
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(k+"th max is : "+arr[arr.length-k]);
		System.out.println(k+"th min is : "+arr[k-1]);
	}
	public static void main(String [] args) {
		int [] arr = new int [] {3,53,2,534,24,25,5};
		kthElement(arr, 7);
		
	}

}
