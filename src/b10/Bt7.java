package b10;

import java.util.Scanner;

public class Bt7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n ");
    int n = scanner.nextInt();
    int f0 = 0, f1 = 1, fn = 0;
    if (n == 0) {
      System.out.println(0);
    } else if (n == 1) {
      System.out.println(1);
    } else {
      for (int i = 2; i <= n; i++) {
        fn = f0 + f1;
        f0 = f1;
        f1 = fn;
      }
      System.out.println(fn);
    }
  }
}
