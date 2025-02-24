package Revisao_IfElse;

import java.util.Scanner;

public class Basicos {
    public static void RIE_B_01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println("O número " + num + " é positivo.");
        } else {
            System.out.println("O número " + num + " é negativo.");
        }
        sc.close();
    }

    public static void RIE_B_02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");
        }
    }

    public static void RIE_B_03() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int numB = sc.nextInt();
        if (numA > numB) {
            System.out.println("Maior número: " + numA);
        } else {
            System.out.println("Maior número: " + numB);
        }
    }

    public static void RIE_B_04() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int age = sc.nextInt();
        if (age >= 16) {
            System.out.println("Você já pode votar.");
        } else {
            System.out.println("Você não pode votar.");
        }
    }

    public static void RIE_B_05() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int numB = sc.nextInt();
        System.out.print("Insira o terceiro número: ");
        int numC = sc.nextInt();
        if (numA >= numB && numA >= numC) {
            System.out.println("Maior número: " + numA);
        } else if (numB >= numA && numB >= numC){
            System.out.println("Maior número: " + numB);
        } else{
            System.out.println("Maior número: " + numC);
        }
    }

    public static void RIE_B_06() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o ano: ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("O ano " + year + " é bissexto.");
        } else {
            System.out.println("O ano " + year + " não é bissexto.");
        }
    }

    public static void RIE_B_07() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número: ");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("O número " + num + " é múltiplo de cinco.");
        } else {
            System.out.println("O número " + num + " não é múltiplo de cinco.");
        }
    }

    public static void RIE_B_08() {
        Scanner sc = new Scanner(System.in);
        char[] vogals = {'a', 'e', 'i', 'o', 'u'};
        System.out.print("Insira o caractere: ");
        char character = sc.nextLine().charAt(0);
        int i = 0;
        boolean isVogal = false;
        while(i < vogals.length && !isVogal) {
            if(character == vogals[i]) {
                isVogal = true;
            }
            i++;
        }
        System.out.println("O caractere '" + character + "'");
        if(!isVogal) {
            System.out.println(" não");
        }
        System.out.println(" é vogal.");
    }

    public static void RIE_B_09() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número: ");
        int num = sc.nextInt();
        System.out.print("O número " + num);
        if (!(num >= 10 && num <= 50)) {
            System.out.print(" não");
        }
        System.out.print(" está entre o intervalo de 10 a 50.");
    }

    public static void RIE_B_10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número: ");
        int num = sc.nextInt();
        System.out.print("O número " + num);
        if (!(num >= 100 && num <= 200)) {
            System.out.print(" não");
        }
        System.out.print(" está entre o intervalo de 10 a 50.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a atividade que deseja executar");
        System.out.println("01 - Número positivo ou negativo.");
        System.out.println("02 - Número par ou ímpar.");
        System.out.println("03 - Maior número entre dois valores.");
        System.out.println("04 - Pessoa pode votar?");
        System.out.println("05 - Maior número entre três valores.");
        System.out.println("06 - Checagem de ano bissexto.");
        System.out.println("07 - Número múltiplo de cinco.");
        System.out.println("08 - Caractere vogal ou não.");
        System.out.println("09 - Número no intervalo 10 a 50.");
        System.out.println("10 - Número entre 100 e 200.");
        System.out.println("OPÇÃO: ");
        int option = sc.nextInt();
        switch (option){
            case 1:
                RIE_B_01();
                break;
            case 2:
                RIE_B_02();
                break;
            case 3:
                RIE_B_03();
                break;
            case 4:
                RIE_B_04();
                break;
            case 5:
                RIE_B_05();
                break;
            case 6:
                RIE_B_06();
                break;
            case 7:
                RIE_B_07();
                break;
            case 8:
                RIE_B_08();
                break;
            case 9:
                RIE_B_09();
                break;
            case 10:
                RIE_B_10();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Obrigado por testar o programa!");
        sc.close();
    }
}
