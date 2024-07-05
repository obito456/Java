class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}

public class pack {

    public static void main(String[] args){

    int[] arr={1,2,3,4};
    int n=arr.length;

    for(int i=0;i<n;i++){
        Node a=new Node(arr[i]); 
        System.out.print(a.data+"->");
    }

    }
}
