package b11;

import java.util.Scanner;

public class Bt3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    while (n > 9) {
      n /= 10;
    }
    System.out.println(n);
  }

}
