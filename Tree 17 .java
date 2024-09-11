import java.util.LinkedList;
import java.util.Queue;

class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public static void leftview(Node root) {
    if (root == null) {
      return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
      int n = q.size();
      for (int i = 0; i < n; i++) {
        Node curr = q.poll();

        if (i == n - 1) {
          System.out.println(curr.data);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
        if (curr.left != null) {
          q.add(curr.left);
        }
      }
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

    Node.leftview(root);
  }
}
