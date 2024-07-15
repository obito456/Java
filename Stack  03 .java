import java.util.Stack;

public class Solution {

    public static void insertatbottom(Stack<Integer> st, int ele){
        if(st.empty()){
            st.push(ele);
            return;
        }

        int topele=st.peek();
        st.pop();
        insertatbottom(st,ele);
        st.push(topele);
    }
    public static void reverses(Stack<Integer> st) {
        if(st.empty()){
            return;
        }

        int ele=st.peek();
        st.pop();
        reverses(st);
        insertatbottom(st,ele);
    } 
    public static void main(String[] args) {
       Stack<Integer> st=new Stack<>();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);

       reverses(st);
       while(!st.empty()){
            System.out.println(st.peek()+" ");
            st.pop();
       }
       System.out.println();
    }
}
