import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Nhập chuỗi s: ");
        s= sc.nextLine();;
        // Hàm length : Lấy ra độ dài của chuỗi
        System.out.println(s.length());
        int doDai= s.length();
        // Hàm charAt()==> Lấy ra 1 ký tự tại 1 vị trí
        for(int i=0;i<s.length();i++){
            System.out.println("Vị trí"+i+" "+s.charAt(i));
        }

        //Hàm getChars(vị trí bắt đầu, vị trí kết thúc, mảng lưu giữ liệu, vị trí băt đầu lưu của mảng)
        char[] arrayChars= new char[100];
        s.getChars(3,3, arrayChars,0);
        for (int i=0;i<arrayChars.length;i++){
        System.out.println("Giá trị của mảng tại vị trí thứ"+i+arrayChars[i]);
        }
        //getByte



    }
}