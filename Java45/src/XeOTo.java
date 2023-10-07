public class XeOTo extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public XeOTo(String tenLoaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(tenLoaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 220;
    }
}
