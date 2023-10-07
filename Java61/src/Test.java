import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv =new DanhSachSinhVien();
        int luachon =0;
        do {
            System.out.println("MENU _____________");
            System.out.println(
                  "1. Thêm sinh viên vào danh sách. \n"
                 +"2. In ra danh sách sinh viên.\n"
                 +"3. Kiểm tra danh sách có rỗng hay không. \n"
                 +"4. Lấy ra số lượng sinh viên. \n"
                 +"5. Làm trống danh sách. \n"
                 +"6. \n"
                 +"7. \n"
                 +"8. \n"
                 +"9. \n"
                 +"0. Thoát khỏi chương trình \n"
            );
            luachon= sc.nextInt();
            sc.nextLine();
            switch (luachon){
                case 1:
                    System.out.println("NHập mã sinh viên: "); String maSinhVien= sc.nextLine();
                    System.out.println("Nhập họ và tên: "); String hoVaTen= sc.nextLine();
                    System.out.println("NHập năm sinh : "); int namSinh= sc.nextInt();
                    System.out.println("NHập điểm trung bình : "); double diemTrungBinh= sc.nextDouble();
                    SinhVien sv =new SinhVien(maSinhVien, hoVaTen,namSinh,diemTrungBinh);
                    dssv.themSinhVien(sv);
                    break;

                case 2:
                    dssv.inDanhSachSinhvien();
                    break;

                case 3:
                    //Kiểm tra danh sách có rỗng hay không
                    System.out.println("Danh sách rỗng: "+dssv.kiemTraDanhSachRong());
                case 4:
                    // Lấy ra số lượng sinh viên
                    System.out.println("Số lượng sinh viên là:"+ dssv.laySoLuongSinhVien());

                case 5:
                    // Làm trống danh sách
                    dssv.lamTrongDanhSach();
            }
        } while (luachon!=0);

    }
}
