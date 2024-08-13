import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {

        Double a=0.1;
        Double b=0.125;
        Double c=b-a;
        System.out.println(c);

        var d=new BigDecimal("0.1");
        var e=new BigDecimal("0.125");
        var f=e.subtract(d);
        System.out.println(f);
    }
}
