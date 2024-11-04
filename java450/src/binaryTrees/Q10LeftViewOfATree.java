package binaryTrees;

import java.util.LinkedList;
import java.util.List;

import binaryTrees.Q1LevelOrderTraversal.NodeTree;

public class Q10LeftViewOfATree {
	List<Integer> leftSideView(NodeTree root){
		List<Integer> result = new LinkedList<>();
		leftView(root, result, 0);
		return result;
	}
	void leftView(NodeTree root, List<Integer> result,int  currentDepth) {
		if(root == null) return;
		if(currentDepth==result.size()) {
			result.add(root.val);
		}
		leftView(root.left,result,currentDepth+1);
		leftView(root.right,result,currentDepth+1);
	}
	public static void main(String[] args) {
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);

		root.right = new NodeTree(3);
		root.right.left = new NodeTree(6);
		root.right.right = new NodeTree(7);
		root.right.left.left = new NodeTree(8);
		
		
		Q10LeftViewOfATree list = new Q10LeftViewOfATree();
		List<Integer> ans = list.leftSideView(root);
		for(Integer i : ans) System.out.print(i+" ");
	}
}
