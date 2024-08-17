package DSA.BINARY_TREE;

public class min_dis {
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
    public static Node LCA2(Node root,int n1,int n2){
        if(root==null||root.data==n1||root.data==n2){
            return root;
        }
        Node leftLCA= LCA2(root.left, n1, n2);
        Node rightLCA=LCA2(root.right, n1, n2);
        //leftLCA=val  rightLCA=null
        if(rightLCA== null){
            return leftLCA;
        }
        if(leftLCA== null){
            return rightLCA;
        }
        return root;
    }
    public static int LCADist(Node root, int n) {
        if(root==null){ //not exit
            return -1;
        }
        if(root.data==n){ //overlap
            return 0;
        }
        int leftDist=LCADist(root.left, n); //exit in left subtree
        int rightDist=LCADist(root.right, n);
        if(leftDist ==-1 && rightDist==-1){ //not exit
            return -1;
        }
        else if(leftDist== -1){
            return rightDist+1;
        }
        else {
            return leftDist+1;
        }
    }
    public static int minDist(Node root,int n1,int n2){
        Node lca=LCA2(root, n1, n2);
        int dist1=LCADist(lca,n1);
        int dist2=LCADist(lca,n2);
        return dist1+dist2;
    }
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int n1=4,n2=6;
        System.out.println(minDist(root, n1, n2));
    }
}
