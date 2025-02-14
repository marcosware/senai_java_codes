package CriacaoMetodos_2;

import java.util.Scanner;

public class Ex_01 {
    // Referente à If Else Básicos - 06. Ano Bissexto

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date data = new Date(0, 0, 0);
        boolean valid, leapYear;
        int year;
        do{
            System.out.print("Insira um ano: ");
            year = Date.readInt();
            valid = Date.isYearValid(year);
            if(!valid) {
                Date.invalidMessage();
            }
        }while(!valid);
        data.setYear(year);
        leapYear = Date.isLeapYear(data.getYear());
        Date.writeLeapYear(leapYear, data.getYear());
        sc.close();
    }
}
