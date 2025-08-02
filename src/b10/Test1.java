package b10;

public class Test1 {
  public static void main(String[] args) {
    // break : thoát vòng lặp
    // continue : nhảy đến bước nhảy trong vòng lặp
    // return kết thúc hàm
    // for (int i = 1; i <= 10; i++) {
    // if (i == 5) {
    // break;
    // }
    // System.out.println(i);
    // }
    // for (int i = 1; i <= 10; i++) {
    // if (i == 5) {
    // continue;
    // }
    // System.out.println(i);
    // }
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        return;
      }
      System.out.println(i);
    }
    System.out.println("chuong trinh da ket thuc");
  }

}
