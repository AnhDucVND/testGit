import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
//        double a=10.4;
//        System.out.println("a: "+a/3);
//        int b= (int) a;
//        System.out.println("b: "+(b*100)/100);

        String tenSach= "Lập trình Java";
        int namXuatBan= 2021;
        double giaBan=15.5;
        boolean conSach=true;
        System.out.println("Tên sách: " +tenSach);
        System.out.println("Tên sách: " +giaBan*100);
        System.out.println("Tên sách: " +conSach);
         int c=(int) giaBan*100;

       // String strGia=String.valueOf(giaBan);
        System.out.println(c);

        String f="2";
        String g="5";
       // System.out.println(Integer.f);


        String inputdateStr="17/09/2023";
        DateFormat inputDateFormat= new SimpleDateFormat("dd/MM/yyyy");
        DateFormat outputDateFormat= new SimpleDateFormat("dd-MM-yyyy");


        Date date=inputDateFormat.parse(inputdateStr);
        String outputdateString=outputDateFormat.format(date);
        System.out.println("Ngày đầu vào: "+inputdateStr);
        System.out.println("Ngày đầu ra: "+outputdateString);





    }
}
