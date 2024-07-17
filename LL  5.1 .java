public class Solution {
    static class Node{
        int data;
        Node next;
        public Node(int value){
            this.data=value;
            this.next=null;
        }
    }
    public static Node inserthead(Node head,int value){
        Node n=new Node(value);
        if(head==null){
            head=n;
            return head;
        }
        n.next=head;
        head=n;
        return head;
    }
    public static Node insertattail(Node head,int value){
        Node n=new Node(value);
        if(head==null){
            head=n;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        return head;
    } 
    public static Node delpos(Node head,int pos){
        if(head==null){
            return head;
        }
        if(pos==0){
            Node temp=head;
            head=head.next;
            return head;
        }
        int count=1;
        Node temp=head;
        while(temp!=null && count<=pos){
            if(pos==count){
                temp.next=temp.next.next;
            }
            temp=temp.next;
            count++;
        }
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    
    public static void main(String[] args) {

        Node head=null;
        head=insertattail(head, 10);
        head=insertattail(head, 20);
        head=insertattail(head, 30);
        head=insertattail(head, 40);
        display(head);
        System.out.println(" ");
        head=delpos(head,0);
        display(head);
        
       
    }
}
