package b16;

import java.util.Scanner;

public class Bt6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int[] a = input(n, scanner);
    if (isSymetric(a)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  // 3 4 5 6 3
  public static boolean isSymetric(int[] a) {
    for (int i = 0; i < a.length / 2; i++) {
      if (a[i] != a[a.length - 1 - i]) {
        return false;
      }
    }
    return true;
  }

  private static int[] input(int n, Scanner scanner) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("nhap phan tu thu " + (i + 1));
      a[i] = scanner.nextInt();
    }
    return a;
  }
}
