package binaryTrees;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import binaryTrees.Q1LevelOrderTraversal.NodeTree;

public class Q8PostorderTraversalRecursionAndIteration {
	

	void postOrderRecursion(NodeTree root) {
		if (root == null)
			return;
		postOrderRecursion(root.left);
		postOrderRecursion(root.right);
		System.out.print(root.val + " ");
	}

	List<Integer> postOrder(NodeTree root) {
		List<Integer> res = new LinkedList<>();
		if (root == null)
			return res;
		Stack<NodeTree> st1 = new Stack<>();
		Stack<NodeTree> st2 = new Stack<>();
		st1.push(root);
		while (!st1.isEmpty()) {
			root = st1.pop();
			st2.push(root);
			if (root.left != null)
				st1.push(root.left);
			if (root.right != null)
				st1.push(root.right);
		}
		while (!st2.isEmpty()) {
			res.add(st2.pop().val);
		}

		return res;

	}

	public static void main(String[] args) {
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);

		root.right = new NodeTree(3);
		root.right.left = new NodeTree(6);
		root.right.right = new NodeTree(7);
		Q8PostorderTraversalRecursionAndIteration list = new Q8PostorderTraversalRecursionAndIteration();
		list.postOrderRecursion(root);

		System.out.println();
		List<Integer> ans = list.postOrder(root);

		for (Integer i : ans) {
			System.out.print(i+" ");
		}
	}

}
