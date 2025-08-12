import java.util.Scanner;

public class Bt3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap vao chuoi n");
    String n = scanner.nextLine();
    int countLower = countLower(n);
    int countUpper = countUpper(n);
    System.out.println("so ki tu viet thuong la " + countLower);
    System.out.println("so ki tu viet hoa la " + countUpper);
  }

  private static int countLower(String n) {
    int count = 0;
    for (int i = 0; i < n.length(); i++) {
      if (n.charAt(i) == ' ') {
        continue;
      }
      if (Character.isLowerCase(n.charAt(i))) {
        count++;
      }
    }
    return count;
  }

  private static int countUpper(String n) {
    int count = 0;
    for (int i = 0; i < n.length(); i++) {
      if (n.charAt(i) == ' ') {
        continue;
      }
      if (Character.isUpperCase(n.charAt(i))) {
        count++;
      }
    }
    return count;
  }
}
