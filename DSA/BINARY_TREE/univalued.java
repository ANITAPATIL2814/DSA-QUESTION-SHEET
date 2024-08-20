package DSA.BINARY_TREE;


public class univalued {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }
    public boolean isUnivalTree(TreeNode root) {
        if(root ==null) return true;
        if(root.left!= null && root.val !=root.left.val) return false;
        if(root.right!= null && root.val !=root.right.val) return false;
        boolean leftcall=isUnivalTree(root.left);
        boolean rightcall=isUnivalTree(root.right);
        return leftcall && rightcall ;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(1);
        root.right=new Node(1);
        root.left.left=new Node(1);
        root.left.right=new Node(1);
        root.right.left=new Node(1);
        root.right.right=new Node(1);
    
    }
}
