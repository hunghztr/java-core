package b6;

import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ho va ten");
        String fullname = scanner.nextLine();
        int indexFirst = fullname.indexOf(" ");
        int indexLast = fullname.lastIndexOf(" ");
        // nguyen van a
        String first = fullname.substring(0,indexFirst);
        String mid = fullname.substring(indexFirst+1,indexLast);
        String last = fullname.substring(indexLast+1);
        System.out.println("họ là "+first);
        System.out.println("tên dem la "+mid);
        System.out.println("tên là "+last);
    }
}
