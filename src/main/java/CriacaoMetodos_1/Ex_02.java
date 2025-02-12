package CriacaoMetodos_1;

import java.util.Scanner;

public class Ex_02 {
    // Referente à If Else Decisões Financeiras - 04. Produto Parcelado

    public static float readFloat() {
        Scanner sc = new Scanner(System.in);
        return(sc.nextFloat());
    }

    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        return(sc.nextInt());
    }

    public static float tenthWage(float wage) {
        return wage/10;
    }

    public static float installmentValue(float price, int installments) {
        return price/installments;
    }

    public static boolean affordable(float wage, float price, int installments) {
        return tenthWage(wage) > installmentValue(price, installments);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira seu salário: ");
        float wage = readFloat();
        System.out.print("Insira o valor do produto: ");
        float price = readFloat();
        System.out.println("Insira a quantidade de parcelas: ");
        int installments = readInt();
        System.out.print("Você ");
        if (!affordable(wage, price, installments)) {
            System.out.print("não ");
        }
        System.out.print("pode comprar este produto parcelado.");
        sc.close();
    }
}
