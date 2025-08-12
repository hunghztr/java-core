public class Test {
  public static void main(String[] args) {
    // printSuccess();
    // printSuccess();
    // printSuccess();
    // int a = 5, b = 9;
    // int max = findMax(a, b);
    // System.out.println("gia tri lon nhat la " + max);
    printSuccess("iphone 16");
  }

  public static void printSuccess(String tensp) {
    System.out.println("ban da mua thanh cong san pham " + tensp);
  }

  public static int findMax(int num1, int num2) {
    if (num1 >= num2) {
      return num1;
    } else {
      return num2;
    }
  }

  public static void sayHello() {
    System.out.println("helllo....");
  }
}
