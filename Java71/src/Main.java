import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import com.opencsv.CSVWriter;




// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


//    public static void main(String[] args) {
//        String filePath="D:\\AKA\\TestFile\\DucNa\\file5.csv";
//
//        try  {
//            // Dữ liệu bạn muốn ghi vào tệp tin CSV
//            BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath) );
//
//            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
//                    .withHeader("FirstName", "LastName", "DOB"));
//
//            csvPrinter.printRecord("Nguyễn Anh Đức", "Đức", "13/05/1998");
//            csvPrinter.printRecord("Nguyễn Anh Đức", "Đức", "13/05/1998");
//            csvPrinter.flush();
//
//            System.out.println("Dữ liệu đã được ghi vào tệp tin CSV thành công.");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }

    public static void main(String[] args) {
        // Đường dẫn tới tệp tin CSV mà bạn muốn tạo
        String filePath = "D:\\AKA\\TestFile\\DucNa\\file7.csv"; // Sử dụng phần mở rộng .tsv cho tệp tin CSV ngăn cách bằng tab

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Dữ liệu bạn muốn ghi vào tệp tin CSV

            String[] header = {"FULLNAME", "MBNAME", "IDCODE","DBCODE","IDDATE","CUSTODYCD","SREXETYPE","EXECTYPE","TXDATE"	,"FEEAMT","TAXAMT",	"PV_SYMBOL"	,"MATCHAMT",	"MATCHAMTNR",	"MATCHAMTNS"};
            String[] record1 = {"1000000",	"1000000",	"0"	,"10000"	,"0"	,"0",	"2.34E+05",	"Khớp hết",	"Thông thường",	"-2500"	,"2500"	,"0"	,"0"	,"15180.56",	"2.56E+11",	"11/09/2023",	"Quỹ đầu tư"};
            String[] record2 = {"1000000",	"1000000",	"0"	,"10000"	,"0"	,"0",	"2.34E+05",	"Khớp hết",	"Thông thường",	"-2500"	,"2500"	,"0"	,"0"	,"15180.56",	"2.56E+11",	"11/09/2023",	"Quỹ đầu tư"};
            String[] record3 = {"3", "Bob Johnson", "35"};

            // Ghi tiêu đề cột
            writeLine(writer, header);

            // Ghi dữ liệu
            writeLine(writer, record1);
            writeLine(writer, record2);
            writeLine(writer, record3);

            System.out.println("Dữ liệu đã được ghi vào tệp tin CSV ngăn cách bằng tab thành công.");
        } catch (IOException e) {
            System.err.println("Xảy ra lỗi khi ghi dữ liệu vào tệp tin CSV: " + e.getMessage());
        }
    }

    private static void writeLine(BufferedWriter writer, String[] data) throws IOException {
        for (int i = 0; i < data.length; i++) {
            writer.write(data[i]);
            if (i < data.length - 1) {
                writer.write('\t'); // Sử dụng dấu tab để ngăn cách các trường
            }
        }
        writer.newLine(); // Xuống dòng sau mỗi dòng dữ liệu
    }

}