package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import binaryTrees.Q11TopView.TreeNode;

public class Q14DiagnolTraversal {
	void diagnalTraversal(TreeNode root) {
		if(root ==null) return ;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			TreeNode curr = q.poll();
			if(curr==null) {
				if(q.isEmpty()) return;
				q.add(null);
			}else {
				while(curr != null) {
					System.out.print(curr.val+" ");
					if(curr.left!=null) {
						q.add(curr.left);
					}
					curr = curr.right;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(8);
		
		
		Q14DiagnolTraversal ll1 = new Q14DiagnolTraversal();
		System.out.println("Diagonal Traversal of Binary Tree ");
        ll1.diagnalTraversal(root);

	}

}
