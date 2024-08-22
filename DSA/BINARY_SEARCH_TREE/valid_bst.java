package DSA.BINARY_SEARCH_TREE;

public class valid_bst {
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
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data > val){
            //left subtree
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static boolean isValidBst(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min != null && root.data <=min.data){
            return false;
        }

        else if(max != null&& root.data >= max.data){
            return false;
        }
        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);

    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        if(isValidBst(root, null, null)){
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
    }
}
