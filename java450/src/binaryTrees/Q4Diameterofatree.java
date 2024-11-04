package binaryTrees;



public class Q4Diameterofatree {
	int diameter;
	static class NodeTree {
		int val;
		NodeTree left;
		NodeTree right;

		NodeTree(int val) {
			this.val = val;
		} 
	}
	int height(NodeTree node) {
		if(node == null) {
			return 0;
		}
		int lheight = height(node.left);
		int rheight = height(node.right);
		
		diameter = Math.max(diameter , lheight+rheight);
		
		return 1+ lheight+rheight;
	}
	int diameterofTree (NodeTree root) {
		diameter =0;
		height(root);
		return diameter;
	}
	public static void main(String [] args) {
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);
		
		root.right = new NodeTree(3);
		root.right.left = new NodeTree(6);
		root.right.right = new NodeTree(7);
		
		Q4Diameterofatree di  = new Q4Diameterofatree();
		System.out.println("diameter of the tree is : "+di.diameterofTree(root));
	}
}
