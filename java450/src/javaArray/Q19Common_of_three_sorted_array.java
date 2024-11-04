package javaArray;

//find the common of three sorted array
public class Q19Common_of_three_sorted_array {
	public static void commonOfThree(int[] arr1, int[] arr2, int[] arr3, int size1, int size2, int size3) {
		int a=0,b=0,c=0;
		while(a<size1 && b<size2 && c<size3) {
			if(arr1[a]==arr2[b]&&arr2[b]==arr3[c]) {
				System.out.print(arr1[a]+", ");
				a++;b++;c++;
			}
			else if(arr1[a]<arr2[b]) {
				a++;
			}else if(arr2[b]<arr1[a]) {
				b++;
			}else {
				c++;
			}
		}
	}

	public static void main(String[] args) {
		//three sorted arrays
		int[] arr1 = { 1, 5, 10, 20, 40, 80 };
		int[] arr2 = { 6, 7, 20, 80, 100 };
		int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };
		int size1 = arr1.length;
		int size2 = arr2.length;
		int size3 = arr3.length;
		commonOfThree(arr1, arr2, arr3, size1, size2, size3);
	}
}
