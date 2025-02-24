package EAD_ListasMatrizesForEach;

import java.util.Random;
import java.util.Scanner;

public class Exercicios_ListasMatrizesForEach {
    public static void EDP_LMFE_01() {
        int[] list = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o valor nº %d: ", i+1);
            list[i] = sc.nextInt();
        }
        System.out.print("Lista dos números inseridos: ");
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void EDP_LMFE_02() {
        int[] list = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o valor nº %d: ", i+1);
            list[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.print("Soma dos números inseridos: " + sum);
    }

    public static void EDP_LMFE_03() {
        int[] list = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o valor nº %d: ", i+1);
            list[i] = sc.nextInt();
        }
        int med = 0;
        for(int i : list) {
            med += i;
        }
        med /= list.length;
        System.out.print("Média dos números inseridos: " + med);
    }

    public static void EDP_LMFE_04() {
        int[] list = new int[10];
        Random rand = new Random();
        for(int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(100);
            list[i] += 1;
        }
        int min = list[0];
        int max = list[0];
        for(int i : list) {
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }
        System.out.println("Menor número gerado na lista: " + min);
        System.out.println("Maior número gerado na lista: " + max);
    }

    public static void EDP_LMFE_05() {
        int[] list = new int[10];
        boolean is = false;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(100);
            list[i] += 1;
        }
        System.out.print("Insira o número a ser pesquisado: ");
        int search = sc.nextInt();
        for(int i : list) {
            if(i == search) {
                is = true;
                i = list.length;
            }
        }
        System.out.print("O número " + search);
        if(!is) {
            System.out.print(" não");
        }
        System.out.print(" está presente na lista.");
    }

    public static void EDP_LMFE_06() {
        int[] list = new int[10];
        Random rand = new Random();
        for(int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(100);
            list[i] += 1;
        }
        for(int i = 0; i < list.length; i++) {
            if(list[i] % 2 != 0) {
                list[i] = 0;
            }
        }
        System.out.print("Lista sem ímpares: ");
        for(int i : list) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void EDP_LMFE_07() {
        int[] list = new int[8];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o valor nº %d: ", i+1);
            list[i] = sc.nextInt();
        }
        for(int i = 0; i < list.length; i++) {
            for(int j = i+1; j < list.length ; j++) {
                if(list[i] > list[j]) {
                    int aux = list[j];
                    list[j] = list[i];
                    list[i] = aux;
                }
            }
        }

        System.out.print("Lista ordenada dos números inseridos: ");
        for(int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void EDP_LMFE_08() {
        String[] list = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o nome nº %d: ", i+1);
            list[i] = sc.nextLine();
        }
        for(int i = 0; i < list.length; i++) {
            for(int j = i+1; j < list.length; j++) {
                int k = 0;
                do{
                    if(list[i].charAt(k) == list[j].charAt(k)) {
                        if(k < list[i].length() - 1) {
                            k++;
                        }
                    }
                    if(list[i].charAt(k) > list[j].charAt(k)) {
                        String aux = list[j];
                        list[j] = list[i];
                        list[i] = aux;
                    }
                }while(list[i].charAt(k) == list[j].charAt(k)
                && (k != list[i].length() - 1));
            }
        }

        System.out.print("Lista ordenada dos nomes inseridos: ");
        for(String i : list) {
            System.out.print(i + " ");
        }
    }

    public static void EDP_LMFE_09() {
        String[] list = new String[7];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o nome nº %d: ", i+1);
            list[i] = sc.nextLine();
        }
        System.out.print("Lista inversa dos nomes inseridos:\n");
        for(int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }

    public static void EDP_LMFE_10() {
        int[] listA = new int[5];
        int[] listB = new int[5];
        int[] listC = new int[listA.length + listB.length];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < listA.length; i++) {
            System.out.printf("Insira o valor nº %d da lista 1: ", i+1);
            listA[i] = sc.nextInt();
        }
        System.out.println();
        for(int i = 0; i < listB.length; i++) {
            System.out.printf("Insira o valor nº %d da lista 2: ", i+1);
            listB[i] = sc.nextInt();
        }
        for(int i = 0; i < listC.length/2; i++) {
            listC[i] = listA[i];
            listC[i+5] = listB[i];
        }
        System.out.print("Junção das listas: ");
        for(int i : listC) {
            System.out.print(i + " ");
        }
    }

    public static void EDP_LMFE_11() {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.printf("Insira o valor de [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz dos números inseridos: ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.print("[");
                if(array[i][j] < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void EDP_LMFE_12() {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.printf("Insira o valor de [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Soma dos números inseridos na matriz: " + sum);
    }

    public static void EDP_LMFE_13() {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.printf("Insira o valor de [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        int max = array[0][0];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Maior número da matriz: " + max);
    }

    public static void EDP_LMFE_14() {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.printf("Insira o valor de [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("Soma da diagonal principal da matriz: " + sum);
    }

    public static void EDP_LMFE_15() {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.printf("Insira o valor de [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if((i+j) == array.length - 1) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal secundária da matriz: " + sum);
    }

    public static void EDP_LMFE_16() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o tamanho da matriz: ");
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(50);
                array[i][j] += 1;
            }
        }
        System.out.println("Matriz dos números gerados: ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.print("[");
                if(array[i][j] < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void EDP_LMFE_17() {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.printf("Insira o valor de [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.print("Insira o valor do número escalar: ");
        int mult = sc.nextInt();
        System.out.println("Matriz escalada dos números inseridos: ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] *= mult;
                System.out.print("[");
                if(array[i][j] < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void EDP_LMFE_18() {
        Random rand = new Random();
        int[][] array = new int[4][4];
        int med = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(50);
                array[i][j] += 1;
                med += array[i][j];
                System.out.print("[");
                if(array[i][j] < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", array[i][j]);
            }
            System.out.println();
        }
        med /= 16;
        System.out.println("Média dos números gerados na matriz: " + med);
    }

    public static void EDP_LMFE_19() {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.printf("Insira o valor de [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz transposta dos números inseridos: ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.print("[");
                if(array[j][i] < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", array[j][i]);
            }
            System.out.println();
        }
    }

    public static void EDP_LMFE_20() {
        Random rand = new Random();
        int[][] array = new int[4][4];
        for(int i = 0; i < array.length; i++) {
            int sum = 0;
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(50);
                array[i][j] += 1;
                sum += array[i][j];
                System.out.print("[");
                if(array[i][j] < 10) {
                    System.out.print("00");
                }
                else if(array[i][j] < 100) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", array[i][j]);
            }
            System.out.print(" = [");
            if(sum < 10) {
                System.out.print("00");
            }
            else if(sum < 100) {
                System.out.print("0");
            }
            System.out.printf("%d] \n", sum);
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print("  v   ");
        }
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            int sum = 0;
            for(int j = 0; j < array[0].length; j++) {
                sum += array[j][i];
            }
            System.out.print("[");
            if(sum < 10) {
                System.out.print("00");
            }
            else if(sum < 100) {
                System.out.print("0");
            }
            System.out.printf("%d] ", sum);
        }
    }

    public static void EDP_LMFE_21() {
        int[] list = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o valor nº %d: ", i+1);
            list[i] = sc.nextInt();
        }
        System.out.print("Lista dos números inseridos: ");
        for(int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void EDP_LMFE_22() {
        int[] list = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o valor nº %d: ", i+1);
            list[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i : list) {
            sum += i;
        }
        System.out.print("Soma dos números inseridos: " + sum);
    }

    public static void EDP_LMFE_23() {
        int[] list = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o valor nº %d: ", i+1);
            list[i] = sc.nextInt();
        }
        System.out.print("Insira o valor do número escalar: ");
        int mult = sc.nextInt();
        System.out.print("Lista escalada dos números inseridos: ");
        for(int i : list) {
            i *= mult;
            System.out.print(i + " ");
        }
    }

    public static void EDP_LMFE_24() {
        int[] list = new int[10];
        Random rand = new Random();
        for(int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(100);
            list[i] += 1;
        }
        System.out.print("Lista dos pares: ");
        for(int i : list) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void EDP_LMFE_25() {
        String[] list = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < list.length; i++) {
            System.out.printf("Insira o nome nº %d: ", i+1);
            list[i] = sc.nextLine();
        }
        for(String name : list) {
            System.out.println("Olá, " + name + "!");
        }
    }

    public static void EDP_LMFE_26() {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.printf("Insira o valor de [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        for(int[] i : array) {
            for(int j : i) {
                System.out.print("[");
                if(j < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", j);
            }
            System.out.println();
        }
    }

    public static void EDP_LMFE_27() {
        Random rand = new Random();
        int[][] array = new int[4][4];
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(50);
                array[i][j] += 1;
                System.out.print("[");
                if(array[i][j] < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", array[i][j]);
            }
            System.out.println();
        }
        for(int[] i : array) {
            for(int j : i) {
                sum += j;
            }
        }
        System.out.println("A soma dos valores da matriz: " + sum);
    }

    public static void EDP_LMFE_28() {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.printf("Insira o valor de [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        int max = array[0][0];
        for(int[] i : array) {
            for(int j : i) {
                System.out.print("[");
                if(j < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", j);
                if(j > max) {
                    max = j;
                }
            }
            System.out.println();
        }
        System.out.println("Maior valor da matriz: " + max);
    }

    public static void EDP_LMFE_29() {
        Random rand = new Random();
        int[][] array = new int[4][4];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(50);
                array[i][j] += 1;
                System.out.print("[");
                if(array[i][j] < 10) {
                    System.out.print("00");
                }
                else if(array[i][j] < 100) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", array[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print("  v   ");
        }
        System.out.println();
        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int[] j : array) {
                sum += j[i];
            }
            System.out.print("[");
            if (sum < 10) {
                System.out.print("00");
            } else if (sum < 100) {
                System.out.print("0");
            }
            System.out.printf("%d] ", sum);
        }
    }

    public static void EDP_LMFE_30() {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.printf("Insira o valor de [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz com os números negativos substituídos por zero: ");
        for(int[] i : array) {
            for(int j : i) {
                System.out.print("[");
                if(j < 0) {
                    j = 0;
                }
                if(j < 10) {
                    System.out.print("0");
                }
                System.out.printf("%d] ", j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Digite a atividade a ser executada (1-30): ");
            choice = sc.nextInt();
            if(choice < 1 || choice > 30) {
                System.out.println("Opção inválida. Tente novamente.\n");
            }
        }while(choice < 1 || choice > 30);
        switch (choice) {
            case 1:
                EDP_LMFE_01();
                break;
            case 2:
                EDP_LMFE_02();
                break;
            case 3:
                EDP_LMFE_03();
                break;
            case 4:
                EDP_LMFE_04();
                break;
            case 5:
                EDP_LMFE_05();
                break;
            case 6:
                EDP_LMFE_06();
                break;
            case 7:
                EDP_LMFE_07();
                break;
            case 8:
                EDP_LMFE_08();
                break;
            case 9:
                EDP_LMFE_09();
                break;
            case 10:
                EDP_LMFE_10();
                break;
            case 11:
                EDP_LMFE_11();
                break;
            case 12:
                EDP_LMFE_12();
                break;
            case 13:
                EDP_LMFE_13();
                break;
            case 14:
                EDP_LMFE_14();
                break;
            case 15:
                EDP_LMFE_15();
                break;
            case 16:
                EDP_LMFE_16();
                break;
            case 17:
                EDP_LMFE_17();
                break;
            case 18:
                EDP_LMFE_18();
                break;
            case 19:
                EDP_LMFE_19();
                break;
            case 20:
                EDP_LMFE_20();
                break;
            case 21:
                EDP_LMFE_21();
                break;
            case 22:
                EDP_LMFE_22();
                break;
            case 23:
                EDP_LMFE_23();
                break;
            case 24:
                EDP_LMFE_24();
                break;
            case 25:
                EDP_LMFE_25();
                break;
            case 26:
                EDP_LMFE_26();
                break;
            case 27:
                EDP_LMFE_27();
                break;
            case 28:
                EDP_LMFE_28();
                break;
            case 29:
                EDP_LMFE_29();
                break;
            case 30:
                EDP_LMFE_30();
                break;
        }
    }
}
