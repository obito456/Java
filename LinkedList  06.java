class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
    }
}

public class pack{
    
    private static Node convert(int[] arr){
        Node head=new Node(arr[0]);
        Node move=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            move.next=temp;
            move=temp;
        }
        return head;
    }

    private static Node removetail(Node head){
        Node temp=head;
        if(head==null || head.next==null){
            return null;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;  
    }

    public static void main(String[] args){
        
        int[] arr={4,5,6,7,8};
        Node head=convert(arr);
        Node head2=removetail(head);

        Node temp=head2;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }        

    }
}
