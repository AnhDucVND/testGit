public class Test {
    public static void main(String[] args) {
        ToaDo td1=new ToaDo(2,3);
        ToaDo td2=new ToaDo(2,1);
        ToaDo td3=new ToaDo(4,3);

        Hinh h1=new Diem(td1);
        Hinh h2=new HInhTron(td2,3);
        Hinh h3=new HinhChuNhat(td3,3,10);
        System.out.println("h1 "+h1.tinhDienTich());
        System.out.println("h2"+h2.tinhDienTich());
        System.out.println("h3 "+h3.tinhDienTich());

    }




}
