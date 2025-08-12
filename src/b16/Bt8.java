package b16;

import java.util.Scanner;

public class Bt8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int[] a = input(n, scanner);
    boolean[] visited = new boolean[n];
    for (int i = 0; i < visited.length; i++) {
      visited[i] = false;
    }
    printArrive(a, visited);
  }

  // 3 4 3 5 4
  // 1 1 1 1 1
  private static void printArrive(int[] a, boolean[] visited) {
    for (int i = 0; i < a.length; i++) {
      if (visited[i] == true) {
        continue;
      }
      int count = 0;
      for (int j = i; j < a.length; j++) {
        if (a[i] == a[j]) {
          count++;
          visited[j] = true;
        }
      }
      System.out.println("so lan xuat hien cua " + a[i] + " la " + count);
    }
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
