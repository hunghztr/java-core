import java.util.Scanner;

public class Bt8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n ");
    int n = scanner.nextInt();
    boolean isTrue = isContain8(n);
    if (isTrue) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  private static boolean isContain8(int n) {
    while (n > 0) {
      int digit = n % 10;
      if (digit == 8) {
        return true;
      }
      n /= 10;
    }
    return false;
  }
}
