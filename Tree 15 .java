class Height {
  int height = 0;
}

class Node {
  int data;
  Node left, right;

  public Node(int data) {
      this.data = data;
      left = null;
      right = null;
  }

  public static int height(Node root) {
      if (root == null) {
          return 0;
      }
      int lh = height(root.left);
      int rh = height(root.right);
      return Math.max(lh, rh) + 1;
  }

  public static boolean isBalanced(Node root, Height height) {
      if (root == null) {
          height.height = 0;
          return true;
      }

      Height leftHeight = new Height(), rightHeight = new Height();

      boolean isLeftBalanced = isBalanced(root.left, leftHeight);
      boolean isRightBalanced = isBalanced(root.right, rightHeight);

      height.height = Math.max(leftHeight.height, rightHeight.height) + 1;

      if (Math.abs(leftHeight.height - rightHeight.height) > 1) {
          return false;
      }

      return isLeftBalanced && isRightBalanced;
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

      Height height = new Height();
      if (Node.isBalanced(root, height)) {
          System.out.println("Balanced tree");
      } else {
          System.out.println("Not balanced");
      }
  }
}
