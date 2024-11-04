package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class Q21CheckLeafNodesAtSameLevel {
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){
			this.val= val;	
		}
	}
	static class TreeNodeleaf{
		int level ;
		TreeNode node;
		TreeNodeleaf(TreeNode node,int level){
			this.node = node;
			this.level = level;
			
		}
	}
	boolean checkifsomeLevel(TreeNode root) {
		if(root==null) return true;
		Queue<TreeNodeleaf> q = new LinkedList<>();
		q.add(new TreeNodeleaf(root,0));
		
		Integer leaflevel = null;
		while(!q.isEmpty()) {
			TreeNodeleaf nodeleaf = q.poll();
			TreeNode node = nodeleaf.node;
			int level = nodeleaf.level;
			
			if(node.left==null && node.right ==null) {
				if(leaflevel==null) {
					leaflevel=level;
				}else if(leaflevel!=level) {
					return false;
				}
			}
			if(node.left!=null) {
				q.add(new TreeNodeleaf(node.left,level+1));
			}
			if(node.right!=null) {
				q.add(new TreeNodeleaf(node.right,level+1));
			}
		}
		return true;
	}
	 public static void main(String[] args) {
	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        root.right.right = new TreeNode(6);
	       // root.left.left.left = new TreeNode(7);
	       // root.left.left.right = new TreeNode(8);

	       Q21CheckLeafNodesAtSameLevel checker = new Q21CheckLeafNodesAtSameLevel();
	        boolean result = checker.checkifsomeLevel(root);

	        System.out.println("Are all leaf nodes at the same level? " + result);
	    }
}
