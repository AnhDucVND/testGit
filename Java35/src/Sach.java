public class Sach {
    private String tenSach;
    private double giaBan;
    private  int namxuatBan;
    private tacGia tacGia;

    public Sach(String tenSach, double giaBan, int namxuatBan, tacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namxuatBan = namxuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamxuatBan() {
        return namxuatBan;
    }

    public void setNamxuatBan(int namxuatBan) {
        this.namxuatBan = namxuatBan;
    }

    public tacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(tacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void inTenSach(){
        System.out.println(this.tenSach);

    }
    public boolean kiemTraCungNamXuatBan(Sach sachKhac){
            return this.namxuatBan==sachKhac.namxuatBan;
    }
    public double giaSauKhiGiam(double x){
        return (1-x/100)*this.giaBan;
    }
}
