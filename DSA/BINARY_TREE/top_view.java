package DSA.BINARY_TREE;

import java.util.*;

public class top_view {
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
    static class Info{
        Node node;
        int Hd;
        public Info(Node node,int Hd){
            this.node=node;
            this.Hd=Hd;
        }
    }
    public static void TopView(Node root){
        //level order
        Queue<Info>q= new LinkedList<>();
        HashMap<Integer,Node>map=new HashMap<>();//integer - hd(key),node-value
        int min=0;
        int max=0;
        q.add(new Info(root, 0));//by default hd is always 0
        q.add(null);//track where the level is end
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.Hd))//check key exist in map 
            {//first time my hd is occuring
                map.put(curr.Hd, curr.node);
            }
            if(curr.node.left !=null){
                q.add(new Info(curr.node.left, curr.Hd-1));
                min=Math.min(min, curr.Hd-1);
            }
            if(curr.node.right !=null){
                q.add(new Info(curr.node.right, curr.Hd+1));
                max=Math.max(max, curr.Hd+1);
            }
            }
            
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" "); //i =key here
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        TopView(root);
    }
}
