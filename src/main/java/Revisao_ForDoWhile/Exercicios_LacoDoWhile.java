package Revisao_ForDoWhile;

import java.util.Scanner;

public class Exercicios_LacoDoWhile {
    public static void RFDW_LDW_01(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Por favor, insira um número: ");
            num = sc.nextInt();
        }while(num >= 0);
        System.out.println("Número negativo inserido! Encerrando...");
    }

    public static void RFDW_LDW_02(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, sum = num;
        do{
            System.out.println("Por favor, insira um número: ");
            num = sc.nextInt();
            sum += num;
        }while(num != 0);
        System.out.println("Soma total: " + sum);
    }

    public static void RFDW_LDW_03(String[] args) {
        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num <= 10);
    }

    public static void RFDW_LDW_04(String[] args) {
        int num = 10;
        do{
            System.out.println(num);
            num--;
        }while(num > 0);
    }

    public static void RFDW_LDW_05(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, insira um número: ");
        int num = sc.nextInt();
        int mult = 1;
        do{
            System.out.println(num + " * " + mult + " = " + (num*mult));
            mult++;
        }while(mult <= 10);
    }

    public static void RFDW_LDW_06(String[] args) {
        int num = 0, sum = num;
        do{
            sum += num;
            num++;
        }while(num <= 50);
        System.out.println("Soma de 1 a 50: " + sum);
    }

    public static void RFDW_LDW_07(String[] args) {
        int num = 0;
        do{
            num += 2;
            System.out.println(num);
        }while(num < 20);
    }

    public static void RFDW_LDW_08(String[] args) {
        int num = 1;
        do{
            System.out.println(num);
            num += 2;
        }while(num < 20);
    }

    public static void RFDW_LDW_09(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Por favor, insira um número: ");
            num = sc.nextInt();
            if(num >= 0) {
                System.out.println(num);
            }
        }while(num >= 0);
        System.out.println("Número negativo inserido! Encerrando...");
    }

    public static void RFDW_LDW_10(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, qty = 0;
        do{
            System.out.println("Por favor, insira um número: ");
            num = sc.nextInt();
            if(num != 0) {
                qty++;
            }
        }while(num != 0);
        System.out.println("Zero inserido!\nVocê inseriu " + qty + " números antes dele.");
    }

    public static void RFDW_LDW_11(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int qty = 0;
        do{
            System.out.println(word.charAt(qty));
            qty++;
        }while(qty < word.length());
    }

    public static void RFDW_LDW_12(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int qty = word.length()-1;
        do{
            System.out.println(word.charAt(qty));
            qty--;
        }while(qty >= 0);
    }

    public static void RFDW_LDW_13(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, insira um número: ");
        int num = sc.nextInt();
        int sum = 0;
        int digit = 0;
        do{
            digit = num % 10;
            num /= 10;
            sum += digit;
        }while(num > 0);
        System.out.println("Soma dos dígitos: " + sum);
    }

    public static void RFDW_LDW_14(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, insira um número: ");
        int num = sc.nextInt();
        int div = 2;
        System.out.println("Divisores:\n1");
        do{
            if(num % div == 0) {
                System.out.println(div);
            }
            div++;
        }while(div <= (num/2));
        System.out.println(num);
    }

    public static void RFDW_LDW_15(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, insira um número: ");
        int num = sc.nextInt();
        int qty = 0;
        int prev = 0;
        int act = 1;
        do{
            System.out.println(act);
            int aux = prev;
            prev = act;
            act += aux;
            qty++;
        }while(qty < num);
    }

    public static void RFDW_LDW_16(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, insira um número: ");
        int num = sc.nextInt();
        int qty = 1;
        System.out.println("Múltiplos de " + num + ": ");
        do{
            System.out.println(num * qty);
            qty++;
        }while(qty <= 10);
    }

    public static void RFDW_LDW_17(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean prime = true;
        System.out.println("Por favor, insira um número: ");
        int num = sc.nextInt();
        int qty = 2;
        do{
            if(num % qty == 0) {
                prime = false;
            }
            qty++;
        }while(qty <= num/2);
        System.out.print("O número ");
        if(!prime) {
            System.out.print("não ");
        }
        System.out.println("é primo.");
    }

    public static void RFDW_LDW_18(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Por favor, insira um número: ");
            num = sc.nextInt();
            if(num % 2 == 0) {
                System.out.println("PAR\n");
            }
            else{
                System.out.println("IMPAR\n");
            }

        }while(num != 0);
        System.out.println("Zero inserido! Encerrando...");
    }

    public static void RFDW_LDW_19(String[] args) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "!@#$%&*0123456789";
        String password = "";
        do{
            int random = (int)(Math.random() * characters.length());
            password += characters.charAt(random);
        }while(password.length() < 6);
        System.out.println("Senha gerada: " + password);
    }

    public static void main(String[] args) {
        System.out.println("50");
    }
}
