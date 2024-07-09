class Generic<X extends Number>{
  X[] nums;

  public Generic(X[] nums){
    this.nums=nums;
  }
  double calavg(){
    double sum=0d;
    for(X num:nums){
      sum=sum+num.doubleValue();
    }
    return sum / nums.length;
  }
}

public class pack {
  public static void main(String[] args) {
      Integer[] intnum={1,2,3,4,5};
      Generic<Integer> intcalc=new Generic<>(intnum);
      System.out.println(intcalc.calavg());
  }
}
