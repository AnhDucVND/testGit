import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> sv=new ArrayList<>();
        sv.add("Đức");
        sv.add("khanh");
        sv.add("Khanh");
        sv.add("Đức");
        sv.add("Đức");
        System.out.println(sv.size());
        //Duyệt mảng dùng for each
        for (String ten: sv
             ) {
            System.out.println(ten);
        }

    }
}