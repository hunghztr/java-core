package b3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        int a = scanner.nextInt();
        System.out.println("nhap b");
        double b = scanner.nextDouble();
        System.out.println("nhap c");
        char c = scanner.next().charAt(0);
        System.out.println("nhap d");
        scanner.nextLine();
        String d = scanner.nextLine();
        System.out.println("day la a >>> "+a+", day la b >>> "+b+", day la c >>> "+c+", day la d >>> "+d);
    }
}
