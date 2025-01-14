package binaryTrees;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import binaryTrees.Q11TopView.TreeNode;

public class Q20ConstructBinarytreefromInorderandPreorder {
	TreeNode buildTree (Vector<Integer> inorder ,Vector<Integer> preorder) {
		Map<Integer,Integer>inMap = new HashMap<>();
		for(int i =0; i<inorder.size();i++) {
			inMap.put(inorder.get(i), i);
		}
		TreeNode root = buildTree(preorder, 0, preorder.size()-1,inorder, 0, inorder.size()-1,inMap);
		return root;
	}
	TreeNode buildTree(Vector<Integer> preorder ,int preStart,int preEnd,Vector<Integer> inorder,int inStart,int inEnd,Map<Integer,Integer>inMap) {
		if(preStart>preEnd || inStart>inEnd) return null;
		
		TreeNode root = new TreeNode(preorder.get(preStart));
		int rootIndex = inMap.get(root.val);
		int countrootLeftIndex = rootIndex-inStart;
		
		root.left = buildTree(preorder,preStart+1,preStart+countrootLeftIndex, inorder, inStart,rootIndex-1, inMap);
		
		root.right =buildTree(preorder,preStart+countrootLeftIndex+1,preEnd, inorder, rootIndex+1,inEnd, inMap);
		return root;
	}
	void printInorder(TreeNode node) {
		if(node==null) return;
		printInorder(node.left);
		System.out.print(node.val+" ");
		printInorder(node.right);
	}
	void printVector(Vector<Integer> vec) {
		for (int i : vec) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Vector<Integer> inorder = new Vector<>(Arrays.asList(9, 3, 15, 20, 7));
		Vector<Integer> preorder = new Vector<>(Arrays.asList(3, 9, 20, 15, 7));
		
		Q20ConstructBinarytreefromInorderandPreorder list = new Q20ConstructBinarytreefromInorderandPreorder();
		System.out.println("InOrder");
		list.printVector(inorder);
		
		System.out.println("PreOrder");
		list.printVector(preorder);
		
		 System.out.println("Inorder of Unique Binary Tree Created:");
		TreeNode ans = list.buildTree(inorder, preorder);
		list.printInorder(ans);

	}

}
