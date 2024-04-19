public class sec {

    String name;
    static int passengers;
    sec(String name){
        this.name=name;
        passengers++;
    }
    static void display(){
        System.out.println("you have "+passengers+" passengers in your bus");
    }   
}

public class hello{
    public static void main(String[] args){
      sec pass1=new sec("dhoni");
      sec pass2=new sec("virat");
      sec pass3=new sec("yuvaraj");
      
      sec.display();
    }
}
