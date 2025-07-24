package b1;

import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai");
        int dai = scanner.nextInt();
        System.out.println("nhap chieu rong");
        int rong = scanner.nextInt();
        int tinhChuVi = (dai + rong) * 2;
        int tinhDienTich = dai * rong;
        System.out.println("chu vi hinh chu nhat la "+tinhChuVi);
        System.out.println("dien tich hinh chu nhat la "+tinhDienTich);
    }
}
