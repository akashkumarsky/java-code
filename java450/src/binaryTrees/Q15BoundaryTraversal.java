package binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class Q15BoundaryTraversal {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	List<Integer> printBoundary(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		if (!isleaf(root))
			res.add(root.val);
		leftBoundary(root, res);
		addleaf(root, res);
		rightBoundary(root, res);

		return res;
	}

	void leftBoundary(TreeNode root, List<Integer> res) {
		TreeNode curr = root.left;
		while (curr != null) {
			if (!isleaf(curr)) {
				res.add(curr.val);
			}
			if (curr.left != null)
				curr = curr.left;
			else
				curr = curr.right;
		}
	}

	void addleaf(TreeNode root, List<Integer> res) {
		if (isleaf(root)) {
			res.add(root.val);
		}
		if (root.left != null)
			addleaf(root.left, res);
		if (root.right != null)
			addleaf(root.right, res);

	}

	void rightBoundary(TreeNode root, List<Integer> res) {
		TreeNode curr = root.right;
		List<Integer> temp = new ArrayList<>();
		while (curr != null) {
			if (!isleaf(curr)) {
				temp.add(curr.val);
			}
			if (curr.right != null)
				curr = curr.right;
			else
				curr = curr.left;
		}
		for (int i = temp.size() - 1; i >= 0; i--) {
			res.add(temp.get(i));
		}
	}

	boolean isleaf(TreeNode root) {
		return root.left == null && root.right == null;
	}

	public static void main(String[] args) {
			TreeNode root = new TreeNode(1);
			root.left = new TreeNode(2);
			root.right = new TreeNode(3);
			root.left.left = new TreeNode(4);
			root.left.right = new TreeNode(5);
			root.left.left.left = new TreeNode(8);

			Q15BoundaryTraversal ans = new Q15BoundaryTraversal();

			List<Integer> result = ans.printBoundary(root);
			for (int val : result) {
				System.out.print(val + " ");
			}
		}

}
