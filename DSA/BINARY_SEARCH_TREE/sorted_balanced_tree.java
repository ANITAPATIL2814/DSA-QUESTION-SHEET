package DSA.BINARY_SEARCH_TREE;

public class sorted_balanced_tree {
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
    public static Node CreateBST(int arr[],int st,int end){
        if(st> end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=CreateBST(arr, st, mid-1);
        root.right=CreateBST(arr, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        Node root=CreateBST(arr, 0, arr.length-1);
        PreOrder(root);
    }
}
