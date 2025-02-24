package Revisao_ForDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_LacoDoWhile {
    public static void RFDW_LDW_01() {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Por favor, insira um número: ");
            num = sc.nextInt();
        }while(num >= 0);
        System.out.println("Número negativo inserido! Encerrando...");
    }

    public static void RFDW_LDW_02() {
        Scanner sc = new Scanner(System.in);
        int num = 0, sum = num;
        do{
            System.out.print("Por favor, insira um número: ");
            num = sc.nextInt();
            sum += num;
        }while(num != 0);
        System.out.println("Soma total: " + sum);
    }

    public static void RFDW_LDW_03() {
        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num <= 10);
    }

    public static void RFDW_LDW_04() {
        int num = 10;
        do{
            System.out.println(num);
            num--;
        }while(num > 0);
    }

    public static void RFDW_LDW_05() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, insira um número: ");
        int num = sc.nextInt();
        int mult = 1;
        do{
            System.out.println(num + " * " + mult + " = " + (num*mult));
            mult++;
        }while(mult <= 10);
    }

    public static void RFDW_LDW_06() {
        int num = 0, sum = num;
        do{
            sum += num;
            num++;
        }while(num <= 50);
        System.out.println("Soma de 1 a 50: " + sum);
    }

    public static void RFDW_LDW_07() {
        int num = 0;
        do{
            num += 2;
            System.out.println(num);
        }while(num < 20);
    }

    public static void RFDW_LDW_08() {
        int num = 1;
        do{
            System.out.println(num);
            num += 2;
        }while(num < 20);
    }

    public static void RFDW_LDW_09() {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Por favor, insira um número: ");
            num = sc.nextInt();
            if(num >= 0) {
                System.out.println(num);
            }
        }while(num >= 0);
        System.out.println("Número negativo inserido! Encerrando...");
    }

    public static void RFDW_LDW_10() {
        Scanner sc = new Scanner(System.in);
        int num, i = 0;
        do{
            System.out.print("Por favor, insira um número: ");
            num = sc.nextInt();
            if(num != 0) {
                i++;
            }
        }while(num != 0);
        System.out.println("Zero inserido!\nVocê inseriu " + i + " números antes dele.");
    }

    public static void RFDW_LDW_11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite uma palavra: ");
        String word = sc.nextLine();
        int i = 0;
        do{
            System.out.println(word.charAt(i));
            i++;
        }while(i < word.length());
    }

    public static void RFDW_LDW_12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite uma palavra: ");
        String word = sc.nextLine();
        int i = word.length()-1;
        do{
            System.out.println(word.charAt(i));
            i--;
        }while(i >= 0);
    }

    public static void RFDW_LDW_13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, insira um número: ");
        int num = sc.nextInt(), sum = 0, digit;
        do{
            digit = num % 10;
            num /= 10;
            sum += digit;
        }while(num > 0);
        System.out.println("Soma dos dígitos: " + sum);
    }

    public static void RFDW_LDW_14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, insira um número: ");
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

    public static void RFDW_LDW_15() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, insira um número: ");
        int num = sc.nextInt();
        int i = 0;
        int prev = 0;
        int act = 1;
        do{
            System.out.println(act);
            int aux = prev;
            prev = act;
            act += aux;
            i++;
        }while(i < num);
    }

    public static void RFDW_LDW_16() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, insira um número: ");
        int num = sc.nextInt();
        int i = 1;
        System.out.println("Múltiplos de " + num + ": ");
        do{
            System.out.println(num * i);
            i++;
        }while(i <= 10);
    }

    public static void RFDW_LDW_17() {
        Scanner sc = new Scanner(System.in);
        boolean prime = true;
        System.out.print("Por favor, insira um número: ");
        int num = sc.nextInt();
        int i = 2;
        do{
            if(num % i == 0) {
                prime = false;
                i = num/2;
            }
            i++;
        }while(i <= num/2);
        System.out.print("O número ");
        if(!prime) {
            System.out.print("não ");
        }
        System.out.println("é primo.");
    }

    public static void RFDW_LDW_18() {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Por favor, insira um número: ");
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

    public static void RFDW_LDW_19() {
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

    public static void RFDW_LDW_20() {
        Scanner sc = new Scanner(System.in);
        String password = "password123";
        String answer;
        do{
            System.out.print("Insira a senha: ");
            answer = sc.nextLine();
            if(!answer.equals(password)) {
                System.out.println("Senha incorreta. Tente novamente!");
            }
        }while(!answer.equals(password));
        System.out.println("Seja bem vindo usuário.");
    }

    public static void RFDW_LDW_21() {
        int i = 1;
        long num = 2;
        do{
            int j = 1;
            int sum = 0;
            do{
                if(num % j == 0) {
                    sum += j;
                }
                j++;
            }while(j <= (num/2));
            if(sum == num) {
                System.out.println(num);
                i++;
            }
            num++;
        }while(i <= 4);
        System.out.println("...\nAlgoritmo intratável.");
    }

    public static void RFDW_LDW_22() {
        int i = 1;
        int num = 2;
        do{
            int j = 2;
            boolean prime = true;
            do{
                if(num % j == 0 && num != j) {
                    prime = false;
                    j = num/2;
                }
                j++;
            }while(j <= (num/2));
            if(prime) {
                System.out.println(num);
                i++;
            }
            num++;
        }while(i <= 10);
    }

    public static void RFDW_LDW_23() {
        int i = 1;
        do{
            int j = 1;
            int num = 0;
            do{
                num += j;
                j++;
            }while(j <= i);
            i++;
            System.out.println(num);
        }while(i <= 10);
    }

    public static void RFDW_LDW_24() {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Por favor, insira um número: ");
            num = sc.nextInt();
            System.out.println("Raiz quadrada: " + Math.sqrt(num));
        }while(num >= 0);
        System.out.println("Número negativo inserido! Encerrando...");
    }

    public static void RFDW_LDW_25() {
        int i = 1;
        int num = 0;
        do{
            int j = 1;
            do{
                num += 5;
                System.out.print(num + " ");
                j++;
            }while(j <= i);
            System.out.println();
            i++;
        }while(i <= 5);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCÍCIOS COM O LAÇO DO WHILE\n");
        System.out.println("1. Peça para o usuário digitar um número e continue pedindo até que " +
                        "ele informe um número negativo.\n");
        RFDW_LDW_01();
        System.out.println();
        System.out.println("2. Solicite números ao usuário e some-os até que o usuário digite zero.\n");
        RFDW_LDW_02();
        System.out.println();
        System.out.println("3. Exiba os números de 1 a 10 usando do while.\n");
        RFDW_LDW_03();
        System.out.println();
        System.out.println("4. Exiba os números de 10 a 1 usando do while.\n");
        RFDW_LDW_04();
        System.out.println();
        System.out.println("5. Exiba a tabuada do número informado pelo usuário usando do while.\n");
        RFDW_LDW_05();
        System.out.println();
        System.out.println("6. Calcule a soma dos números de 1 a 50 usando do while.\n");
        RFDW_LDW_06();
        System.out.println();
        System.out.println("7. Exiba os números pares de 1 a 20 usando do while.\n");
        RFDW_LDW_07();
        System.out.println();
        System.out.println("8. Exiba os números ímpares de 1 a 20 usando do while.\n");
        RFDW_LDW_08();
        System.out.println();
        System.out.println("9. Solicite números ao usuário e exiba apenas os positivos, parando quando for negativo.\n");
        RFDW_LDW_09();
        System.out.println();
        System.out.println("10. Conte e exiba quantos números foram digitados antes de o usuário digitar zero.\n");
        RFDW_LDW_10();
        System.out.println();
        System.out.println("11. Exiba os caracteres de uma string informada pelo usuário usando do while.\n");
        RFDW_LDW_11();
        System.out.println();
        System.out.println("12. Exiba uma string informada pelo usuário de trás para frente usando do while.\n");
        RFDW_LDW_12();
        System.out.println();
        System.out.println("13. Calcule a soma dos dígitos de um número informado pelo usuário usando do while.\n");
        RFDW_LDW_13();
        System.out.println();
        System.out.println("14. Exiba os divisores de um número informado pelo usuário usando do while.\n");
        RFDW_LDW_14();
        System.out.println();
        System.out.println("15. Gere a sequência de Fibonacci até um valor máximo informado pelo usuário.\n");
        RFDW_LDW_15();
        System.out.println();
        System.out.println("16. Exiba os primeiros 10 múltiplos de um número informado pelo usuário usando do while.");
        RFDW_LDW_16();
        System.out.println();
        System.out.println("17. Verifique se um número informado pelo usuário é primo usando do while.");
        RFDW_LDW_17();
        System.out.println();
        System.out.println("18. Solicite um número e informe se é par ou ímpar, repetindo até que seja digitado zero.");
        RFDW_LDW_18();
        System.out.println();
        System.out.println("19. Gere uma senha aleatória de 6 caracteres usando do while.");
        RFDW_LDW_19();
        System.out.println();
        System.out.println("20. Solicite a senha do usuário e continue pedindo até que ele digite a correta.");
        RFDW_LDW_20();
        System.out.println();
        System.out.println("21. Exiba os primeiros 10 números perfeitos usando do while.");
        RFDW_LDW_21();
        System.out.println();
        System.out.println("22. Exiba os primeiros 10 números primos usando do while.");
        RFDW_LDW_22();
        System.out.println();
        System.out.println("23. Exiba a sequência de números triangulares até o décimo termo usando do while.");
        RFDW_LDW_23();
        System.out.println();
        System.out.println("24. Solicite um número ao usuário e exiba sua raiz quadrada, repetindo até que o " +
                "número informado seja negativo.");
        RFDW_LDW_24();
        System.out.println();
        System.out.println("25. Exiba um triângulo de números com base 5 usando do while.");
        RFDW_LDW_25();
        System.out.println();
        sc.close();
    }
}
