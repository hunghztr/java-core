package b8;

import java.util.Scanner;

public class bt5 {
  public static void main(String[] args) {
    // giải pt bậc 2
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap a");
    double a = scanner.nextDouble();
    System.out.println("nhap b");
    double b = scanner.nextDouble();
    System.out.println("nhap c");
    double c = scanner.nextDouble();
    if (a == 0) {
      System.out.println("khong phai pt bac 2");
    } else {
      double delta = b * b - 4 * a * c;
      if (delta < 0) {
        System.out.println("pt vo nghiem");
      } else if (delta == 0) {
        System.out.println("pt co nghiem kep la " + (-b / (2 * a)));
      } else {
        double x1 = (-b + Math.sqrt(delta) / (2 * a));
        double x2 = (-b - Math.sqrt(delta) / (2 * a));
        System.out.println("pt co 2 nghiem la x1=" + x1 + ", x2=" + x2);
      }
    }
  }
}
