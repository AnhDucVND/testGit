import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;
    public DanhSachSinhVien(){
        this.danhSach=new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    public  void inDanhSachSinhvien(){
        for (SinhVien sinhVien: danhSach) {
            System.out.println(sinhVien);
        }
    }
    // Kiểm tra danh sách rỗng hay không?
    public boolean kiemTraDanhSachRong(){
       return this.danhSach.isEmpty();
    }
    //4. In ra số lượng sinh viên trong danh sách
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }
    //5 Lamg trống danh sách
    public void lamTrongDanhSach(){
        this.danhSach.remove(danhSach);
    }
    public boolean kiemTraTonTai (SinhVien sv){
        return this.danhSach.contains(sv);
    }
    public boolean xoaSinhVien (SinhVien sv){
       return this.danhSach.remove(sv);
    }

//    public void timSinhVien(String ten){
//       for
//
//        }
//    }

}
