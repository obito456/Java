public class Solution {
    public static void main(String[] args){

        StringBuffer buff=new StringBuffer("hello");
        buff.append(" vijay");
        System.out.println(buff.toString());

        StringBuilder buld=new StringBuilder("welcome         ");
        buld.insert(8,"to netflix");
        System.out.println(buld.toString());
        buld.reverse();
        System.out.println(buld.toString());
        buld.delete(2, 5);
        System.out.println(buld.toString());
        
    }
}
