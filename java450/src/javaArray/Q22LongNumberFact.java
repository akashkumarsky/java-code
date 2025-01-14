package javaArray;

import java.util.ArrayList;
import java.util.List;

public class Q22LongNumberFact {
	static ArrayList<Integer> fact1(int n) {
		ArrayList<Integer> al = new ArrayList<>();
		int listsize = 1;
		int carry = 0;
		al.add(0, 1);

		int val = 2;
		while (val <= n) {
			for (int i = listsize - 1; i >= 0; i--) {
				int temp = al.get(i) * val + carry;

				al.set(i, temp % 10);

				carry = temp / 10;
			}

			while (carry != 0) {
				al.add(0, carry % 10);
				carry = carry / 10;
				listsize++;
			}

			val++;// while loop conditon increment
		}
		return al;

	}

	public static void main(String[] args) {
		int n = 110;
		List<Integer> al1 = new ArrayList<Integer>(fact1(n));
		for (Integer i : al1) {
			System.out.print(i);
		}

	}

}
