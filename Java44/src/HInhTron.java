public class HInhTron extends Hinh{
    private double r;

    public HInhTron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*r*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
