package DSA.BINARY_TREE;

public class trasnform {
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
    public static int Transfrom(Node root){
        if(root==null){
            return 0;
        }
        int leftchild=Transfrom(root.left);
        int rightchild=Transfrom(root.right);
        int data=root.data;
        int newLeft=root.left==null?0:root.left.data;
        int newRight=root.right==null?0:root.right.data;

        root.data= newLeft+ leftchild + newRight + rightchild;
        return data;
    }
    public static void PreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);   
        Transfrom(root);
        PreOrder(root);
    }
}
