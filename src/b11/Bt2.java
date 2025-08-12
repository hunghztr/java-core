package b11;

import java.util.Scanner;

public class Bt2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap a");
    int a = scanner.nextInt();
    System.out.println("nhap b");
    int b = scanner.nextInt();
    int min = Math.min(a, b);
    while (min > 0) {
      if (a % min == 0 && b % min == 0) {
        System.out.println(min);
        break;
      }
      min--;
    }
  }
}
