package array;

public class SaprateZeroOneTwo {
	static void saprater1(int[] arr) {
		int low =0;
		int mid =0;
		int hight = arr.length-1;

		while(mid<=hight) {
			switch(arr[mid]) {
			case 0:
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				int temp1 = arr[mid];
				arr[mid] = arr[hight];
				arr[hight] = temp1;
				hight--;
				break;
				
			}
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	static void saprater(int[] arr) {
		int Two =0;
		int One =0;
		int Zero =0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==2) Two++;
			if(arr[i]==1) One++;
			if(arr[i]==0) Zero++;
			arr[i]=0;
		}
		for(int j =0;j<Two;j++) {
			arr[j]=2;
		}
		for(int j =Two+Zero;j<arr.length; j++) {
			arr[j]=1;
		}
		
		for(int i:arr) {
			System.out.print(i+", ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,0,2,1,1,1,2,2,0,0,2,1,0,0};
		//saprater(arr);
		saprater1(arr);

	}

}
