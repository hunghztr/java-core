package b10;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    // for (int i = 1; i <= 10; i++) {
    // System.out.println("day lan lan lap thu " + i);
    // }
    // System.out.println("ket thuc chuong trinh");
    // String a = "hello world";
    // for (int i = 0; i < a.length(); i++) {
    // System.out.println("phan tu tai vi tri thu " + i + " la " + a.charAt(i));
    // }
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap vao 1 so");
    int n = scanner.nextInt();
    int i = 1;
    for (; i <= 10; i++) {
      System.out.println(n + " x " + i + " = " + (n * i));
    }
    System.out.println("ket thuc vong lap , gia tri cua i la " + i);
  }

}
