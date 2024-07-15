class Stack {
    private int[] arr;
    private int top;
    private static final int n = 100;

    public Stack() {
        arr = new int[n];
        top = -1;
    }

    public void push(int x) {
        if (top == n - 1) {
            System.out.println("stack overflow");
            return;
        }
        top++;
        arr[top] = x;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("no element to pop");
            return;
        }
        top--;
    }

    public int top() {
        if (top == -1) {
            System.out.println("no element in stack");
            return -1; 
        }
        return arr[top];
    }

    public boolean empty() {
        return top == -1;
    }
}
public class Solution{
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.empty());
    }
}
