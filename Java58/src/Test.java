import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.sql.Date;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws ParseException {
//        long t1=System.currentTimeMillis();
//        for(int i=0;i<100000;i++){
//            System.out.println("Test");
//        }
//
//        long t2= System.currentTimeMillis();
//        System.out.println("Trước khi chạy vòng for: "+t1);
//        System.out.println("Sau khi chạy vòng for: "+t2);
//        System.out.println("thời gian:"+(t2-t1)+"mls");
//        System.out.println("thời gian:"+((t2-t1)/1000)+"mls");

        //Timeunit: chuyển đổi thời gian
//        System.out.println("3000 năm sẽ bằng: "+ TimeUnit.DAYS.toSeconds(3000*365));
//        System.out.println("1 giờ sẽ bằng: "+ TimeUnit.HOURS.toMinutes(1));
//        System.out.println("1 giờ sẽ bằng : "+ TimeUnit.HOURS.toDays(71)+"ngày");

        //Date
//        Date d=new Date(System.currentTimeMillis());
//        System.out.println(d);

        // Calendar
        String dateString="14/09/2023";
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");

//       System.out.println(dateFormat.format(d));


//        dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        Date date= dateFormat.parse(dateString);
        System.out.println(date);



    }
}
