package binaryTrees;

import binaryTrees.Q11TopView.TreeNode;

public class Q23MirrorBTorNot {
	boolean areMirror(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		return root1.val == root2.val && areMirror(root1.left, root2.right) && areMirror(root1.right, root2.left);
	}

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);

		TreeNode root2 = new TreeNode(1);
		root2.right = new TreeNode(2);
		root2.left = new TreeNode(3);
		root2.right.right = new TreeNode(4);
		Q23MirrorBTorNot tree = new Q23MirrorBTorNot();
		if (tree.areMirror(root1, root2)) {
			System.out.println("both are mirror");
		} else {
			System.out.println("Not mirror");
		}
	}
}
