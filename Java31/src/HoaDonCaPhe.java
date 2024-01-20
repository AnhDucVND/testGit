import java.util.Objects;

public class HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaTien1Kg;
    private double khoiLuong;

    public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien1Kg, double khoiLuong){
        this.tenLoaiCaPhe=tenLoaiCaPhe;
        this.giaTien1Kg=giaTien1Kg;
        this.khoiLuong=khoiLuong;
    }

    public double tinhTongTien(){
        return this.khoiLuong*this.giaTien1Kg;
    }
    public boolean kiemTraKhoiLuong(double khoiLuongInPut){
        return this.khoiLuong> khoiLuongInPut;
    }

    // Sử dụng lại phương thức trong phương thức
    public  boolean kiemTraTongTienLonHon500k(){
        return this.tinhTongTien()>500000;
    }
    public double soTienGiamGia(double x){

        if (kiemTraTongTienLonHon500k()==true){
            return this.tinhTongTien()*(x/100);
        } else {
            System.out.println("Hoa đơn không hợp lệ để giảm giá");
            return 0;
        }

    }
    public  double tienSauKhiGiam(double x){
        return this.tinhTongTien()-this.soTienGiamGia(x);
    }

    public String getTenLoaiCaPhe() {
        return tenLoaiCaPhe;
    }

    public void setTenLoaiCaPhe(String tenLoaiCaPhe) {
        this.tenLoaiCaPhe = tenLoaiCaPhe;
    }

    public double getGiaTien1Kg() {
        return giaTien1Kg;
    }

    public void setGiaTien1Kg(double giaTien1Kg) {
        this.giaTien1Kg = giaTien1Kg;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    @Override
    public String toString() {
        return "HoaDonCaPhe{" +
                "tenLoaiCaPhe='" + tenLoaiCaPhe + '\'' +
                ", giaTien1Kg=" + giaTien1Kg +
                ", khoiLuong=" + khoiLuong +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        // So sánh đối tượng
        if (this == o) return true;
        // Kiểm tra Class của đối tượng
        // instanceof : Kiểm tra 1 đối tượng có phải là thể hiện của 1 kiểu dữ liệu cụ thể không( Class, interface
        if (!(o instanceof HoaDonCaPhe)) return false;

        HoaDonCaPhe that = (HoaDonCaPhe) o;

        if (Double.compare(that.getGiaTien1Kg(), getGiaTien1Kg()) != 0) return false;
        if (Double.compare(that.getKhoiLuong(), getKhoiLuong()) != 0) return false;
        return getTenLoaiCaPhe().equals(that.getTenLoaiCaPhe());
    }



    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getTenLoaiCaPhe().hashCode();
        temp = Double.doubleToLongBits(getGiaTien1Kg());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getKhoiLuong());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
