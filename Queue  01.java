import java.util.LinkedList;
import java.util.Queue;

public class pack {
    
    public static void main(String[] args){

        Queue<Integer> a=new LinkedList<>();
        System.out.println(a.isEmpty());
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        System.out.println(a.size());
        System.out.println(a);
        a.remove();
        System.out.println(a);
        a.poll();
        System.out.println(a);
        System.out.println(a.element());
        System.out.println(a.peek());
    }
}
