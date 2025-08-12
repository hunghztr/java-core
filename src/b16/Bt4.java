package b16;

import java.util.Scanner;

public class Bt4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int[] a = input(n, scanner);
    if (asc(a)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  public static boolean asc(int[] a) {
    for (int i = 1; i < a.length; i++) {
      if (a[i] < a[i - 1]) {
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
