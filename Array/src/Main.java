import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void min(int[] a){
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }


    public static void main(String[] args) {
        String[] arr={"Đức", "Khanh", "Hiền", "Linh"};
        int[] arr2= {1,2,4,5,4,56745,3,2};
        float[] arr3={2,7,5,3,9,3,4,1};
// Hiển thị giá trị phần tử trong mảng
//        System.out.println(arr[1]);
//        System.out.println(arr2[1]);
//        System.out.println(arr3[1]);
//        // Thay đổi phần tử trong mảng
//
//        arr[2]="Đức";
//        System.out.println(arr[2]);
//        // Độ dài trong mảng: .legth
//        System.out.println(" Độ dài của mảng arr "+arr.length);
        // Duyệt các phần tử trong mảng
        //1. Dùng vòng lặp for
//        for (int i=0;i<arr2.length;i++){
//            System.out.println("Phần tử thứ trong mảng arr2 là"+(i+1) +": "+ arr2[i]);
//        }

        //2 Dùng for-each
        //Arrays.sort(arr);
//        for (String number: arr) {
//            System.out.println(number);
//        }

        int[] a=new int[] {3,5,7,5,3,7,89,2,1};
        min(a);




    }


}