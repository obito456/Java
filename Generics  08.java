class Generic {
  static <T extends Comparable<T>, V extends T> boolean contains(T x, V[] y) {
    boolean contains = false;
    for (V v : y) {
      if (x.equals(v)) {
        contains = true;
        break;
      }
    }
    return contains;
  }
}

public class pack {
  public static void main(String[] args) {
    String[] character={"v","i","j","a","y"};
    System.out.println(Generic.contains("i", character));

    Double[] num={10.0,20.0,30.0,40.0,50.0};
    System.out.println(Generic.contains(50.0, num));
  }
}
