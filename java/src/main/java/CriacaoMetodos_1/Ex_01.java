package CriacaoMetodos_1;

import java.util.Scanner;

public class Ex_01 {
    // Referente à If Else Básicos - 06. Ano Bissexto

    public static int readYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ano: ");
        return(sc.nextInt());
    }

    public static boolean isLeapYear(int year) {
        return((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    public static void write(boolean is, int year) {
        System.out.print("O ano " + year);
        if(!is) {
            System.out.print(" não");
        }
        System.out.println(" é bissexto.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = readYear();
        boolean is = isLeapYear(year);
        write(is, year);
        sc.close();
    }
}
