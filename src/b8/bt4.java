package b8;

import java.util.Scanner;

public class bt4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap vao 1 chuoi");
    String n = scanner.nextLine();
    // h e l l o
    // 0 1 2 3 4
    if (n.charAt(0) == n.charAt(n.length() - 1)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
