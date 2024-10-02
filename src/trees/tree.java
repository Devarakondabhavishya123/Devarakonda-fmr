package trees;
class Node{
    int data;
    Node left, right;
    Node(int d){
        data = d;
        left = right = null;
    }
}

public class tree {
   static   void preorder(Node node) {
         if (node == null)
             return;

             System.out.print(node.data + " ");
             preorder(node.left);
             preorder(node.right);
         //}
     }
         public static void main(String[] args){
            Node root = new Node(1);
            root.left = new Node(2);
            root.left = new Node(5);
            root.left.left = new Node(6);
            root.left.right = new Node(3);
            root.right = new Node(4);
           // root.right.left = new Node(7);
            preorder(root);

    }
}
