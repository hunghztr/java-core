package b1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        float c = 4.6f;
        double d = 5.3;
        char e = 'g';
        boolean f = true;

        String s = "xin chào ";

        // + - * / %
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        int a = scanner.nextInt();
        System.out.println("nhap b");
        int b = scanner.nextInt();
        int tinhTong = a + b;
        int tinhHieu = a - b;
        int tinhTich = a * b;
        double tinhThuong = (double) a / b;
        System.out.println("tổng của a va b "+tinhTong);
        System.out.println("hiệu của a va b "+tinhHieu);
        System.out.println("tích của a va b "+tinhTich);
        System.out.println("thương của a va b "+tinhThuong);
       // ép kiểu
        double soThuc = 4.0;
        int soNguyen = (int)soThuc;
        // tính chu vi và diện tích của hình chu nhật , chiều dài , chiều cao nhập tu bàn phím  (Scanner)
    }
}
