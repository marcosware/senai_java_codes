package development;

import java.util.Scanner;

public class RevisaoIfElse_CategoriasClassificacoes {
    public static void RIE_CC_01() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a idade: ");
        int age = sc.nextInt();
        System.out.print("Classificação: ");
        if (age < 13) {
            System.out.print("CRIANÇA");
        }
        else if(age < 18) {
            System.out.print("ADOLESCENTE");
        }
        else if(age < 65) {
            System.out.print("ADULTO");
        }
        else{
            System.out.print("IDOSO");
        }
    }

    public static void RIE_CC_02() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = sc.nextInt();
        System.out.print("Classificação: ");
        if (num >  0 && num < 11) {
            System.out.print("A");
        }
        else if(num < 21) {
            System.out.print("B");
        }
        else if(num < 31) {
            System.out.print("C");
        }
        else{
            System.out.print("INVÁLIDO");
        }
    }

    public static void RIE_CC_03() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma altura: ");
        float height = sc.nextFloat();
        System.out.print("Classificação: ");
        if (height < 1.7) {
            System.out.print("Baixa");
        }
        else if(height < 1.8) {
            System.out.print("Média");
        }
        else{
            System.out.print("Alta");
        }
    }

    public static void RIE_CC_04() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a pressão arterial sistólica: ");
        int pressureA = sc.nextInt();
        System.out.print("Insira a pressão arterial diastólica: ");
        int pressureB = sc.nextInt();
        System.out.print("Nível de risco: ");
        if (pressureA < 129 && pressureB < 84) {
            System.out.print("Normal");
        }
        else if(pressureA < 160 || pressureB < 100) {
            System.out.print("Moderado");
        }
        else{
            System.out.print("Alto");
        }
    }

    public static void RIE_CC_05() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma temperatura: ");
        float temperature = sc.nextFloat();
        System.out.print("Ambiente: ");
        if (temperature < 20) {
            System.out.print("Frio");
        } else if (temperature < 30) {
            System.out.print("Agradável");
        } else {
            System.out.print("Quente");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a atividade que deseja executar");
        System.out.println("01 - Classificação de pessoa por idade.");
        System.out.println("02 - Faixa de classificação de um número.");
        System.out.println("03 - Classificação da altura da pessoa.");
        System.out.println("04 - Nível de risco por pressão arterial.");
        System.out.println("05 - Classificação de temperatura.");
        System.out.println("OPÇÃO: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                RIE_CC_01();
                break;
            case 2:
                RIE_CC_02();
                break;
            case 3:
                RIE_CC_03();
                break;
            case 4:
                RIE_CC_04();
                break;
            case 5:
                RIE_CC_05();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
            }
            System.out.println("Obrigado por testar o programa!");
            sc.close();
    }
}
