import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000000;
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        do {
            System.out.println("--------MỜI BẠN LỰA CHỌN------------");
            System.out.println("Chọn (1) để tiếp tục chơi");
            luaChon = sc.nextInt();

            if (luaChon == 1) {
                System.out.println("Bắt đầu chơi: ");
                System.out.println("Số tiền của bạn là: " + taiKhoanNguoiChoi);

                double datCuoc = 0;

                // Kiểm tra số tiền đặt cược
                do {
                    System.out.println("Số tiền đặt cược >=0 và nhỏ hơn" + taiKhoanNguoiChoi + ":");
                    datCuoc = sc.nextLong();
                } while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

                //Lựa chọn Tài hoặc xỉu
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("Chọn (1)->Xỉu, Chọn (2) -> Tài: ");
                    luaChonTaiXiu = sc.nextInt();

                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

                //Tung xúc xắc
                Random xucxac = new Random();
                int giatri1 = xucxac.nextInt(5) + 1;
                int giatri2 = xucxac.nextInt(5) + 1;
                int giatri3 = xucxac.nextInt(5) + 1;
                int Tong = giatri1 + giatri2 + giatri3;
                System.out.println("Kết quả tung xúc xắc là:" + giatri1 + " - " + giatri2 + " - " + giatri3);
                System.out.println("Tổng là :" + Tong);

                if (Tong == 3 || Tong == 18) {
                    System.out.println("Bạn đã thua");
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("Số tiền của bạn là: " + taiKhoanNguoiChoi);
                } else if (Tong < 4 || Tong <= 10) {
                    System.out.println("Kết quả: Xỉu ");
                    if (luaChonTaiXiu == 1) {

                        System.out.println("Bạn đã thắng ");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("Số tiền của bạn là: " + taiKhoanNguoiChoi);
                    } else {
                        System.out.println("Bạn đã thua ");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Số tiền của bạn là: " + taiKhoanNguoiChoi);
                    }
                } else {
                    System.out.println("Kết quả: Tài ");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("Bạn đã thắng ");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("Số tiền của bạn là: " + taiKhoanNguoiChoi);
                    } else {
                        System.out.println("Bạn đã thua ");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Số tiền của bạn là: " + taiKhoanNguoiChoi);


                    }
                }
            }

        } while (luaChon != 0);
    }
}