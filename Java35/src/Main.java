
public class Main {
    public static void main(String[] args) {
        Ngay ngay1=new Ngay(15,5,2021);
        Ngay ngay2=new Ngay(25,9,2021);
        Ngay ngay3=new Ngay(15,5,2021);

        tacGia tacGia1= new tacGia("Nguyễn ANh Đức1", ngay1 );
        tacGia tacGia2= new tacGia("Nguyễn ANh Đức2", ngay2 );
        tacGia tacGia3= new tacGia("Nguyễn ANh Đức3", ngay3 );

        Sach Sach1=new Sach("Lập trình C", 10000,2022, tacGia1);
        Sach Sach2=new Sach("Lập trình Java", 8000,2021, tacGia2);
        Sach Sach3=new Sach("Lập trình Python", 4000,2022, tacGia3);

        Sach1.inTenSach();
        Sach2.inTenSach();
        Sach3.inTenSach();

        System.out.println("Ngày "+ tacGia1.getNgaySinh());

        tacGia1.inTenTacGia();

        System.out.println("So sánh sách 1 và sách 3: "+ Sach1.kiemTraCungNamXuatBan(Sach3));
        System.out.println("Giá sách 1 sau khi giảm: " +Sach1.giaSauKhiGiam(30));
        System.out.println("Giá sách 1 sau khi giảm: " +Sach2.giaSauKhiGiam(50));
        System.out.println("Giá sách 1 sau khi giảm: " +Sach3.giaSauKhiGiam(100));
    }
    }