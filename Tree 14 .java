class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public static int height(Node root) {
    if(root==null){
      return 0;
    }
    int lh=height(root.left);
    int rh=height(root.right);
    return Math.max(lh,rh)+1;
  }

  public static boolean isbalanced(Node root){
    if(root==null){
      return true;
    }

    if(isbalanced(root.left)==false){
      return false;
    }
    if(isbalanced(root.right)==false){
      return false;
    }

    int lh=height(root.left);
    int rh=height(root.right);
    if(Math.abs(lh-rh)<=1){
      return true;
    }
    else{
      return false;
    }
  }

  public static void sumreplace(Node root){
    if(root==null){
      return;
    }
    sumreplace(root.left);
    sumreplace(root.right);

    if(root.left!=null){
      root.data=root.data+root.left.data;
    }
    if(root.right!=null){
      root.data=root.data+root.right.data;
    }
  }
}

public class Solution {
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    if(Node.isbalanced(root)){
      System.out.print("balanced tree");
    }
    else{
      System.out.println("not balanced");
    }
  }
}
