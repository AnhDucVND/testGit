public class HinhChuNhat extends Hinh {
    private int chieuDai, chieuRong;

    public HinhChuNhat(ToaDo toaDo, int chieuDai, int chieuRong) {
        super(toaDo);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai*chieuRong;
    }



}
