package binaryTrees;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Q6InorderTraversalRecursionAndIteration {
	static class NodeTree{
		int val;
		NodeTree left;
		NodeTree right;
		NodeTree(int val){
			this.val = val;
		}
	}
	void inOrdrRecursion(NodeTree root) {
		if(root== null) {
			return;
		}
		inOrdrRecursion(root.left);
		System.out.print(root.val+" ");
		inOrdrRecursion(root.right);
	}
	List<Integer> inOrder(NodeTree root) {
		List<Integer> result = new LinkedList<Integer>();
		Stack<NodeTree> s = new Stack<NodeTree>();
		NodeTree node = root;
		
		while(true) {
			if (node != null) {
				s.add(node);
				node = node.left;
			}else {
				if(s.isEmpty()) {
					break;
				}
				node = s.pop();
				result.add(node.val);
				node = node.right;
				
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);
		
		root.right = new NodeTree(3);
		root.right.left = new NodeTree(6);
		root.right.right = new NodeTree(7);
		Q6InorderTraversalRecursionAndIteration list = new Q6InorderTraversalRecursionAndIteration();
		List<Integer> ll = list.inOrder(root);
		
		for(Integer i : ll) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		list.inOrdrRecursion(root);
	}

}
