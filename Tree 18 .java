class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public static Node LCA(Node root, int n1, int n2) {
    if (root == null) {
      return null;
    }
    if (root.data == n1 || root.data == n2) {
      return root;
    }
    Node left = LCA(root.left, n1, n2);
    Node right = LCA(root.right, n1, n2);

    if (left != null && right != null) {
      return root;
    }
    return (left != null) ? left : right;
  }

  public static int finddist(Node root, int k, int dist) {
    if (root == null) {
      return -1;
    }
    if (root.data == k) {
      return dist;
    }
    int left = finddist(root.left, k, dist + 1);
    if (left != -1) {
      return left;
    }
    return finddist(root.right, k, dist + 1);
  }


  public static int distbtwnodes(Node root, int n1, int n2) {
    Node lca = LCA(root, n1, n2);
    if (lca == null) {
      return -1;  
    }

    int d1 = finddist(lca, n1, 0);
    int d2 = finddist(lca, n2, 0);

    return d1 + d2;
  }
}

public class Solution {
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.right.right = new Node(5);
    System.out.println(Node.distbtwnodes(root, 4, 5)); 
  }
}
