package DSA.BINARY_TREE;


public class preorder_traversal {
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
    static class BinaryTree{
        static int idx=-1; //becz we want to update our index in every recursion 1,2....
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]); //create left and right subtree inside new node
            newNode.left=buildTree(nodes); //create left subtree & combine 
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static  void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root = tree.buildTree(nodes);
        preorder(root);
    }
}
