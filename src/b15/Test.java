package b15;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // System.out.println("nhap n");
    // int n = scanner.nextInt();
    // // int giaiThua = tinhGiaiThua(n);
    // // System.out.println("giai thua cua " + n + "! = " + giaiThua);
    // int fibo = getFibinaci(n);
    // System.out.println("so trong day fibonaci la " + fibo);
    sayHello();
  }

  public static void sayHello() {
    System.out.println("hello java");
    sayHello();
  }

  public static int tinhGiaiThua(int n) {
    if (n == 1)
      return 1;
    return n * tinhGiaiThua(n - 1);
  }

  public static int getFibinaci(int n) {
    if (n <= 1)
      return n;
    return getFibinaci(n - 1) + getFibinaci(n - 2);
  }
}
