package binaryTrees;

public class Q3HeightofBinaryTree {
	static class NodeTree{
		int val;
		NodeTree left;
		NodeTree right;
		NodeTree(int val){
			this.val = val;
		}
	}
	int height(NodeTree root) {
		if(root == null) return 0;
		
		int lh = 0;
		int rh =0;
		
			lh=height(root.left);
		
			rh = height(root.right);
		
		int maxheight = Math.max(lh, rh)+1;
		return maxheight;
	}
	public static void main(String [] args) {
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);
		
		root.right = new NodeTree(3);
		root.right.left = new NodeTree(6);
		root.right.right = new NodeTree(7);
		Q3HeightofBinaryTree list = new Q3HeightofBinaryTree();
		System.out.println("Height or depth the binary tree : "+list.height(root));
	}
}
