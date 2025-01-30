package development;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class RevisaoIfElse_DesafiosJogos {
    public static void RIE_DJ_01(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int numB = sc.nextInt();
        if(numA < 0 && numB < 0) {
            System.out.print("Ambos são negativos.");
        }
        else if(numA > 0 && numB > 0) {
            System.out.print("Ambos são positivos.");
        }
        else {
            System.out.print("Os números são opostos.");
        }
    }

    public static void RIE_DJ_02(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int numB = sc.nextInt();
        if(numA == numB * 2) {
            System.out.print(numA + " é o dobro de " + numB);
        }
        else if(numB == numA * 2) {
            System.out.print(numB + " é o dobro de " + numA);
        }
        else {
            System.out.print("Não há dobro.");
        }
    }

    public static void RIE_DJ_03(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int drawn = rand.nextInt(5);
        System.out.print("Adivinhe o número secreto (0 a 5): ");
        int num = sc.nextInt();
        System.out.println("Número sorteado: " + drawn);
        if(drawn == num) {
            System.out.println("Parabéns! Você acertou.");
        }
        else {
            System.out.println("Sinto muito. Você errou.");
        }
    }

    public static void RIE_DJ_04(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int numB = sc.nextInt();
        System.out.print("Insira o terceiro número: ");
        int numC = sc.nextInt();
        int higher = numA;
        int middle = numB;
        int lesser = numC;
        if(numA >= numB && numA >= numC) {
            if(numB < numC) {
                middle = numC;
                lesser = numB;
            }
        } else if (numB >= numA && numB >= numC) {
            higher = numB;
            if(numA < numC) {
                middle = numC;
                lesser = numA;
            } else {
               middle = numA;
            }
        }
        else{
            higher = numC;
            if(numA < numB) {
                lesser = numA;
            }
            else{
                middle = numA;
                lesser = numB;
            }
        }
        System.out.print("Ordem crescente: ");
        System.out.print(lesser + ", " + middle + ", " + higher);
    }

    public static void RIE_DJ_05(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int drawn = rand.nextInt(10);
        System.out.print("Adivinhe o número de 0 a 10: ");
        int num = sc.nextInt();
        System.out.println("Número sorteado: " + drawn);
        if(drawn == num) {
            System.out.println("Parabéns! Você acertou.");
        }
        else {
            System.out.println("Sinto muito. Você errou.");
        }
    }
}
