package MAY11;

public class ZeroOneTwo {
	public static void saprate(int[] arr) {

		int size = arr.length;
		
		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] == 0) {
				zeroCount++;
			} else if (arr[i] == 1) {
				oneCount++;
			} else {
				twoCount++;
			}

		}
		int k=0;
		for(int i=0; i<zeroCount; i++) arr[k++] = 0;
		for(int i=0; i<oneCount; i++) arr[k++] =1;
		for(int i =0; i<twoCount; i++) arr[k++]=2;
		for(int i : arr) System.out.print(i+" ");
		
		

	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1, 2, 1, 1, 2, 2, 2, 2, 1, 1, 1, 0, 0, 0 };
		ZeroOneTwo.saprate(arr);

	}
}
