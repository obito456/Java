import java.util.PriorityQueue;
import java.util.Queue;

class Customer implements Comparable<Customer> {
    Integer orderid;
    String item;
    String name;

    public Customer(Integer orderid, String item, String name) {
        this.orderid = orderid;
        this.item = item;
        this.name = name;
    }

    public String order() {
        return "Customer{" + "orderid=" + orderid + ", item='" + item + '\'' + ", customerName='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.orderid.compareTo(o.orderid);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "orderid=" + orderid +
                ", item='" + item + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Solution {
    public static void main(String[] args) {
        Queue<Customer> customers = new PriorityQueue<>();

        customers.add(new Customer(3, "dosa", "vijay"));
        customers.add(new Customer(1, "idly", "sai"));
        customers.add(new Customer(2, "pury", "chandu"));
        customers.add(new Customer(4, "bonda", "satish"));

        System.out.println(customers);
        System.out.println("Processing customer: " + customers.poll());
        System.out.println("Remaining customers in queue: " + customers);

        System.out.println("Processing customer: " + customers.poll());
        System.out.println("Remaining customers in queue: " + customers);
    }
}
