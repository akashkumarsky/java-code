package pratice;

public class OneSide {
	public static void main(String[] args) {
		int [] a= {0,8,3,0,6,3,0,5,0,4,0};
		int j=0;
		
		for(int i =0 ; i<a.length; i++) {
			if(a[i]>0) {
				int temp = a[i];
				a[j] =a[i];
				a[i] =0;
				//a[j] =temp;
				j++;
			}
		}
		
		for(int k : a) {
			System.out.print(k+" ");
		}
	}
}
