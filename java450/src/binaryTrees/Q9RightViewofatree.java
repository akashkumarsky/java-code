package binaryTrees;

import java.util.LinkedList;
import java.util.List;

import binaryTrees.Q1LevelOrderTraversal.NodeTree;

public class Q9RightViewofatree {
	List<Integer> rightSideView(NodeTree root){
		List<Integer> result = new LinkedList<>();
		rightView(root,result,0);
		return result;
	}
	void rightView(NodeTree root,List<Integer> result,int currDepth) {
		if(root == null) {
			return;
		}
		if(currDepth==result.size()) {
			result.add(root.val);
		}
		rightView(root.right,result,currDepth+1);
		rightView(root.left,result,currDepth+1);
	}
	public static void main(String[] args) {
		NodeTree root = new NodeTree(1);
		root.left = new NodeTree(2);
		root.left.left = new NodeTree(4);
		root.left.right = new NodeTree(5);

		root.right = new NodeTree(3);
		root.right.left = new NodeTree(6);
		root.right.right = new NodeTree(7);
		
		Q9RightViewofatree list = new Q9RightViewofatree();
		List<Integer> ans = list.rightSideView(root);
		for(Integer i : ans)System.out.print(i+" ");
	}

}
