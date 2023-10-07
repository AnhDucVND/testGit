package Pheptoan;

import java.util.Objects;

public class MyDate {
    private int day,month,year;
    public MyDate(int d,int m, int y){
        this.day=d;;
        this.month=m;
        this.year=y;

    }
    public void printDay(){
       System.out.println("Day; "+ this.day);
    }
    public void printMonth(){
        System.out.println("Month : "+ this.month);
    }
    public void printYear(){
        System.out.println("Year: "+ this.year);
    }
    public void printDate(){
        System.out.println("Date : "+this.day+"-"+ this.month+"-"+ this.year);
    }

    public int getDay() {

        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day < 31) {
            this.day = day;
        }

    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/"+ month +"/" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;
        MyDate myDate = (MyDate) o;
        return getDay() == myDate.getDay() && getMonth() == myDate.getMonth() && getYear() == myDate.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getMonth(), getYear());
    }

    public static void main(String[] args) {
        MyDate md1=new MyDate(10,5,2023);
        MyDate md2=new MyDate(10,5,2023);
        MyDate md3=new MyDate(15,5,2023);
//        md.printDay();
//        md.printMonth();
//        md.printYear();
//        md.printDate();
        //System.out.println(md1.getDay());
        //md1.setDay(22);
        System.out.println(md1.getDay());
        System.out.println(md1);

        System.out.println(md1.equals(md2));
        System.out.println(md1.equals(md3));
        System.out.println(md1.hashCode());
        System.out.println(md2.hashCode());
        System.out.println(md3.hashCode());


    }
}
