// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       HoaDonCaPhe hd1=new HoaDonCaPhe("Trung Nguyên", 100000, 9.5);
        System.out.println("Tong tiền:"+hd1.tinhTongTien());
        System.out.println("Kiểm tra khoi luong >2: "+ hd1.kiemTraKhoiLuong(1));
        System.out.println("Kiểm tra số tiền HĐ 1 lớn hơn 500K:"+ hd1.kiemTraTongTienLonHon500k());
        System.out.println("Số tiền giảm của hoá đơn 1:"+hd1.soTienGiamGia(5));
        System.out.println("Số tiền hđ2  sau khi áp mã giảm giá: "+ hd1.tienSauKhiGiam(5));

        System.out.println("-----------------");

        HoaDonCaPhe hd2=new HoaDonCaPhe("Trung Nguyên 2", 100000, 2.5);
        System.out.println("Kiểm tra số tiền lớn hơn 500K:"+ hd2.kiemTraTongTienLonHon500k());
        System.out.println("Số tiền giảm của hoá đơn 2:"+hd2.soTienGiamGia(5));

        hd2.setTenLoaiCaPhe("Nguyễn Anh Đức");
        System.out.println("Số tiền hđ2"+" " + hd2.getTenLoaiCaPhe()+" sau khi áp mã giảm giá: "+ hd2.tienSauKhiGiam(5));
        System.out.println(hd2);

        String a="Đức";
        String b="Đức";
        System.out.println(a.compareTo(b));
    }
}