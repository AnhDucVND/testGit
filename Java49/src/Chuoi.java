public class Chuoi {
    public static void main(String[] args) {
        String s1="aa";
        String s2="AA";
        String s3="titv.vn";
        // hàm equals: so sánh 2 chuỗi giống nhau, có phân biệt chữ hoa, thường
//        System.out.println("So sanhs chuỗi s1 và s2: "+s1.equals(s2));
//        System.out.println("So sanhs chuỗi s1 và s2: "+s1.equals(s3));

// hàm equals: so sánh 2 chuỗi giống nhau, KHÔNG  phân biệt chữ hoa, thường( IGNORE: bỏ qua. case: kiểu chữ hoa, chữ thường)
//        System.out.println("So sanhs chuỗi s1 và s2: "+s1.equalsIgnoreCase(s2));
//        System.out.println("So sanhs chuỗi s1 và s2: "+s1.equalsIgnoreCase(s3));

        System.out.println("So sanhs chuỗi s1 và s2: "+s1.compareTo(s2));
        System.out.println("So sanhs chuỗi s1 và s2: "+s1.compareToIgnoreCase(s2));


    }
}
