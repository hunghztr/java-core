package b10;

import java.util.Scanner;

public class Bt5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n ");
    int n = scanner.nextInt();
    // int count = 0;
    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // count++;
    // }
    // }
    // if (count == 2) {
    // System.out.println("la so nguyen to");
    // } else {
    // System.out.println("khong phai so nguyen to");
    // }
    if (n < 2) {
      System.out.println("khong phai so nguyen to");
    }
    boolean isMark = true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        isMark = false;
        break;
      }
    }
    if (isMark) {
      System.out.println("la so nguyen to");
    } else {
      System.out.println("khong phai so nguyen to");
    }
  }

}
