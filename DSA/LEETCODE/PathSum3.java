package DSA.LEETCODE;

import javax.swing.tree.*;

// Define the TreeNode class with val, left, and right.
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
    }
}

public class PathSum3 {
    
    int count_of_path = 0;
    
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return 0;
        }
        pathSumHelper(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return count_of_path;
    }

    // Helper function to calculate path sums
    void pathSumHelper(TreeNode root, int targetSum, long currSum) {
        if(root == null) {
            return;
        }
        currSum += root.val;
        if(currSum == targetSum) {
            count_of_path++;
        }
        pathSumHelper(root.left, targetSum, currSum);
        pathSumHelper(root.right, targetSum, currSum);
    }

    public static void main(String[] args) {
        // Create the tree structure
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        // Create an instance of PathSum3 and calculate the path sum
        PathSum3 solution = new PathSum3();
        int targetSum = 22;
        int result = solution.pathSum(root, targetSum);
        System.out.println("Number of paths with sum " + targetSum + ": " + result);
    }
}
