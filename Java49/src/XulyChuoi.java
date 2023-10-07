public class XulyChuoi {
    public static void main(String[] args) {
        String s1="          NgUyễn    ";
        String s2="Anh ";
        String s3="Nguyễn văn Anh";
        String s4=s1+s2;
        //Hàm concat: Dùng để nối chuỗi
        String s5=s1.concat(s2);
        System.out.println(s4);
        System.out.println(s5);
        //Hàm replace dùng để thay thế kí tự hoặc chuỗi kí tự( phải tạo 1 biến mới để lưu giá trị mới)
        String s6="1,000,454 đồng";
        String s7=s6.replaceAll(",", "");
        System.out.println(s7);

        //Bỏ dấu cách
        String s8=s7.replaceAll(" ", "");
        System.out.println(s8);

        //Bỏ dấu VND
        String s9=s8.replaceAll("đồng", "");
        System.out.println(s9);

        //toLowerCase: Hàm chuyển về viết thường
        System.out.println(s1.toLowerCase());
        //toUpperCase: Hàm chuyền veef viết hoa

        System.out.println(s2.toUpperCase());


        System.out.println(s1);

        System.out.println(s1.trim());

        String s12=s3.substring(10);
        String s13=s3.substring(0,6);

        System.out.println(s12);
        System.out.println(s13);


    }
}
