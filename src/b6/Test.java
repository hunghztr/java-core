package b6;

public class Test {
    public static void main(String[] args) {
        String a = "   hellol   ";
        System.out.println("do dai cua a la "+a.length());
        System.out.println("ki tu tai vi tri 2 la "+a.charAt(2));
        String b = a.substring(1);
        System.out.println("gia tri cua b la "+b);
        System.out.println("gia tri cua a la "+a);
        String c = a.substring(1,3);
        System.out.println("gia tri cua c la "+c);
        String u = a.toUpperCase();
        String l = a.toLowerCase();
        System.out.println("gia tri cua u la "+u);
        System.out.println("gia tri cua l la "+l);
        String temp = "hed";
        System.out.println("chuoi temp co bang a hay khong?"+a.equals(temp));
        System.out.println("temp co trong a hay khong?"+a.contains(temp));
        String replace = a.replace('h','0');
        System.out.println("ki tu da dc thay the la "+replace);
        int indexFirst = a.indexOf('l');
        int indexLast = a.lastIndexOf('l');
        System.out.println("indexFirst la "+indexFirst);
        System.out.println("indexLast la "+indexLast);
        System.out.println("bat dau voi e hay khong?"+a.startsWith("h"));
        String trim = a.trim();
        System.out.println("trim la "+trim);
        String e = "";
        System.out.println("e co rong hay khong?"+e.isEmpty());
        String result = String.valueOf(40);
        // nhap vao 1 chuoi , xu li viet hoa toan bo chuoi
        // thay the toan bo ki tu space thanh *
        // nhap vao 2 chuoi str1 va str2 nho hon str1 tim vi tri xuat hien dau tien cua str2 trong str1
        // nhap vao ho va ten , xu li tach chuoi thanh 3 bien la Ho,Ten Dem,Ten và in ra màn hình họ:,ten dem:,ten
    }
}
