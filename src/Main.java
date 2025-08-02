import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tuoi");
        int age = scanner.nextInt();
        System.out.println("nhap ho va ten");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("tuoi cua ban la " + age);
        System.out.println("ten cua ban la " + name);
    }
}