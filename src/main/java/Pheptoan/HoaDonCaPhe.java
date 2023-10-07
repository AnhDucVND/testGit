package Pheptoan;

public class HoaDonCaPhe {
     private String tenLoaiCaPhe;
     private double giaTien1kg;
     private double khoiLuong;
     public HoaDonCaPhe(String ten, double gia,double kl){
         this.tenLoaiCaPhe=ten;
         this.giaTien1kg=gia;
         this.khoiLuong=kl;
     };
     public double tinhTongtien(){
         return this.giaTien1kg*this.khoiLuong;
     }
     public boolean CheckKL(double kl){
         return this.khoiLuong>kl;
     }
    public boolean checkTongTienLonHon500k(){
        return this.tinhTongtien()>500000;
    }
    public double giamGia(double x){
         if(this.tinhTongtien()>500000){
         return (x/100)*this.tinhTongtien();

    } else {
             return 0;
         }
    }
    public double giaSaukhigiam(double x){
         return this.tinhTongtien()-this.giamGia(x);
    }


    public static void main(String[] args) {
        HoaDonCaPhe TT=new HoaDonCaPhe("Trung Nguyên",100000, 1.5);
        HoaDonCaPhe TT2=new HoaDonCaPhe("Trung Nguyên",100000, 5.5);

        TT.tinhTongtien();
        System.out.println("Tổng tiền phải thanh toán TT1 là: "+TT.tinhTongtien());
        System.out.println("Tổng tiền phải thanh toán TT2 là: "+TT2.tinhTongtien());
//        System.out.println("Kiểm tra khối lượng > 2kg "+TT.CheckKL(2));
//        System.out.println("Kiểm tra khối lượng < 2kg "+TT.CheckKL(1));
//        System.out.println("Kiểm tra Tong tiền >500k "+TT.checkTongTienLonHon500k());
        System.out.println("Số tiền giảm giá TT1 "+TT.giamGia(10));
        System.out.println("Số tiền giảm giá TT2 "+TT2.giamGia(10));
        System.out.println("Số tiền sau khi giảm giá TT1:"+TT.giaSaukhigiam(10));
        System.out.println("Số tiền sau giảm giá của TT2: "+TT2.giaSaukhigiam(10));

    }


}
