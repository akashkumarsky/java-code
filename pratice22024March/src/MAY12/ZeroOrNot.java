package MAY12;

public class ZeroOrNot {
	public static boolean findZero(int [] arr) {
		
		int size = arr.length;
		for(int i =0;i<size-1; i++) {
			if(arr[i]==0) return true;
			
			for(int j =i+1; j<size; j++) {
				if(arr[i]+arr[j]==0) {
					return true;
				}
			}
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		int []arr = {1,6,8};
		if(ZeroOrNot.findZero(arr)) {
			System.out.print("Zero found");
		}else {
			System.out.print("Zero Not found");
		}
		
	}
}
