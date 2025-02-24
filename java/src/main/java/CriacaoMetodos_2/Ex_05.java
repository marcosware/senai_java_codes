package CriacaoMetodos_2;

import java.util.Scanner;

public class Ex_05 {
    // Referente à If Else Básicos - 01. Positivo ou negativo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date num = new Date();
        System.out.println("Insira um número: ");
        num.setYear(sc.nextInt());
        if (Date.isYearValid(num.getYear()) || num.getYear() == 0) {
            System.out.println("O número " + num.getYear() + " é positivo.");
        } else {
            System.out.println("O número " + num.getYear() + " é negativo.");
        }
        sc.close();
    }
}
