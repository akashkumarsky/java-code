package javaArray;

public class Q28findLengthoftargetsum {
	static int solution(int [] arr, int target) {
		int minLength =Integer.MAX_VALUE;
		int left =0;
		int currsum =0;
		for(int i=0; i<arr.length;i++) {
			currsum +=arr[i];
			while(currsum>=target) {
				minLength = Math.min(minLength, i-left+1);
				currsum -= arr[left];
				left++;
			}
		}
		
		return (minLength==Integer.MAX_VALUE)?0:minLength; 
	}
	static int minimalLength(int[] arr ,int target) {
		int ansLen = Integer.MAX_VALUE;
		int lenCount =0;
		int slidwindow =0;
		int i =0;
		int sum =0;
		while(i<arr.length) {
			sum += arr[i];
			if(sum>=target) {
				lenCount = i-slidwindow +1;
			 ansLen = Math.min( ansLen, lenCount);
				while(slidwindow<i && sum>target) {
					sum -= arr[slidwindow];
					slidwindow++;
					if(sum>=target) {
						lenCount = i-slidwindow +1;
						ansLen = Math.min(ansLen, lenCount);
					}
				}
			}
			
			i++;
		}
		
		return (ansLen==Integer.MAX_VALUE)?0:ansLen;
	}
	public static void main(String [] args) {
		int [] arr = {2,3,1,2,4,3};
		int target = 7;
		System.out.print(solution(arr,target));
		System.out.println();
		System.out.print(minimalLength(arr,target));
	}
}
