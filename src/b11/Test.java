package b11;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    // while
    // do while
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("nhap n");
    // int n = scanner.nextInt();
    // // while (n <= 0) {
    // // System.out.println("nhap lai n");
    // // n = scanner.nextInt();
    // // }
    // // System.out.println("gia tri cua n la " + n);
    // int sum = 0;
    // int i = 1;
    // while (i <= n) {
    // sum += i;
    // i++;
    // }
    // System.out.println("gia tri cua sum la " + sum);
    // do while
    // Scanner scanner = new Scanner(System.in);
    // int n = 0;
    // do {
    // System.out.println("nhap n");
    // n = scanner.nextInt();
    // } while (n <= 0);
    // System.out.println("gia tri cua n " + n);
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      System.out.println("MENU");
      System.out.println("1.in ra hello world");
      System.out.println("2.in ra lap trinh java");
      System.out.println("3.in ra hoc it");
      System.out.println("-------");
      System.out.println("nhap lua chon cua ban");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println("hello world");
          break;
        case 2:
          System.out.println("lap trinh java");
          break;
        case 3:
          System.out.println("hoc it");
          break;
        default:
          break;
      }
    } while (choice != 0);
  }
}
