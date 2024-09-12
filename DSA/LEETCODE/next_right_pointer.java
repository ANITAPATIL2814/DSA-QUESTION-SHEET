package DSA.LEETCODE;

// Define the Node class with value, left, right, and next pointers
class Node {
    int val;
    Node left, right, next;
    
    Node(int x) {
        val = x;
    }
}

public class next_right_pointer {
    
    public Node connect(Node root) {
        if (root == null) {
            return null; // Edge case: if root is null, return null
        }

        Node level_start = root;

        // Iterate over levels of the tree
        while (level_start != null) {
            Node curr_temp = level_start;

            // Iterate over nodes at the current level
            while (curr_temp != null) {
                if (curr_temp.left != null) {
                    curr_temp.left.next = curr_temp.right; // Connect left -> right
                }
                
                if (curr_temp.right != null && curr_temp.next != null) {
                    curr_temp.right.next = curr_temp.next.left; // Connect right -> next.left
                }
                
                curr_temp = curr_temp.next; // Move to the next node at the current level
            }

            level_start = level_start.left; // Move to the next level
        }

        return root; // Return the root after connecting nodes
    }

    public static void main(String[] args) {
        // Manually construct the binary tree [1,2,3,4,5,6,7]
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Call the connect method to link next pointers
        next_right_pointer solution = new next_right_pointer();
        solution.connect(root);
        
        // The tree now has connected next pointers
        System.out.println("Next pointers connected.");
    }
}
