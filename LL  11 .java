public class Solution{

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int value){
            data=value;
            prev=null;
            next=null;
        }
    }
    public static Node inserthead(int value,Node head){
        Node n=new Node(value);
        if(head!=null){
            head.prev=n;
        }
        n.next=head;
        head=n;
        return head;
    }
    public static Node inserttail(int value ,Node head){
        if(head==null){
           return inserthead(value, head);
        }
        Node n=new Node(value);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        n.prev=temp;
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
        head=inserttail(4, head);
        head=inserttail(5, head);
        head=inserttail(6, head);
        display(head);
        head=inserthead(7, head);
        display(head);
    }
}
