package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q2ReverseLevelOrdertraversal {
	static class NodeTree{
		int val;
		NodeTree left;
		NodeTree right;
		NodeTree(int val){
			this.val = val;
		}
	}
	void reverseLevelOrder(NodeTree root){
		if(root == null) return;
		Queue<NodeTree> queue = new LinkedList<>();
		Stack<NodeTree> stack = new Stack<>();
		
		queue.offer(root);
		while(!queue.isEmpty()) {
			NodeTree node = queue.poll();
			stack.add(node);
			//order right to left -----------------------------
			if(node.right != null) {
				queue.offer(node.right);
			}
			
			if(node.left != null) {
				queue.offer(node.left);
			}
			//-------------------------------------------------
			
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().val + " ");
		}
	}
	public static void main(String [] args) {
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);
		
		root.right = new NodeTree(3);
		root.right.left = new NodeTree(6);
		root.right.right = new NodeTree(7);
		
		Q2ReverseLevelOrdertraversal list = new Q2ReverseLevelOrdertraversal();
		list.reverseLevelOrder(root);
		
	}
}
