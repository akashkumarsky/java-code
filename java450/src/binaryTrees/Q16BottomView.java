package binaryTrees;

import java.util.Map;
import java.util.Queue;

import java.util.LinkedList;
import java.util.TreeMap;

import binaryTrees.Q15BoundaryTraversal.TreeNode;

public class Q16BottomView {
	static class Pair {
		TreeNode node;
		int hd;

		Pair(TreeNode n, int h) {
			this.hd = h;
			this.node = n;
		}
	}

	Map<Integer, Integer> bottomview(TreeNode root) {
		Map<Integer, Integer> map = new TreeMap<>();
		if (root == null)
			return map;
		Queue<Pair> q = new LinkedList<>();

		q.offer(new Pair(root, 0));
		while (!q.isEmpty()) {
			Pair temp = q.poll();
			int hd = temp.hd;
			TreeNode node = temp.node;
			map.put(hd, node.val);
			if (node.left != null) {
				q.offer(new Pair(node.left, hd - 1));
			}
			if (node.right != null) {
				q.offer(new Pair(node.right, hd + 1));
			}
		}
		return map;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(8);
		Q16BottomView ans = new Q16BottomView();

		Map<Integer, Integer> res = ans.bottomview(root);

		System.out.println("Bottom view");
		for (Map.Entry<Integer, Integer> i : res.entrySet()) {
			System.out.print(i.getValue() + " ");
		}
		System.out.println();

		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(10);
		root1.left.left.right = new TreeNode(5);
		root1.left.left.right.right = new TreeNode(6);
		root1.right = new TreeNode(3);
		root1.right.right = new TreeNode(10);
		root1.right.left = new TreeNode(9);

		Map<Integer, Integer> res1 = ans.bottomview(root1);

		System.out.println("Bottom view");
		for (Map.Entry<Integer, Integer> i : res1.entrySet()) {
			System.out.print(i.getValue() + " ");
		}

	}
}
