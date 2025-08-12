package b16;

import java.util.Scanner;

public class Bt3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int[] a = input(n, scanner);
    for (int i = 0; i < a.length; i++) {
      if (isPrime(a[i])) {
        System.out.println(a[i]);
      }
    }
  }

  public static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static int[] input(int n, Scanner scanner) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("phan tu thu " + (i + 1));
      a[i] = scanner.nextInt();
    }
    return a;
  }
}
