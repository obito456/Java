public class sec {

    String name;
    static int passengers;
    sec(String name){
        this.name=name;
        passengers++;
    }
    
}

public class hello{
    public static void main(String[] args){
      sec pass1=new sec("dhoni");
      sec pass2=new sec("virat");
      sec pass3=new sec("yuvaraj");
      
      System.out.println(sec.passengers);
    }
}
