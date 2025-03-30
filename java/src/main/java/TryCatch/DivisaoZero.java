package TryCatch;

import java.util.Scanner;

public class DivisaoZero {
    private int numA, numB;
    private int division;

    public DivisaoZero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        this.numA = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        this.numB = sc.nextInt();
        try{
            this.division = numA/numB;
            System.out.printf("A divisão de %d e %d é igual à %d\n", numA, numB, division);
        }catch(ArithmeticException e) {
            System.out.println("Erro! Divisão por zero.");
        }
    }
}
