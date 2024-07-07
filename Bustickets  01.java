class Bus{
  String name;
  Bus(String name){
    this.name=name;
  }
}
public class pack {
  public static void main(String[] args) {

    Bus[] tickets=new Bus[3];

    Bus ticket1=new Bus("vijay");
    Bus ticket2=new Bus("ajay");
    Bus ticket3=new Bus("virat");

    tickets[0]=ticket1;
    tickets[1]=ticket2;
    tickets[2]=ticket3;

    System.out.println(tickets[0].name);
  } 
