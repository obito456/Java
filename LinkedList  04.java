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
    
    private static int lengthof(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        
        int[] arr={4,5,6,7,8};
        Node head=convert(arr);

        System.out.println(lengthof(head));

    }
}
