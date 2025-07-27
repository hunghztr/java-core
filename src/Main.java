import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        System.out.println("length of string: " + input.length());

//        String result = input.toUpperCase();
//        System.out.println(result);

//        String result = input.replace(" ","*");
//        System.out.println(result);

//        String result = input.replaceAll("\\s+"," ");
//        System.out.println(result);

//        int first = input.indexOf(" ");
//        int last = input.lastIndexOf(" ");
//        String firstName = input.substring(0, first);
//        String lastName = input.substring(last + 1);
//        System.out.println("họ "+firstName);
//        System.out.println("tên "+lastName);

        char first = input.charAt(0);
        System.out.println("vị trí đầu tiên là "+first);
    }
}