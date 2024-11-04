package string;

public class Q10_Split_the_Binary_string {
	public static void main(String[] args) {
		String str = "0100110101";
		int a = maximumCountOfSubString(str);
		System.out.println(a);
	}

	private static int maximumCountOfSubString(String str) {
		int count0 = 0;
		int count1 = 0;
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == '0') {
				count0++;
			} else
				count1++;

			if (count0 == count1) {
				ans++;
				
			}

		}
		if (count0 != count1) {
			return -1;
		}

		return ans;

	}
}
