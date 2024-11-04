package array;

public class Union {
	static void union(int [] arr1,int [] arr2) {
		int i=0;
		int j=0; 
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				System.out.print(arr1[i]+" ");
				i++;
			}else if(arr1[i]>arr2[j]){
				System.out.print(arr2[j]+" ");
				j++;
			}else {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
		while(i<arr1.length) {
			System.out.print(arr1[i++]+" ");
		}
		while(j<arr2.length) {
			System.out.print(arr2[j++]+" ");
		}
	}
public static void main(String[] args) {
	int [] arr1 = {1,3,5,6,7,8,9,22};
	int [] arr2 = {2,3,6,7,10,12,24,33};
	union(arr1,arr2);
}
}
