import java.util.Scanner;

public class Bt5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n ");
    int n = scanner.nextInt();
    int sum = sumOfN(n);
    System.out.println("gia tri cua tong chu so trong n la " + sum);
  }

  private static int sumOfN(int n) {
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      sum += digit;
      n /= 10;
    }
    return sum;
  }

}
