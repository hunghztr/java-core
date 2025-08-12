import java.util.Scanner;

public class Bt1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap a");
    int a = scanner.nextInt();
    System.out.println("nhap b");
    int b = scanner.nextInt();
    System.out.println("nhap c");
    int c = scanner.nextInt();
    int max = findMax(a, b, c);
    System.out.println("gia tri lon nhat la " + max);
  }

  private static int findMax(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
  }

}
