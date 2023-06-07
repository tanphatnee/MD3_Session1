import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   // Phương thức main trong java dùng để chạy chương trình
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Hãy nhập vào tuổi của bạn : ");
       int age = Integer.parseInt(sc.nextLine());
       System.out.println("Hãy nhập vào tên của bạn : ");
       String name = sc.nextLine();
       System.out.println("Hãy nhập vào sdt của bạn : ");
       String phone = sc.nextLine();
       System.out.println("Hãy nhập vào số nhà của bạn : ");
       int number = Integer.parseInt(sc.nextLine());
       // Hiển thị ra màn hình
       System.out.print("Xin chào bạn");
       System.out.printf("\n Thông tin bạn vừa nhập là name:%s , age:%d, phone: %s , Address: %d \n ",name,age,phone,number);
       System.out.println("ERROR...❤️❤️❤️❤️❤️❤️❤️❤️");
   }



}