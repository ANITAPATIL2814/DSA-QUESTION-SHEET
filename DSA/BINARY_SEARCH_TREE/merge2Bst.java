package DSA.BINARY_SEARCH_TREE;

import java.util.ArrayList;

public class merge2Bst {
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
    
     public static void getInorder(Node root,ArrayList<Integer>arr){
        if(root==null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    public static Node CreateBST(ArrayList<Integer>arr,int st,int end){
        if(st> end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=CreateBST(arr, st, mid-1);
        root.right=CreateBST(arr, mid+1, end);
        return root;
    }
    public static void PreOrder(Node root){
        if(root == null){
            return ;
        }
        
        System.out.println(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static Node mergeBst(Node root,Node root2){
        //step1
        ArrayList<Integer>arr1=new ArrayList<>();
        getInorder(root,arr1);

        //step 2
        ArrayList<Integer>arr2=new ArrayList<>();
        getInorder(root2,arr2);

        //to merge
        int i=0,j=0;
        ArrayList<Integer>finalarr=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }
            else{
                finalarr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalarr.add(arr1.get(i));
                i++;
        }
        while(j<arr2.size()){
            finalarr.add(arr2.get(j));
                j++;
        }
        //sorted array- balanced bst create
       return  CreateBST(finalarr, 0, finalarr.size()-1);
    }
    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(1);
        root.right=new Node(4);
        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        Node rot=mergeBst(root, root2);
        PreOrder(rot);

    }
}
