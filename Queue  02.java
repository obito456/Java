import java.util.ArrayDeque;
import java.util.Queue;

public class pack {
    
    public static void main(String[] args){

        Queue<Integer> a=new ArrayDeque<>();
        System.out.println(a.isEmpty());
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        Queue<Integer> helper=new ArrayDeque<>();
        while(a.size()>0){
            System.out.print(a.peek()+" ");
            helper.add(a.poll());
        }
        while(helper.size()>0){
            a.add(helper.poll());
        }
    }
}
