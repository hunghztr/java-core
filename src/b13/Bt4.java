import java.util.Scanner;

public class Bt4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    int first = getFirst(n);
    System.out.println("chu so dau tien la " + first);
  }

  private static int getFirst(int n) {
    while (n > 9) {
      n /= 10;
    }
    return n;
  }

}
