import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        // Lưu ý:
        // MS window: \ => \\ Ví dụ "C:\\Thư muc\\Tentaptin.xxx;
        // Kiểm tra thu mực hoặc tập tin có tồn tại hay không?
        File folder1= new File("D:\\AKA\\TestFile");
        File folder2= new File("D:\\AKA\\TestFile\\DucNa");
        System.out.println("Kiểm tra folder1 có tồn tại hay không: "+ folder1.exists());
        System.out.println("Kiểm tra folder2 có tồn tại hay không: "+ folder2.exists());

        //Tạo thư mục: Phương thức mkdir()
        File folder3= new File("D:\\AKA\\TestFile\\DucNa");
        folder3.mkdir();

        //mrdirs: Tạo ra nhiều thư mục cùng lúc
        //Tạo tập tin(có phần mở rộng: exe, .txt, .doc, .xls...)
        File folder4= new File("D:\\AKA\\TestFile\\DucNa\\ViDu.txt");
        try {
            folder4.createNewFile();
        } catch (IOException e) {
           e.printStackTrace();
        }

    }
    }
