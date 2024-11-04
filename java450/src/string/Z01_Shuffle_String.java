package string;

public class Z01_Shuffle_String {
	
	
	
	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,1,2,3 };
		String ans =shuffle(s,indices);
		System.out.print(ans);
	}

	private static String shuffle(String s, int[] indices) {
		char[] ch = s.toCharArray();
		for(int i=0 ;i<indices.length;i++) {
			ch[indices[i]]=s.charAt(i);
		}
		return new String(ch);
	}
}
