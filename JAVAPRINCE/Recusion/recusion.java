package Recusion;


class recusio {
  static int  fun1(int n) {
    if (n == 0) {
      return 0;
    }
    System.out.println(n);
    return fun1(n-1);
  }

  public static void main(String[] args) {
    int n = 4;
    int p=fun1(n);
    System.out.println(p);
  }
}
