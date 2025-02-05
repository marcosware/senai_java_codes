package Revisao_ForDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_LacoFor {
    public static void RFDW_LF_01() {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d\n", i);
        }
    }

    public static void RFDW_LF_02() {
        for(int i = 10; i > 0; i--) {
            System.out.printf("%d\n", i);
        }
    }

    public static void RFDW_LF_03() {
        for(int i = 2; i <= 20; i+=2) {
            System.out.printf("%d\n", i);
        }
    }

    public static void RFDW_LF_04() {
        for(int i = 1; i <= 19; i+=2) {
            System.out.printf("%d\n", i);
        }
    }

    public static void RFDW_LF_05() {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.printf("%d\n", sum);
    }

    public static void RFDW_LF_06() {
        int sum = 0;
        for(int i = 2; i <= 100; i+=2) {
            sum += i;
        }
        System.out.printf("%d\n", sum);
    }

    public static void RFDW_LF_07() {
        int sum = 0;
        for(int i = 1; i <= 100; i+= 2) {
            sum += i;
        }
        System.out.printf("%d\n", sum);
    }

    public static void RFDW_LF_08() {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("7 * %d = %d\n", i, 7*i);
        }
    }

    public static void RFDW_LF_09() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }
    }

    public static void RFDW_LF_10() {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%dº múltiplo de 5: %d\n", i, i*5);
        }
    }

    public static void RFDW_LF_11() {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("Quadrado de %d: %d\n", i, i*i);
        }
    }

    public static void RFDW_LF_12() {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("Quadrado de %d: %d\n", i, i*i*i);
        }
    }

    public static void RFDW_LF_13() {
        int prev = 0;
        int act = 1;
        System.out.printf("%dº termo da sequência de Fibonacci: %d\n", 1, prev+act);
        for(int i = 2; i <= 10; i++) {
            int aux = prev;
            System.out.printf("%dº termo da sequência de Fibonacci: %d\n", i, prev+act);
            prev = act;
            act += aux;
        }
    }

    public static void RFDW_LF_14() {
        boolean prime = true;
        for(int i = 2; i <= 50; i++) {
            prime = true;
            for(int j = 2; j <= i/2; j++) {
                if(i % j == 0 && i != j) {
                    prime = false;
                }
            }
            if(prime) {
                System.out.printf("%d\n", i);
            }
        }
    }

    public static void RFDW_LF_15() {
        for(int i = 3; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz + Buzz");
            }
            else if(i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }

    public static void RFDW_LF_16() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i = 0; i < word.length(); i++) {
            System.out.printf("%c\n", word.charAt(i));
        }
    }

    public static void RFDW_LF_17() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i = word.length() - 1; i >= 0; i--) {
            System.out.printf("%c\n", word.charAt(i));
        }
    }

    public static void RFDW_LF_18() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String reverse = "";
        for(int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println("É palíndromo.");
        }
        else {
            System.out.println("Não é palíndromo.");
        }
    }

    public static void RFDW_LF_19() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fac = num;
        for(int i = num-1; i > 0; i--) {
            fac *= i;
        }
        System.out.printf("%d", fac);
    }

    public static void RFDW_LF_20() {
        for(int i = 5; i <= 50; i+=5) {
            System.out.printf("%d\n", i);
        }
    }

    public static void RFDW_LF_21() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int sum = 0;
        for(int i = 0; i < Integer.toString(num).length(); i++) {
            sum += Character.getNumericValue(Integer.toString(num).charAt(i));
        }
        System.out.printf("%d", sum);
    }

    public static void RFDW_LF_22() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%d\n", 1);
        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                System.out.printf("%d\n", i);
            }
        }
        if(num != 0 && num != 1) {
            System.out.printf("%d\n", num);
        }
    }

    public static void RFDW_LF_23() {
        for(int i = 1; i <= 200; i++) {
            if(i % 4 == 0) {
                System.out.printf("%d\n", i);
            }
        }
    }

    public static void RFDW_LF_24() {
        for(int i = 1; i <= 10; i++) {
            int triNum = (i * (i +1))/2;
            System.out.printf("%d\n", triNum);
        }
    }

    public static void RFDW_LF_25() {
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void RFDW_LF_26() {
        int blank = 5/2;
        int line = 1;
        int num = 1;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= blank; j++) {
                System.out.print("    ");
            }
            for(int k = 1; k <= line; k++) {
                if(num == 1) {
                    System.out.print("|0" + num * 5 + "|");
                }
                else{
                    System.out.print("|" + num * 5 + "|");
                }
                num++;
            }
            System.out.println();
            if(i <= 5/2) {
                blank--;
                line += 2;
            }
            else {
                blank++;
                line -= 2;
            }
        }
    }

    public static void RFDW_LF_27() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int qty = sc.nextInt();
        int nums[] = new int[qty];
        for(int i = 0; i < qty; i++) {
            System.out.print("Digite o " + (i+1) + "º valor do vetor: ");
            nums[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < qty; i++) {
            sum += nums[i];
        }
        System.out.println("Soma dos valores do vetor: " + sum);
    }

    public static void RFDW_LF_28() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int qty = sc.nextInt();
        int nums[] = new int[qty];
        for(int i = 0; i < qty; i++) {
            System.out.print("Digite o " + (i+1) + "º valor do vetor: ");
            nums[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int med = sum/qty;
        System.out.println("Média dos valores do vetor: " + med);
    }

    public static void RFDW_LF_29() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int qty = sc.nextInt();
        int nums[] = new int[qty];
        for(int i = 0; i < qty; i++) {
            System.out.print("Digite o " + (i+1) + "º valor do vetor: ");
            nums[i] = sc.nextInt();
        }
        int min, aux, pos;
        for(int i = 0; i < nums.length; i++) {
            min = nums[i];
            pos = i;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] < min) {
                    min = nums[j];
                    pos = j;
                }
            }
            aux = nums[i];
            nums[i] = min;
            nums[pos] = aux;
        }
        System.out.print("[ ");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("]");
    }

    public static void RFDW_LF_30() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int qty = sc.nextInt();
        int nums[] = new int[qty];
        for(int i = 0; i < qty; i++) {
            System.out.print("Digite o " + (i+1) + "º valor do vetor: ");
            nums[i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Há " + even + " números pares no vetor.");
        System.out.println("Há " + odd + " números ímpares no vetor.");
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCÍCIOS COM O LAÇO FOR\n");
        System.out.println("1. Escreva um programa que exiba os números de 1 a 10.\n");
        RFDW_LF_01();
        System.out.println();
        System.out.println("2. Exiba os números de 10 a 1.\n");
        RFDW_LF_02();
        System.out.println();
        System.out.println("3. Exiba os números pares de 2 a 20.\n");
        RFDW_LF_03();
        System.out.println();
        System.out.println("4. Exiba os números ímpares de 1 a 19.\n");
        RFDW_LF_04();
        System.out.println();
        System.out.println("5. Calcule a soma dos números de 1 a 100.\n");
        RFDW_LF_05();
        System.out.println();
        System.out.println("6. Calcule a soma dos números pares de 1 a 100.\n");
        RFDW_LF_06();
        System.out.println();
        System.out.println("7. Calcule a soma dos números ímpares de 1 a 100.\n");
        RFDW_LF_07();
        System.out.println();
        System.out.println("8. Exiba a tabuada do número 7.\n");
        RFDW_LF_08();
        System.out.println();
        System.out.println("9. Exiba a tabuada do número informado pelo usuário.\n");
        RFDW_LF_09();
        System.out.println();
        System.out.println("10. Exiba os primeiros 10 múltiplos de 5.\n");
        RFDW_LF_10();
        System.out.println();
        System.out.println("11. Exiba os quadrados dos números de 1 a 10.\n");
        RFDW_LF_11();
        System.out.println();
        System.out.println("12. Exiba os cubos dos números de 1 a 10.\n");
        RFDW_LF_12();
        System.out.println();
        System.out.println("13. Exiba os primeiros 10 termos da sequência de Fibonacci.\n");
        RFDW_LF_13();
        System.out.println();
        System.out.println("14. Verifique e exiba os números primos entre 1 e 50.\n");
        RFDW_LF_14();
        System.out.println();
        System.out.println("15. Exiba os números de 1 a 100, substituindo múltiplos de 3 por Fizz" +
                        "e múltiplos de 5 por Buzz.");
        RFDW_LF_15();
        System.out.println();
        System.out.println("16. Exiba os caracteres de uma string informada pelo usuário.");
        RFDW_LF_16();
        System.out.println();
        System.out.println("17. Exiba a string informada pelo usuário de trás para frente.");
        RFDW_LF_17();
        System.out.println();
        System.out.println("18. Verifique se uma string informada pelo usuário é um palíndromo.");
        RFDW_LF_18();
        System.out.println();
        System.out.println("19. Calcule o fatorial de um número informado pelo usuário.");
        RFDW_LF_19();
        System.out.println();
        System.out.println("20. Exiba os números de 1 a 50 pulando de 5 em 5.");
        RFDW_LF_20();
        System.out.println();
        System.out.println("21. Exiba a soma dos dígitos de um número informado pelo usuário.");
        RFDW_LF_21();
        System.out.println();
        System.out.println("22. Exiba os divisores de um número informado pelo usuário.");
        RFDW_LF_22();
        System.out.println();
        System.out.println("23. Exiba todos os números entre 1 e 200 que sejam divisíveis por 4.");
        RFDW_LF_23();
        System.out.println();
        System.out.println("24. Exiba a sequência de números triangulares até o décimo termo.");
        RFDW_LF_24();
        System.out.println();
        System.out.println("25. Gere um padrão de asteriscos em formato de triângulo com altura 5.");
        RFDW_LF_25();
        System.out.println();
        System.out.println("26. Exiba um losango de números com base 5.");
        RFDW_LF_26();
        System.out.println();
        System.out.println("27. Exiba a soma dos números de um vetor de inteiros.");
        RFDW_LF_27();
        System.out.println();
        System.out.println("28. Exiba a média dos números de um vetor de inteiros.");
        RFDW_LF_28();
        System.out.println();
        System.out.println("29. Ordene um vetor de inteiros em ordem crescente (utilizando o algoritmo de seleção).");
        RFDW_LF_29();
        System.out.println();
        System.out.println("30. Conte quantos números pares e ímpares existem em um vetor de inteiros.");
        RFDW_LF_30();
        System.out.println();
        sc.close();
    }
}
