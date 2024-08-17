package DSA.BINARY_TREE;

public class diameter_tree {
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    //approach 1: TC: O(n^2)
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDiameter=diameter(root.left);
        int leftHt=height(root.left);
        int rightDiameter=diameter(root.right);
        int rightHt=height(root.right);
        int selfDiameter=leftHt+rightHt+1;
        return Math.max(selfDiameter,Math.max(leftDiameter,rightDiameter));
    }
    //approach 2 TC:O(n)
    static class Info{
        int diameter;
        int height;
        public Info(int diameter,int height){
            this.diameter=diameter;
            this.height=height;
        }
    }
    public static Info diameter2(Node root){ //we return here classs object whoch is Info
        if(root==null){
            return new Info(0, 0);
        }
        Info leftinfo=diameter2(root.left); //left all info
        Info rightinfo=diameter2(root.right);//right all info
        int diameter=Math.max(Math.max(leftinfo.diameter, rightinfo.diameter),leftinfo.height+rightinfo.height+1);
        int height=Math.max(leftinfo.height,rightinfo.height)+1;
        return new Info(diameter, height);
    }   
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diameter);
    }
}
