public class Solution{

    static class Node{
        int data;
        Node next;

        Node(int value){
            data=value;
            next=null;
        }
    }
    public static Node inserthead(int value,Node head){
        Node n=new Node(value);
        if(head==null){
            head=n;
            return head;
        }
        n.next=head;
        head=n;
        return head;
    }
    public static Node inserttail(int value ,Node head){
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
    public static Node delhead(Node head){
        Node x=head;
        head=head.next;
        return head; 
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        Node head=null;
        head=inserttail(1, head);
        head=inserttail(2, head);
        head=inserttail(3, head);
        head=inserthead(0, head);
        display(head);
        head=delhead(head);
        display(head);
    }
}
