import java.util.Scanner;

public class Bt7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n ");
    int n = scanner.nextInt();
    printPrime(n);
  }

  private static void printPrime(int n) {
    for (int i = 2; i <= n; i++) {
      boolean isMark = true;
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          isMark = false;
          break;
        }
      }
      if (isMark) {
        System.out.println(i);
      }
    }
  }
}
