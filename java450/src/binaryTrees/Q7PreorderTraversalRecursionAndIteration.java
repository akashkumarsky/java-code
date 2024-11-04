package binaryTrees;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import binaryTrees.Q6InorderTraversalRecursionAndIteration.NodeTree;

public class Q7PreorderTraversalRecursionAndIteration {
	List<Integer> preOrder(NodeTree root){
		List<Integer> result = new LinkedList<>();
		if(root== null) return result;
		Stack<NodeTree> st = new Stack<>();
		st.push(root);
		while(!st.isEmpty()) {
			root = st.pop();
			result.add (root.val);
			if(root.right!=null) {
				st.push(root.right);
			}
			if(root.left!=null) {
				st.push(root.left);
			}
		}
		return result;
	}
	void preorderRecursion(NodeTree root) {
		if(root == null) return ;
		System.out.print(root.val+ " ");
		preorderRecursion(root.left);
		preorderRecursion(root.right);
	}
	public static void main(String[] args) {
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);
		
		root.right = new NodeTree(3);
		root.right.left = new NodeTree(6);
		root.right.right = new NodeTree(7);
		
		Q7PreorderTraversalRecursionAndIteration list = new Q7PreorderTraversalRecursionAndIteration();
		list.preorderRecursion(root);
		
		List<Integer>res = list.preOrder(root);
		
		System.out.println();
		for(Integer i : res) {
			System.out.print(i+" ");
		}
	}

}
