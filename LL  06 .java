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
    public static Node reverse(Node head){
        Node preptr=null;
        Node currptr=head;
        Node nextptr;
        while(currptr!=null){
            nextptr=currptr.next;
            currptr.next=preptr;
            preptr=currptr;
            currptr=nextptr;
        }
        return preptr;
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
        Node newhead=reverse(head);
        display(newhead);
    }
}
