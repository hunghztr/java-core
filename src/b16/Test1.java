package b16;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int[] a = input(n, scanner);
    int sum = 0;
    // for (int i = 0; i < n; i++) {
    // sum += a[i];
    // }
    // System.out.println(sum);
    // for (int i = 0; i < n; i++) {
    // a[i] = a[i] + 1;
    // }
    // output(a);
    // int count = 0;
    // for (int i = 0; i < n; i++) {
    // if (a[i] % 2 == 0) {
    // count++;
    // }
    // }
    // System.out.println(count);
    // int index = -1;
    // System.out.println("nhap bien can tim");
    // int x = scanner.nextInt();
    // for (int i = 0; i < a.length; i++) {
    // if (x == a[i]) {
    // index = i;
    // }
    // }
    // if (index == -1) {
    // System.out.println(x + " khong co trong mang");
    // } else {
    // System.out.println(x + " o vi tri thu " + index);
    // }
    // System.out.println(a[10]);
    for (int i = a.length - 1; i >= 0; i--) {
      System.out.println(a[i]);
    }
  }

  private static void output(int[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

  private static int[] input(int n, Scanner scanner) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("nhap vao phan tu thu " + (i + 1));
      a[i] = scanner.nextInt();
    }
    return a;
  }
}
