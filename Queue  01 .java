class Queue{
    private int[] arr;
    private int front;
    private int back;
    private static int n =100;

    public Queue(){
        arr=new int[n];
        front=-1;
        back=-1;
    }
    public void push(int x){
        if(back==n-1){
            System.out.println("Queue overflow");
            return;
        }
        back++;
        arr[back]=x;

        if(front==-1){
            front++;
        }
    }
    public void pop(){
        if(front==-1 || front>back){
            System.out.println("No elements in queue");
        }
        front++;
    }
    public int peek(){
        if(front==-1 || front>back){
            System.out.println("No elements in queue");
            return -1;
        }
        return arr[front];
    }
    public boolean empty(){
        if(front==-1 || front>back){
            return true;
        }
        return false;
    }
}

public class Solution {
    public static void main(String[] args) {
       Queue q=new Queue();

       q.push(1);
       q.push(2);
       q.push(3);
       q.push(4);

       System.out.println(q.peek());
       q.pop();
       System.out.println(q.peek());
       q.pop();
       System.out.println(q.peek());
       q.pop();
       System.out.println(q.peek());
       q.pop();
       System.out.println(q.empty());
    }
}
