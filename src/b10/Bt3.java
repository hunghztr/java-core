package b10;

import java.util.Scanner;

public class Bt3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap vao chuoi");
    String s = scanner.nextLine();
    s = s.trim();
    System.out.println(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        System.out.println(s.charAt(i + 1));
      }
    }
  }
}
