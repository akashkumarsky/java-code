package binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1LevelOrderTraversal {
	static class NodeTree {
		int val;
		NodeTree left;
		NodeTree right;

		NodeTree(int val) {
			this.val = val;
		}
	}

	public List<List<Integer>> levelOrder2(NodeTree root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}

		Queue<NodeTree> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			List<Integer> levelValues = new ArrayList<>();

			for (int i = 0; i < levelSize; i++) {
				NodeTree node = queue.poll();
				levelValues.add(node.val);

				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}

			result.add(levelValues);
		}

		return result;
	}

	public List<List<NodeTree>> levelOrder1(NodeTree root) {
		List<List<NodeTree>> result = new LinkedList<>();
		if (root == null)
			return result;

		Queue<NodeTree> queue = new LinkedList<>();
		queue.offer(root);
		queue.offer(null);
		while (!queue.isEmpty()) {
			NodeTree curr_node = queue.poll();
			if (curr_node == null) {
				System.out.println();
				if (queue.isEmpty()) {
					break;
				} else {
					queue.offer(null);
				}
			} else {
				System.out.print(curr_node.val + " ");
				if (curr_node.left != null) {
					queue.offer(curr_node.left);
				}
				if (curr_node.right != null) {
					queue.offer(curr_node.right);
				}
			}
		}

		return result;
	}

	void levelOrder(NodeTree root) {
		if (root == null) {
			return;
		}
		Queue<NodeTree> queue = new LinkedList<>();
		queue.offer(root);
		queue.offer(null);
		while (!queue.isEmpty()) {
			NodeTree curr_node = queue.poll();
			if (curr_node == null) {
				System.out.println();
				if (queue.isEmpty()) {
					break;
				} else {
					queue.offer(null);
				}
			} else {
				System.out.print(curr_node.val + " ");
				if (curr_node.left != null) {
					queue.offer(curr_node.left);
				}
				if (curr_node.right != null) {
					queue.offer(curr_node.right);
				}
			}
		}
	}

	public static void main(String[] args) {
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.right = new NodeTree(3);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);
		root.right.right = new NodeTree(6);
		root.left.left.left = new NodeTree(7);
		root.left.left.right = new NodeTree(8);
		root.right.right.right = new NodeTree(9);

		Q1LevelOrderTraversal list = new Q1LevelOrderTraversal();
		list.levelOrder(root);

		List<List<NodeTree>> ans = list.levelOrder1(root);
		for (List<NodeTree> i : ans) {
			System.out.print(i);

		}
		List<List<Integer>> ans1 = list.levelOrder2(root);
		for (List<Integer> i : ans1) {
			System.out.print(i);

		}
	}
}
