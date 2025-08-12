package b11;

import java.util.Scanner;

public class Bt5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int max = 0;
    while (n > 0) {

      int digit = n % 10;
      if (digit >= max) {
        max = digit;
      }
      n /= 10;
    }
    System.out.println(max);
  }

}
