class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public static void flatten(Node root){
    if(root==null || root.left==null && root.right==null){
      return;
    }

    if(root.left!=null){
      flatten(root.left);

      Node temp=root.right;
      root.right=root.left;
      root.left=null;

      Node t=root.right;
      while(t.right!=null){
        t=t.right;
      }
      t.right=temp;
    }
    flatten(root.right);
  }
  public static void inorderprint(Node root){
    if(root==null){
      return;
    }
    inorderprint(root.left);
    System.out.println(root.data+ " ");
    inorderprint(root.right);
  }
}

public class Solution {
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    
    Node.flatten(root);
    Node.inorderprint(root);
    System.err.println();
  }
}
