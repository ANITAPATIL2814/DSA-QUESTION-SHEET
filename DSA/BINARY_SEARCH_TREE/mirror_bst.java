package DSA.BINARY_SEARCH_TREE;

public class mirror_bst {
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
    public static void PreOrder(Node root){
        if(root == null){
            return ;
        }
        
        System.out.println(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static Node Createmirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror=Createmirror(root.left);
        Node rightMirror=Createmirror(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);
       root= Createmirror(root);
        PreOrder(root);
    }
}
