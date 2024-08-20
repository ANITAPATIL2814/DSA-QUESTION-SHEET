package DSA.BINARY_TREE;

public class invert {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // DFS method to invert the binary tree
    public void dfs(TreeNode root) {
        if (root == null) return;

        // Swap left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively call dfs on left and right children
        dfs(root.left);
        dfs(root.right);
    }

    // Method to invert the binary tree
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }

    // Utility method to print the tree in preorder (root, left, right)
    public void printTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        invert treeInverter = new invert();
        
        System.out.println("Original tree (preorder):");
        treeInverter.printTree(root);
        System.out.println();

        // Invert the tree
        treeInverter.invertTree(root);

        System.out.println("Inverted tree (preorder):");
        treeInverter.printTree(root);
    }
}
