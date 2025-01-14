package javaArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q25findallElementNbyK {
	

	static void morethanNdK(int[] arr, int n, int k) {
		int comp = n / k;

		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!m.containsKey(arr[i])) {
				m.put(arr[i], 1);
			} else {
				int count = m.get(arr[i]);
				m.put(arr[i], count + 1);
			}
		}
		for (int i : m.keySet()) {
			if (m.get(i) > comp) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {0,0, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1 };
		int n = 12;
		int k = 4;
		morethanNdK(arr, n, k);
		System.out.println();
		

	}

}
