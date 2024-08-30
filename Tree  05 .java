class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public static int search(int[] inorder, int start, int end, int curr) {
    for (int i = start; i <= end; i++) {
      if (inorder[i] == curr) {
        return i;
      }
    }
    return -1;
  }
  public static Node build(int[] postorder, int[] inorder, int start, int end, int[] index) {
    if (start > end) {
      return null;
    }
    int curr = postorder[index[0]];
    index[0]--;
    Node node = new Node(curr);
    if (start == end) {
      return node;
    }
    int pos = search(inorder, start, end, curr);
    node.right = build(postorder, inorder, pos + 1, end, index);
    node.left = build(postorder, inorder, start, pos - 1, index);

    return node;
  }
  public static void inorderdisplay(Node root) {
    if (root == null) {
      return;
    }
    inorderdisplay(root.left);
    System.out.print(root.data + " ");
    inorderdisplay(root.right);
  }
}

public class Solution {
  public static void main(String[] args) {
    int[] postorder = { 4, 5, 2, 6, 7, 3,1 };
    int[] inorder = { 4, 2, 5, 1, 6, 3, 7 };
    int[] index = { 6 };
    Node root = Node.build(postorder, inorder, 0, postorder.length - 1, index);
    Node.inorderdisplay(root);
  }
}
