package Revisao_IfElse;

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void RIE_OM_01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int numA = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int numB = sc.nextInt();
        System.out.print("A soma de " + numA + " e " + numB);
        if(numA + numB < 100) {
            System.out.print(" não");
        }
        System.out.print(" é maior do que 100.");
    }

    public static void RIE_OM_02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int numA = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int numB = sc.nextInt();
        System.out.print("A diferença de " + numA + " e " + numB);
        if(numA - numB > 0) {
            System.out.print(" não");
        }
        System.out.print(" é negativa.");
    }

    public static void RIE_OM_03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int numA = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int numB = sc.nextInt();
        System.out.print("O número " + numA);
        if (numA % numB != 0) {
            System.out.print(" não");
        }
        System.out.print(" é divisível por " + numB + ".");
    }

    public static void RIE_OM_04() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro lado do triângulo: ");
        int sideA = sc.nextInt();
        System.out.println("Insira o segundo lado do triângulo");
        int sideB = sc.nextInt();
        System.out.println("Insira o terceiro lado do triângulo");
        int sideC = sc.nextInt();
        System.out.print("Os lados " + sideA + ", " + sideB + " e " + sideC);
        if(!(
                (sideA + sideB) > sideC &&
                (sideA + sideC) > sideB &&
                (sideB + sideC) > sideA))
        {
            System.out.print(" não");
        }
        System.out.print(" formam um triângulo válido.");
    }

    public static void RIE_OM_05() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número: ");
        int num = sc.nextInt();
        System.out.print("O número " + num);
        if (Math.pow(Math.sqrt(num), 2) != num) {
            System.out.print(" não");
        }
        System.out.println(" é um quadrado perfeito.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a atividade que deseja executar");
        System.out.println("01 - Soma de dois números maior que 100.");
        System.out.println("02 - Diferença negativa de dois números.");
        System.out.println("03 - Número divisível pelo outro.");
        System.out.println("04 - Três números formam um triângulo");
        System.out.println("05 - Número é quadrado perfeito.");
        System.out.println("OPÇÃO: ");
        int option = sc.nextInt();
        switch (option){
            case 1:
                RIE_OM_01();
                break;
            case 2:
                RIE_OM_02();
                break;
            case 3:
                RIE_OM_03();
                break;
            case 4:
                RIE_OM_04();
                break;
            case 5:
                RIE_OM_05();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Obrigado por testar o programa!");
        sc.close();
    }

}
