package b6;

import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chuỗi str1");
        String str1   = scanner.nextLine();
        System.out.println("nhập vào chỗi str2");
        String str2   = scanner.nextLine();
        int index = str1.indexOf(str2);
        System.out.println("vị trí xuất hiện là "+index);
    }
}
