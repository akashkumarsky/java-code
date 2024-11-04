package binaryTrees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import binaryTrees.Q11TopView.TreeNode;

public class Q12ZigZagTraversal {
	List<List<Integer>> zigZagTraversal(TreeNode root) {
		List<List<Integer>> result = new LinkedList<>();
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		boolean lefttoright = true; // if true traversal left to right
		// if false traversal right to left
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> list = new LinkedList<>();
			for (int i = 0; i < size; i++) {
				TreeNode node = q.poll();
				list.add(lefttoright ? list.size() : 0, node.val);

				if (node.left != null) {
					q.add(node.left);
				}
				if (node.right != null) {
					q.add(node.right);
				}
			}
			lefttoright = !lefttoright;
			result.add(list);
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(10);
		root.left.left.right = new TreeNode(5);
		root.left.left.right.right = new TreeNode(6);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(11);
		root.right.left = new TreeNode(9);
		Q12ZigZagTraversal ans = new Q12ZigZagTraversal();
		List<List<Integer>> res = ans.zigZagTraversal(root);
		for (List<Integer> level : res) {
			for (int val : level) {
				System.out.print(val + " ");
			}
			//System.out.println();
		}
	}
}
