package b9;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    switch (n) {
      case 1:
        System.out.println("so mot");
        break;
      case 2:
        System.out.println("so hai");
        break;
      default:
        System.out.println("day la so con lai");
        break;
    }
  }

}
