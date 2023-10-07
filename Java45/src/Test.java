public class Test {
    public static void main(String[] args) {
        HangSanXuat hsx1=new HangSanXuat("Hang 1","VietNam");
        HangSanXuat hsx2=new HangSanXuat("Hang 2","Nhat Ban");
        HangSanXuat hsx3=new HangSanXuat("Hang 3","VietNam");

        MayBay MayBay= new MayBay("May bay",hsx1,"XangMayBay");
        PhuongTienDiChuyen XeOTo= new XeOTo("XeOTO",hsx2,"XangOTo");
        PhuongTienDiChuyen XeDap= new XeDap("XeOTO",hsx2);

        System.out.println(MayBay.layTenHangSanXuat());

        XeDap.batDau();
        System.out.println("Lay van toc");
        System.out.println("May bay "+MayBay.layVanToc());
        System.out.println("May bay "+XeOTo.layVanToc());
        System.out.println("May bay "+XeDap.layVanToc());


        MayBay.catCanh();
    }
}
