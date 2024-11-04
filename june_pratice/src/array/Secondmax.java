package array;

public class Secondmax {
	int secmin(int[] arr) {
		int size = arr.length;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			if (arr[i] < min1) {
				min1 = arr[i];
			}
			if (arr[i] < min2 && arr[i] != min1) {
				min2 = arr[i];
			}
		}
		return min2;
	}

	int secMax(int[] arr) {
		int size = arr.length;
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i = 0; i < size; i++) {
            if(arr[i] > max1) {
                // If a new maximum is found, update max2 to the old max1
                //max2 = max1; // CHANGE: Update max2 to old max1
                max1 = arr[i];
            }  if(arr[i] > max2 && arr[i] != max1) {
                // If arr[i] is between max1 and max2, update max2
                max2 = arr[i];
            }
        }
		return max2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -12,111, -1, 2, 2, 3, 4, -11, 5, 6, 1, 1, 8 };
		Secondmax sm = new Secondmax();
		System.out.println(sm.secMax(arr));
		System.out.println(sm.secmin(arr));
	}

}
