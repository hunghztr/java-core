package b16;

import java.util.Scanner;

public class Bt5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int[] a = input(n, scanner);
    int max = findMax(a);
    System.out.println("gia tri lon nhat la " + max);
  }

  private static int findMax(int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (max < a[i]) {
        max = a[i];
      }
    }
    return max;
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
