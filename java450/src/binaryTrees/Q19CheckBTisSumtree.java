package binaryTrees;

import binaryTrees.Q11TopView.TreeNode;

public class Q19CheckBTisSumtree {
	int sum(TreeNode node) {
		if(node == null) {
			return 0;
		}
		return sum(node.left)+node.val+sum(node.right);
	}
	int isTreesum(TreeNode node) {
		if(node== null||node.left==null&&node.right==null) return 1;
		int lsum = sum(node.left);
		int rsum = sum(node.right);
		
		if((node.val==lsum+rsum)&& isTreesum(node.left)!=0 && isTreesum(node.right)!=0) return 1;
		
		return 0;
	}
	public static void main(String[] args) {
		 TreeNode root=new TreeNode(26);
	        root.left=new TreeNode(10);
	        root.right=new TreeNode(3);
	        root.left.left=new TreeNode(4);
	        root.left.right=new TreeNode(6);
	        root.right.right=new TreeNode(3);
       
        
        Q19CheckBTisSumtree list = new Q19CheckBTisSumtree();
        int ans = list.isTreesum(root);
        if(ans==1) {
        	System.out.println("it is sum tree");
        }else System.out.println("not a sum tree");

	}

}
