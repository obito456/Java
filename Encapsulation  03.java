class Police{
  private String name;
  private String crime;

  Police(String name,String crime){
    this.setname(name);
    this.setcrime(crime);
  }
  public void setname(String name){
    this.name=name;
  }
  public String getname(){
    return name;
  }
  public void setcrime(String crime){
    this.crime=crime;
  }
  public String getcrime(){
    return crime;
  }
}

public class pack {
  public static void main(String[] args) {
      Police accused1=new Police("Darshan","Murder");
      System.out.println(accused1.getcrime());
  } 
}
