package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaDoisNum {
    int numA, numB, sum;

    public SomaDoisNum() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Insira o primeiro número: ");
            this.numA = sc.nextInt();
            System.out.print("Insira o segundo número: ");
            this.numB = sc.nextInt();
            this.sum = numA + numB;
            System.out.printf("A soma de %d mais %d é igual a %d\n", numA, numB, sum);
        } catch(InputMismatchException e) {
            System.out.println("Erro! Valor não numérico inserido.");
        }
    }
}
