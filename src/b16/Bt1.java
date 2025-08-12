package b16;

import java.util.Scanner;

public class Bt1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int[] arr = input(n, scanner);
    int sum = tong(arr);
    System.out.println(sum);
  }

  private static int tong(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
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
