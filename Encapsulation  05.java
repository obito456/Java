class Police{
  private String name;
  private String crime;

  Police(String name,String crime){
    this.setname(name);
    this.setcrime(crime);
  }
  Police(Police x){
    this.copy(x);
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
  public void copy(Police a){
    this.setname(a.getname());
    this.setcrime(a.getcrime());

  }
}

public class pack {
  public static void main(String[] args) {
      Police accused1=new Police("Darshan","Murder");
      Police accused2=new Police(accused1);

      System.out.println(accused1.getcrime());
      System.out.println(accused2.getcrime());
  } 
}
