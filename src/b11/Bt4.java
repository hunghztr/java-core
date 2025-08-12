package b11;

import java.util.Scanner;

public class Bt4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int count = 0;
    while (n > 0) {
      count++;
      n /= 10;
    }
    System.out.println("so luong chu so cua n la " + count);
  }

}
