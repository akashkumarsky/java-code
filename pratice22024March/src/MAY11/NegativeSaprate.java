package MAY11;

public class NegativeSaprate {
	public static void sapratesNeg(int [] arr) {
		int size = arr.length;
		int [] arr1 = new int[size];
			int k=0, l =size-1;
			for(int j =0; j<size; j++) {
				
				if(arr[j]>=0) {
					arr1[k++]=arr[j];
				}else {
					arr1[l--]=arr[j];
				}
				
				
			}
//			for(int i =0; i<size; i++) {
//				if(arr[i]<0) {
//					arr1[k++]=arr[i];
//				}
//			}
		
		for(int i : arr1) System.out.print(i+" " );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,-1,-4,4,-53,5,63,56,23,-3};
		NegativeSaprate.sapratesNeg(arr);
	}

}