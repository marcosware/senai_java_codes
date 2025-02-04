package Revisao_ForDoWhile;

import java.util.Arrays;
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

    public static void main(String args[]) {
        RFDW_LF_25();
    }
}
