package Pheptoan;

import java.util.Scanner;

public class Vd {
    public static void main(String[] args) {
        double a,b,c, delta,x, x1,x2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập a: ");
        a= sc.nextInt();
        System.out.println("Nhập b: ");
        b= sc.nextInt();
        System.out.println("Nhập c: ");
        c= sc.nextInt();
        delta= Math.pow(b,2)-4*a*c;
        System.out.println("Delta:"+delta);
        if (a==0){
            System.out.println(" Không phải là phương trình bậc 2 ");
        } else
        {

            if (delta<0){
                System.out.println(" Phương trình vô nghiệm");
            } else if (delta==0){
                x= -b/(2*a);
                System.out.println(" Phương trình có nghiệm kép là x1=x2= "+ x);
            } else  {
                x1=(-b+ Math.sqrt(delta))/(2*a);
                x2=(-b- Math.sqrt(delta))/(2*a);
                System.out.println("Phương trình có 2 nghiệm");
                System.out.println("x1 là "+x1);
                System.out.println("x2 là "+x2);


            }
        }
    }
}
