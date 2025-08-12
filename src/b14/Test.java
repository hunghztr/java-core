package b14;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("nhap a");
    // int a = scanner.nextInt();
    // System.out.println("nhap b");
    // int b = scanner.nextInt();
    // // System.out.println("nhap c");
    // // int c = scanner.nextInt();
    // // System.out.println("tong a va b la " + tong(a, b, c));
    // System.out.println("tong 2 so la " + tong2So(a, b));
    // System.out.println("nhap n");
    // double n = scanner.nextDouble();
    // System.out.println("nhap m");
    // double m = scanner.nextDouble();
    // System.out.println("tong 2 so la " + tong2So(n, m));
    // String name = "Erik";
    // int age = 20;
    // print(name, age);
    Student student = new Student("hung", 20, "ha noi");
  }

  public static void print(String name, int age) {
    System.out.println(name + " co tuoi la " + age);
  }

  public static void print(int age, String name) {
    System.out.println(name + " co tuoi la " + age);
  }

  public static int tong(int a, int b) {
    return a + b;
  }

  public static int tong(int a, int b, int c) {
    return a + b + c;
  }

  public static int tong2So(int a, int b) {
    return a + b;
  }

  public static double tong2So(double a, double b) {
    return a + b;
  }
}
