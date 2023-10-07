package Pheptoan;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int m,y ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập năm : ");
        y= sc.nextInt();
        System.out.println("Nhập tháng từ 1-12: ");
        m= sc.nextInt();
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            {
                System.out.println("Tháng "+m+" có 31 ngày");
                break;
            }
            case 2:{
                if ((y%4==0 && y%100 !=0) || (y%400==0)){
                    System.out.println("Năm "+y+" là năm nhuận");
                    System.out.println("Tháng "+m+" có 29 ngày");
                } else
                    {
                    System.out.println("Năm "+y+" không là năm nhuận");
                    System.out.println("Tháng "+m+" có 28 ngày");
                    }
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11:{
                System.out.println("Tháng "+m+" có 30 ngày");
                break;
            } default:
                System.out.println("Vui long nhập đúng định dạng tháng");
        }
    }
}
