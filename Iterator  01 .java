import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args){
       ArrayList<String> bikes=new ArrayList<String>();
       bikes.add("zx10r");
       bikes.add("pulsar");
       bikes.add("duke");
       bikes.add("bmw");
       Iterator<String>it=bikes.iterator();
       System.out.println(it.next());

       while(it.hasNext()){
         System.out.println(it.next());
       }
    }
}
 
