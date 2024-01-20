import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
//        Date currentDate =new Date();
//        System.out.println(currentDate);
//        String dateToStr= DateFormat.getDateInstance().format(currentDate);
//        System.out.println(dateToStr);
        String dateStr="2023-11-09";
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        Date date=df.parse(dateStr);
        String patern="dd-MM-yyyy";
        String patern1="dd/MM/yyyy";
        String patern2="yyyy/MM/dd";
        String patern3="dd-MM-yyyy";

        SimpleDateFormat df2= new SimpleDateFormat(patern2);
        System.out.println(df2.format(date));


//        Date date1=new Date();
//        DateFormat d2= new SimpleDateFormat("yyyy-MM-dd");
//        String dateString=d2.format(date);
//        System.out.println(dateString);



    }
}
