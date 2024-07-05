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

    private static Node removek(Node head,int k){
        if(head==null){
            return head;
        } 
        if(k==1){
            Node temp=head;
            return head;
        }
        int count=0;
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            count++;
            if(count==k){
            prev.next=prev.next.next;
            break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args){
        
        int[] arr={4,5,6,7,8};
        Node head=convert(arr);
        Node head2=removek(head,3);

        Node temp=head2;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }        

    }
}
