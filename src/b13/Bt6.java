import java.util.Scanner;

public class Bt6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    boolean isPrime = isPrime(n);
    if (isPrime) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  private static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
