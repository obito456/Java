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

    public void xdel(int val){
        if(head!=null && head.data==val){
            Node todel=head;
            head=head.next;
            return;
        }
        
        Node temp=head;
        while(temp.next!=null && temp.next.data!=val){
            temp=temp.next;
        }

        if(temp.next==null){
            return;
        }

        Node todel= temp.next;
        temp.next=temp.next.next;
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
        Solution linkedList = new Solution();
        linkedList.insertAtHead(4);
        linkedList.insertAtHead(3);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(1);
        linkedList.insertAtHead(0);
        linkedList.display();
        linkedList.xdel(3);
        linkedList.display(); 
    }
}
