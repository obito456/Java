public class bike {

    String name="zx01r";
    String company="ninja";
    String color="green";
    int price=4000000;

    public String str(){
        return name+"\n"+company+"\n"+color+"\n"+price;
    }
    
}

public class hello{
  public static void main(String[] args){
    
    bike obj=new bike();
    System.out.println(obj.str());

  }
}
