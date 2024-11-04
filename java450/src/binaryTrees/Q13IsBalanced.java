package binaryTrees;

import binaryTrees.Q11TopView.TreeNode;

public class Q13IsBalanced {
	boolean isBalance(TreeNode root) {
		return treeHight(root) != -1;
	}

	int treeHight(TreeNode root) {
		if (root == null)
			return 0;

		int lh = treeHight(root.left);
		if (lh == -1)
			return -1;
		int rh = treeHight(root.right);
		if (rh == -1)
			return -1;

		if (Math.abs(lh - rh) > 1)
			return -1;

		return Math.max(lh, rh) + 1;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(8);
		Q13IsBalanced ll = new Q13IsBalanced();
		if (ll.isBalance(root)) {
			System.out.println("Tree is balance");
		} else {
			System.out.println("Tree is Not balance");
		}

		TreeNode root1 = new TreeNode(10);
		root1.left = new TreeNode(5);
		root1.right = new TreeNode(30);
		root1.right.left = new TreeNode(15);
		root1.right.right = new TreeNode(20);
		if (ll.isBalance(root1)) {
			System.out.println("Tree is balance");
		} else {
			System.out.println("Tree is Not balance");
		}

	}
}
