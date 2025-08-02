package b10;

import java.util.Scanner;

public class Bt4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap vao chuoi");
    String s = scanner.nextLine();
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        count++;
      }
    }
    System.out.println("so tu trong 1 chuoi la " + (count + 1));
  }
}
