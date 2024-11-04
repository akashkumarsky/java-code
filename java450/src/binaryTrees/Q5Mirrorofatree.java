package binaryTrees;

public class Q5Mirrorofatree {
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){
			this.val = val;
		}
	}
	void inorder(TreeNode root) {
		if(root == null) return ;
		inorder(root.left);
		System.out.print(root.val+ " ");
		inorder(root.right);
	}
	
	TreeNode mirrortree(TreeNode root) {
		if(root == null) return null;
		
		TreeNode left = mirrortree(root.left);
		TreeNode right = mirrortree(root.right);
		
		root.right = left;
		root.left = right;
	
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		Q5Mirrorofatree ll = new Q5Mirrorofatree();
		
		System.out.print("orignal tree: ");
		ll.inorder(root);
		TreeNode root1 =ll.mirrortree(root);
		System.out.print("\nafter mirroring : ");
		ll.inorder(root1);
	}

}
