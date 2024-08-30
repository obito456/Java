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
  public static Node build(int[] preorder, int[] inorder, int start, int end, int[] index) {
    if (start > end) {
      return null;
    }
    int curr = preorder[index[0]];
    index[0]++;
    Node node = new Node(curr);
    if (start == end) {
      return node;
    }
    int pos = search(inorder, start, end, curr);
    node.left = build(preorder, inorder, start, pos - 1, index);
    node.right = build(preorder, inorder, pos + 1, end, index);

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
    int[] preorder = { 1, 2, 4, 5, 3, 6, 7 };
    int[] inorder = { 4, 2, 5, 1, 6, 3, 7 };
    int[] index = { 0 };
    Node root = Node.build(preorder, inorder, 0, preorder.length - 1, index);
    Node.inorderdisplay(root);
  }
}
