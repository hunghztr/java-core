package b16;

import java.util.Scanner;

public class Bt2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int[] arr = input(n, scanner);
    boolean isTrue = check(arr);
    if (isTrue) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  private static boolean check(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
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
