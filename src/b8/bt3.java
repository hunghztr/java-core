package b8;

import java.util.Scanner;

public class bt3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap canh a");
    int a = scanner.nextInt();
    System.out.println("nhap canh b");
    int b = scanner.nextInt();
    System.out.println("nhap canh c");
    int c = scanner.nextInt();
    if (a + b > c && a + c > b && b + c > a) {
      System.out.println("tao nen tam giac");
    } else {
      System.out.println("khong tao nen tam giac");
    }
  }
}
