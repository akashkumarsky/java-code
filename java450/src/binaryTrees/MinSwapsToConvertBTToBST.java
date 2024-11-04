package binaryTrees;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinSwapsToConvertBTToBST {
	 static class TreeNode {
	        int val;
	        TreeNode left, right;

	        TreeNode(int val) {
	            this.val = val;
	            this.left = this.right = null;
	        }
	    }

	    // In-order traversal of the binary tree
	    static void inorder(TreeNode root, List<Integer> inOrderList) {
	        if (root == null) return;
	        inorder(root.left, inOrderList); // Visit left subtree
	        inOrderList.add(root.val);       // Visit node
	        inorder(root.right, inOrderList); // Visit right subtree
	    }

	    // Function to find the minimum number of swaps required to sort the array
	    public static int minSwaps(List<Integer> inOrderList) {
	        int n = inOrderList.size();
	        Integer[] sortedIndices = new Integer[n];
	        for (int i = 0; i < n; i++) {
	            sortedIndices[i] = i;
	        }

	        // Sort the indices based on the values in inOrderList
	        Arrays.sort(sortedIndices, Comparator.comparingInt(inOrderList::get));

	        boolean[] visited = new boolean[n];
	        Arrays.fill(visited, false);
	        int swaps = 0;

	        // Traverse array elements to find cycles
	        for (int i = 0; i < n; i++) {
	            if (visited[i] || sortedIndices[i] == i) continue;

	            int cycleSize = 0;
	            int j = i;
	            while (!visited[j]) {
	                visited[j] = true;
	                j = sortedIndices[j];
	                cycleSize++;
	            }
	            swaps += (cycleSize - 1);
	        }

	        return swaps;
	    }

	    // Driver code
	    public static void main(String[] args) {
	        // Construct a sample binary tree
	        TreeNode root = new TreeNode(5);
	        root.left = new TreeNode(6);
	        root.right = new TreeNode(7);
	        root.left.left = new TreeNode(8);
	        root.left.right = new TreeNode(9);
	        root.right.left = new TreeNode(10);
	        root.right.right = new TreeNode(11);

	        // List to store in-order traversal
	        List<Integer> inOrderList = new ArrayList<>();

	        // Perform in-order traversal
	        inorder(root, inOrderList);

	        // Find and print the minimum number of swaps required
	        System.out.println("Minimum swaps required to convert the binary tree to a BST: " + minSwaps(inOrderList));
	    }
}
