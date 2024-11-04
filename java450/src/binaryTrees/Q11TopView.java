package binaryTrees;
import java.util.*;
public class Q11TopView {
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){
			this.val = val;
		}
	}
	static class Pair{
		TreeNode node;
		int hd;
		
		Pair(TreeNode n , int h){
			this.hd = h;
			this.node =n;
		}
		
	}
	Map<Integer,Integer> topView(TreeNode root) {
		Map<Integer,Integer> map = new TreeMap<>();
		if(root == null) return map;
		
		Queue<Pair> q = new LinkedList<>();
		
		q.add(new Pair(root,0));
		
		while(!q.isEmpty()) {
			Pair temp = q.poll();
			int hd = temp.hd; //horizental distance
			TreeNode node = temp.node;
			
			if(!map.containsKey(hd)) {
				map.put(hd, node.val);
			}
			
			if(node.left != null) {
				q.add(new Pair(node.left, hd-1));
			}
			
			if(node.right != null) {
				q.add(new Pair(node.right, hd+1));
			}
		}
		return map;
	}

	    public static void main(String[] args) {
	        // Creating a sample binary tree
	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(10);
	        root.left.left.right = new TreeNode(5);
	        root.left.left.right.right = new TreeNode(6);
	        root.right = new TreeNode(3);
	        root.right.right = new TreeNode(11);
	        root.right.left = new TreeNode(9);

	        Q11TopView solution = new Q11TopView();

	        // Get the top view traversal
	        Map<Integer,Integer> topView1 = solution.topView(root);

	        // Print the result
	        System.out.println("Vertical Traversal: ");
	        for (Map.Entry<Integer, Integer> entry : topView1.entrySet()) {
	            System.out.print(entry.getValue() + " ");
	        }
	    }
}
