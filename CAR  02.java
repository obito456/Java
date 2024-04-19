public class third {

    String cname;
    third(String cname){
        this.cname=cname;
    }
}
public class sec {

    void park(third name){
        System.out.println("car is "+name.cname);
    }
    
}

public class hello{
    public static void main(String[] args){
      sec objb=new sec();
      third objc=new third("audi");
      objb.park(objc);
    }
}
