import java.util.Scanner;

public class Bt2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap n");
    int n = scanner.nextInt();
    double avg = averageN(n, scanner);
    System.out.println("trung binh cong la " + avg);
  }

  private static double averageN(int n, Scanner scanner) {
    double avg = 0;
    for (int i = 1; i <= n; i++) {
      System.out.println("nhap so thu " + i);
      double num = scanner.nextDouble();
      avg += num;
    }
    avg /= n;
    return avg;
  }
}
