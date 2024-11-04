package binaryTrees;

import binaryTrees.Q15BoundaryTraversal.TreeNode;

public class Q17ConvetBTintoDLL {
	
	TreeNode prev = null;
	TreeNode head = null;
	void CBTintoDLL(TreeNode root) {
		if(root == null) return;
		CBTintoDLL(root.left);
		if(prev==null) head = root;
		else {
			root.left = prev;
			prev.right = root;
		}
		prev = root;
		CBTintoDLL(root.right);
		
	}
	void printDLL(TreeNode head) {
		while(head!=null) {
			System.out.print(head.val+" ");
			head=head.right;
		}
	}
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(12);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(25);
		root.left.right = new TreeNode(30);
		root.left.right.left = new TreeNode(36);
		Q17ConvetBTintoDLL list = new Q17ConvetBTintoDLL();
		list.CBTintoDLL(root);
		list.printDLL(list.head);
	}

}
