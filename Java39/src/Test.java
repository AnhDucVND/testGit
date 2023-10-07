public class Test {
    public static void main(String[] args) {
        ConNguoi cn= new ConNguoi("Đức", 1998);
        cn.an();
        cn.ngu();
        cn.uong();
        HocSinh hs =new HocSinh("Đức", 1997, "Lớp 10", "THCS Tiên Hiệp");
        hs.an();

        hs.getNamSinh();
        System.out.println(hs.getHoTen());
        System.out.println( hs.getTenLop());
        System.out.println(hs.getTenTruong());
        System.out.println(hs.getNamSinh());
        hs.lamBaiTap();
    }
}
