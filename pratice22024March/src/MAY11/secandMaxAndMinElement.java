package MAY11;

public class secandMaxAndMinElement {
	public static void maxMin(int [] arr,int k) {
		int size = arr.length;
		for(int i = 0;i<size; i++) {
			for(int j = i+1; j<size; j++) {
				if(arr[i] >arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print(arr[0]+" is smallest number and "+arr[size-1]+" is largest Number in array");
		System.out.println();
		System.out.print("kth smallest number is " +arr[k-1]+ " and the largest number is "+arr[size-k]);
	}
	
	public static void main(String [] args) {
		int [] arr = {43,535,563,5,53,1,53};
		int k =3;
		secandMaxAndMinElement.maxMin(arr,k);
	}

}