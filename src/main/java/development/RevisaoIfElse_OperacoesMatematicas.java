package development;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RevisaoIfElse_OperacoesMatematicas {
    public static void RIE_OM_01(String[] args) {
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

    public static void RIE_OM_02(String[] args) {
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

    public static void RIE_OM_03(String[] args) {
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

    public static void RIE_OM_04(String[] args) {
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

    public static void RIE_OM_05(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número: ");
        int num = sc.nextInt();
        System.out.print("O número " + num);
        if (Math.pow(Math.sqrt(num), 2) != num) {
            System.out.print(" não");
        }
        System.out.println(" é um quadrado perfeito.");
    }
}
