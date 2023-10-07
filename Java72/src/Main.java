import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File file=new File("D:\\AKA\\TestFile\\DucNa.file.txt");
//        try {
//            BufferedReader br= Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
//            String line=null;
//            while (true){
//                line= br.readLine();
//                if (line==null){
//                 break;
//                }else {
//                    System.out.println(line);}
//            }
//
//        } catch (Exception e){
//            e.printStackTrace();
            try {
                List<String> File=Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
                for (String line: File) {
                    System.out.println(line);

                }

            }catch (Exception e){
                e.printStackTrace();



        }
    }
}