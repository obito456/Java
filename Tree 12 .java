class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public static int caldiameter(Node root,int[] height){
    if(root==null){
      height[0]=0;
      return 0;
    }
    int[] leftheight=new int[1];
    int[] rightheight=new int[1];

    int leftdia=caldiameter(root.left,leftheight);
    int rightdia=caldiameter(root.right,rightheight);
    int currdia=leftheight[0]+rightheight[0]+1;
    height[0] = Math.max(leftheight[0], rightheight[0]) + 1;

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

    int[] height = new int[1];
    System.out.println(Node.caldiameter(root,height));
  }
}
