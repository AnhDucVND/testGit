package Pheptoan;

import java.util.Scanner;

// Khi không xác định được điểm dừng thì dùng vòng lặp while

public class VonglapWhile {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vao số nguyên n>0");
        n = sc.nextInt();
        String nhiphan = "";
        // Chia liên tục cho 2 và lấy phần dư
        // Đảo ngược chuỗi => Kết quả
        while (n > 0) {
            nhiphan = (n % 2) + nhiphan;
            n=n/2;
        }
        System.out.println("Hệ nhị phân của "+ nhiphan );
    }
}
