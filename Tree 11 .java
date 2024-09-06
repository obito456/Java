class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public static int calheight(Node root){
    if(root==null){
      return 0;
    }
    int left=calheight(root.left);
    int right=calheight(root.right);
    return Math.max(left, right)+1;
  }

  public static int caldiameter(Node root){
    if(root==null){
      return 0;
    }
    int leftheight=calheight(root.left);
    int rightheight=calheight(root.right);
    int currdia=leftheight+rightheight+1;

    int leftdia=caldiameter(root.left);
    int rightdia=caldiameter(root.right);

    return Math.max(currdia,Math.max(leftdia,rightdia));
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
 
    System.out.println(Node.caldiameter(root));
  }
}
