package javatree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplemetiation {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTee {
		static int index = -1;
 
		public static Node buildBinary(int nodes[]) {
			index++;
			if (nodes[index] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[index]);
			newNode.left = buildBinary(nodes);
			newNode.right = buildBinary(nodes);
			return newNode;
		}
	}

	// Tree Traversals preorder
	public static void preorder(Node root) {
		if(root == null) {
			System.out.print(-1+" ");
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
//	Tree Traversals inorder
	public static void inorder(Node root) {
		if(root == null) {
			System.out.print(-1+" ");
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	//Tree Traversals postorder
	public static void postorder(Node root) {
		if(root == null) {
			System.out.print(-1+" ");
			return;
			
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	//level order
	public static void levelorder(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node curr = q.remove();
			if(curr ==null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				System.out.print(curr.data+" ");
				if(curr.left !=null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
		}
		System.out.println();
	}
	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		
		return Math.max(leftheight, rightheight)+1;
	}
	public static int totalNode(Node root) {
		if(root == null) {
			return 0;
		}
		int leftNode = totalNode(root.left);
		int rightNode = totalNode(root.right);
		
		return leftNode+rightNode+1;
	}
	public static int sumofNode(Node root) {
		if(root==null) {
			return 0;
		}
		int leftsum = sumofNode(root.left);
		int rightsum = sumofNode(root.right);
		
		return leftsum+rightsum+root.data;
	}
	//longest path avil
	public static int diameteroftree(Node root) {
		//cox(n^2)
		if(root == null) {
			return 0;
		}
		int diameter = height(root.left)+height(root.left)+1;
		int diameter2 = diameteroftree(root.left);
		int diameter3 = diameteroftree(root.right);
		
		return Math.max(diameter, Math.max(diameter2,diameter3));
	}

	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
	//	BinaryTee tree = new BinaryTee();

		Node root = BinaryTee.buildBinary(nodes);
//		System.out.println(root.data); //for check if root is right or not
		System.out.println("preorder");
		BinaryTreeImplemetiation.preorder(root);
		System.out.println("inorder");
		BinaryTreeImplemetiation.inorder(root);
		//System.out.print(root.data);
		System.out.println("postorder");
		BinaryTreeImplemetiation.postorder(root);
		System.out.println("levelorder ");
		BinaryTreeImplemetiation.levelorder(root);
		System.out.println();
		int ans =BinaryTreeImplemetiation.height(root);
		System.out.println("hight of the tree "+ans);
		int totalnode = BinaryTreeImplemetiation.totalNode(root);
		System.out.println("Total no of node in the tree "+totalnode);
		int sumofnode = BinaryTreeImplemetiation.sumofNode(root);
		System.out.println("sum of the tree node "+sumofnode);
		int dm = BinaryTreeImplemetiation.diameteroftree(root);
		System.out.println("diameter of the  tree is "+ dm);
		
	}
}
