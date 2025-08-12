package b12;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    // for (int i = 1; i <= 5; i++) {
    // System.out.println("i = " + i);
    // for (int j = 1; j <= 5; j++) {
    // System.out.println("j = " + j);
    // }
    // }
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n; j++) {
    // if (i == 1 || j == 1 || i == n || j == n || i == j || n + 1 == i + j) {
    // System.out.print(" * ");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

}
