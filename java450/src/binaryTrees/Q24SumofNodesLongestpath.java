package binaryTrees;

import binaryTrees.Q11TopView.TreeNode;

public class Q24SumofNodesLongestpath {
	int longestSum(TreeNode root) {
		if(root ==null) return 0;
		int lsum = longestSum(root.left);
		int rsum = longestSum(root.right);
		
		int maxSum = Math.max(lsum, rsum);
		return maxSum+root.val;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(8);
		Q24SumofNodesLongestpath tree = new Q24SumofNodesLongestpath();
		System.out.print(tree.longestSum(root));
	}

}
