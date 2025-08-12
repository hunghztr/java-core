package b16;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    // String[] students = { "quang", "hung", "hieu" };
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap so luong hoc sinh");
    int n = scanner.nextInt();
    scanner.nextLine();
    String[] students = input(n, scanner);
    output(students);
    // for (int i = 0; i < n; i++) {
    // System.out.println("nhap hoc sinh thu " + (i + 1));
    // students[i] = scanner.nextLine();
    // }
    // for (int i = 0; i < students.length; i++) {
    // System.out.println(students[i]);
    // }

  }

  public static String[] input(int n, Scanner scanner) {
    String[] students = new String[n];
    for (int i = 0; i < n; i++) {
      System.out.println("nhap hoc sinh thu " + (i + 1));
      students[i] = scanner.nextLine();
    }
    return students;
  }

  public static void output(String[] students) {
    System.out.println("danh sach hoc sinh");
    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i]);
    }
  }
}
