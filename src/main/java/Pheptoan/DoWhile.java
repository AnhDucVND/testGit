package Pheptoan;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
// lặp đi lặp laại điều kiện cho đến khi thoả mãn
        do {
            System.out.println("Nhập vào số n>0");
            n = sc.nextInt();
        } while (n<0);

    }
}
