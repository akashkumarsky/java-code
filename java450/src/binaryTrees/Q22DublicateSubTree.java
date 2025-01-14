package binaryTrees;

import java.util.HashSet;
import java.util.Set;

import binaryTrees.Q21CheckLeafNodesAtSameLevel.TreeNode;

public class Q22DublicateSubTree {
	Set<String> subtree = new HashSet<>();

	String search(TreeNode root) {
		String s = "";
		if (root == null)
			return s + '$';

		String leftSub = search(root.left);
		if (leftSub.equals(s))
			return s;

		String rightSub = search(root.right);
		if (rightSub.equals(s))
			return s;

		s = s + root.val+',' + leftSub+',' + rightSub;
		//differentiate from 11,1 and 1,11
		if (s.length() > 7 && subtree.contains(s)) {
			return "";
		}

		subtree.add(s);

		return s;

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(2);
		root.right.right.left = new TreeNode(4);
		root.right.right.right = new TreeNode(5);
		Q22DublicateSubTree tree = new Q22DublicateSubTree();
		String str = tree.search(root);

		if (str.equals(""))
			System.out.println("Yes, the binary tree contains duplicate subtree of size 2 or more");
		else
			System.out.println("No, the binary tree contains duplicate subtree of size 2 or more");
	}

}
