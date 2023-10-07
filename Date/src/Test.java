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
        String dateStr="19/09/2023";
        DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        Date date=df.parse(dateStr);
        System.out.println(date);


//        Date date1=new Date();
        DateFormat d2= new SimpleDateFormat("yyyy-MM-dd");
        String dateString=d2.format(date);
        System.out.println(dateString);



    }
}
