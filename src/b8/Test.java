package b8;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int age = scanner.nextInt();
    // if (age >= 18) {
    // System.out.println("ban da truong thanh");
    // } else {
    // System.out.println("ban con nho");
    // }
    System.out.println("nhap vao diem");
    int score = scanner.nextInt();
    if (score > 9) {
      System.out.println("xuat sac");
    } else if (score > 8) {
      System.out.println("gioi");
    } else {
      System.out.println("trung binh");
    }
  }

}
