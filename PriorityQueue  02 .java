import java.util.PriorityQueue;
import java.util.Queue;

class Customer implements Comparable<Customer>{
    private Integer orderid;
    private int amount;
    private String customerName;

    public Customer(Integer orderid,int amount,String customerName){
        this.orderid=orderid;
        this.amount=amount;
        this.customerName=customerName;
    }

    public void setorderid(int orderid){
        this.orderid=orderid;
    }
    public int getorderid(){
        return orderid;
    }
    public void setamount(int amount){
        this.amount=amount;
    }
    public int getamount(){
        return amount;
    }
    public void customerName(String customerName){
        this.customerName=customerName;
    }
    public String getcustomerName(){
        return customerName;
    }

    @Override
    public String toString(){
        return "Customer{" +"orderid="+orderid+",amount="+amount+",customerName='"+customerName+'\''+'}';
    }

    @Override
    public int compareTo(Customer o){
        return o.orderid>this.orderid ? 1 : -1;
    }
}


public class Solution {
    public static void main(String[] args) {
        Queue<Customer> customers=new PriorityQueue<>();

        customers.add(new Customer(6, 50, "VIJAY"));
        customers.add(new Customer(1, 510, "JAY"));
        customers.add(new Customer(6, 110, "AJAY"));
        customers.add(new Customer(6, 350, "JAYANTH"));

        System.out.println(customers);
        System.out.println(customers.poll());
        System.out.println(customers);
    }
}
