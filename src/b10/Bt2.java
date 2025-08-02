package b10;

import java.util.Scanner;

public class Bt2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    double sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += ((double) 1 / i);
    }
    System.out.println("gia tri cua sum la " + sum);
  }
}
