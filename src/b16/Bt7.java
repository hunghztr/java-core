package b16;

import java.util.Scanner;

public class Bt7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int[] a = input(n, scanner);
    int secondMax = findSecondMax(a);
    if (secondMax == -1) {
      System.out.println("mang khong co gia tri lon thu 2");
    } else {
      System.out.println("gia tri lon thu 2 la " + secondMax);
    }
  }

  private static int findSecondMax(int[] a) {
    int max = Integer.MIN_VALUE; // -2 tỉ
    int secondMax = Integer.MIN_VALUE; // -2 tỉ
    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        secondMax = max;
        max = a[i];
      } else if (a[i] > secondMax && a[i] < max) {
        secondMax = a[i];
      }
    }
    if (secondMax == Integer.MIN_VALUE) {
      return -1;
    }
    return secondMax;
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
