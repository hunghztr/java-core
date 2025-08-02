package b8;

import java.util.Scanner;

public class bt2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap vao n1");
    int n1 = scanner.nextInt();
    System.out.println("nhap vao n2");
    int n2 = scanner.nextInt();
    if (n1 > n2) {
      System.out.println(n1 + " lon hon " + n2);
    } else if (n1 == n2) {
      System.out.println(n1 + " bang " + n2);
    } else {
      System.out.println(n1 + " nho hon " + n2);
    }
  }
}
