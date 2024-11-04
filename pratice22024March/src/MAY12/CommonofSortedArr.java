package MAY12;

public class CommonofSortedArr {
	public static void common(int[] arr1, int[] arr2, int[] arr3) {
		int i =0,j=0,k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]) {
				System.out.print(arr1[i]+", ");
				i++;j++;k++;
			}else if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr1[i]>arr2[j]) {
				j++;
			}else k++;
			
		}
	}
	public static void main(String [] agrs) {
		int [] arr1 = {3,5,6,7,8};
		int [] arr2 = {3,6,7};
		int [] arr3 = {3,6,7,9};
		CommonofSortedArr.common(arr1,arr2,arr3);
		
	}
}
