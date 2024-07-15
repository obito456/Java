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
    public static Node makecycle(Node head, int pos){
        Node temp=head;
        Node startNode=null;
        int count=1;
        while(temp.next!=null){
            if(count==pos){
                startNode=temp;
            }
            temp=temp.next;
            count++;
        }
        temp.next=startNode;
        return head;
    }
    public static boolean detectcycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static Node removecycle(Node head){
        Node slow=head;
        Node fast=head;
        do{
            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast);

        fast=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=null;
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
        Node newhead=makecycle(head,3);
        // display(newhead);
        System.out.println(detectcycle(head));
        Node headsec=removecycle(head);
        display(headsec);

    }
}
