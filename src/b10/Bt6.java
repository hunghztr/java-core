package b10;

import java.util.Scanner;

public class Bt6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int origin = n;
    int result = 0;
    // 1 2 3
    for (; n > 0; n /= 10) {
      int digit = n % 10;
      // 1 2
      result = result * 10 + digit;
    }
    if (origin == result) {
      System.out.println("la so doi xung");
    } else {
      System.out.println("khong phai so doi xung");
    }
  }
}
