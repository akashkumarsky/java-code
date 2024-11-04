package binaryTrees;

import binaryTrees.Q15BoundaryTraversal.TreeNode;

public class Q18CBTintoSumtree {
	int convertBTIntoSumTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int curroot = root.val;
		int lsum = convertBTIntoSumTree(root.left);
		int rsum = convertBTIntoSumTree(root.right);
		root.val = lsum + rsum;

		return root.val + curroot;
	}

	void InOrder(TreeNode root) {
		if (root == null)
			return;
		InOrder(root.left);
		System.out.print(root.val + " ");
		InOrder(root.right);
	}

	public static void main(String [] args) {
		 TreeNode root = new TreeNode(10);
	        root.left = new TreeNode(-2);
	        root.right = new TreeNode(6);
	        root.left.left = new TreeNode(8);
	        root.left.right = new TreeNode(-4);
	        root.right.left = new TreeNode(7);
	        root.right.right = new TreeNode(5);
		Q18CBTintoSumtree list = new Q18CBTintoSumtree();
		list.convertBTIntoSumTree(root);
		list.InOrder(root);
	}
}//0 91 0 106 36 0 0
//0 4 0 20 0 12 0