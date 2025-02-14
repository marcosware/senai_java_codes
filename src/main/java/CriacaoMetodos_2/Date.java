package CriacaoMetodos_2;

import java.util.Scanner;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        return(sc.nextInt());
    }

    public int getDay() {
        return(this.day);
    }

    public int getMonth() {
        return(this.month);
    }

    public int getYear() {
        return(this.year);
    }

    public static boolean isDayValid(int day, int month, int year) {
        int[] validDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean valid = false;
        if(isMonthValid(month) && isYearValid(year)) {
            if(isLeapYear(year)) {
                validDays[1] = 29;
            }
            valid = day > 0 && (day <= validDays[month-1]);
        }
        return(valid);
    }

    public static boolean isMonthValid(int month) {
        return month > 0 && month < 13;
    }

    public static boolean isYearValid(int year) {
        return year > 0;
    }

    public static boolean isDateValid(int day, int month, int year) {
        return(isDayValid(day, month, year) && isMonthValid(month) && isYearValid(year));
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void invalidMessage() {
        System.out.println("Data inválida. Por favor, insira novamente.");
    }

    public static void writeLeapYear(boolean isLeapYear, int year) {
        System.out.print("O ano " + year);
        if(!isLeapYear) {
            System.out.print(" não");
        }
        System.out.println(" é bissexto.");
    }

    public static boolean isLeapYear(int year) {
        return((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }
}
