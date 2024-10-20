class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class Solution{
    Node head;

    public void insertAtHead(int val){
        Node n=new Node(val);

        if(head==null){
            head=n;
            return;
        }
        n.next=head;
        head=n;  
    }

    public boolean search(int key){
        Node temp=head;

        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head=null;
        Solution linkedList = new Solution();
        linkedList.insertAtHead(4);
        linkedList.insertAtHead(3);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(1);
        linkedList.insertAtHead(0);
        linkedList.display();
        System.out.println(linkedList.search(4)); 
    }
}
