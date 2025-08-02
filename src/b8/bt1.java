package b8;

import java.util.Scanner;

public class bt1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap so nguyen");
    int n = scanner.nextInt();
    // n % 2 == 0
    if (n % 2 == 0) {
      System.out.println("la so chan");
    } else {
      System.out.println("la so le");
    }
  }

}
