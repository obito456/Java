class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public static void printsubnodes(Node root ,int k){
    if(root==null || k<0){
      return;
    }
    if(k==0){
      System.out.println(root.data+" ");
      return;
    }
    printsubnodes(root.left, k-1);
    printsubnodes(root.right, k-1);
  }

  public static int printnodesatk(Node root,Node target,int k){
    if(root==null){
      return -1;
    }
    if(root==target){
      printsubnodes(root, k);
      return 0;
    }
    int dl=printnodesatk(root.left, target, k);
    if(dl!=-1){
      if(dl+1 ==k){
        System.out.println(root.data+" ");
      }
      else{
        printsubnodes(root.right, k-dl-2);
      }
      return 1+dl;
    }
    int dr=printnodesatk(root.right, target, k);
    if(dr!=-1){
      if(dl+1==k){
        System.out.println(root.data+" ");
      }
      else{
        printsubnodes(root.left, k-dr-2);
      }
      return 1+dr;
    }
    return -1;
  }
}

public class Solution {
  public static void main(String[] args) {
    /*
     *              1
     *             /  \
     *            2    3
     *           /
     *          4
     */

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    Node.printnodesatk(root, root.left,1);
  }
}
