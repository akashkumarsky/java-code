package pratice;

public class AllUniqueElement {
public static void main(String[] args) {
	int [] arr = {7,9,11,7,9,8,6,7};
	allUnique(arr);
}

private static void allUnique(int[] arr) {
	int j =0;
	int size = arr.length;
	for (int i = 0; i < size-1; i++) {
		
				if(arr[i]!=arr[j]) {
					j++;
					
				}
		}
		
	
	
}
}
