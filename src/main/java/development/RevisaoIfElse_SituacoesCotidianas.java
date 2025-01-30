package development;

import java.util.Scanner;

public class RevisaoIfElse_SituacoesCotidianas {
    public static void RIE_SC_01() {
        Scanner sc = new Scanner(System.in);
        String plate = "default";
        while(plate.length() != 8) {
            System.out.print("Insira a placa de carro (XXX-XXXX): ");
            plate = sc.nextLine();
            if(plate.length() != 8) {
                System.out.println("\nPlaca inválida!\n");
            }
        }
        if(Character.isAlphabetic(plate.charAt(7))) {
            System.out.println("Placa terminada em letra. Placa inválida!");
        }
        else if((Integer.parseInt(Character.toString(plate.charAt(7)))) % 2 == 0) {
            System.out.println("Placa terminada em par. Você pode passar no pedágio.");
        }
        else if((Integer.parseInt(Character.toString(plate.charAt(7)))) % 2 != 0) {
            System.out.println("Placa terminada em ímpar. Você não pode passar no pedágio.");
        }
    }

    public static void RIE_SC_02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o código de acesso: ");
        int code = sc.nextInt();
        System.out.print("O código de acesso está ");
        if (code != 1111) {
            System.out.print("IN");
        }
        System.out.print("CORRETO.");
    }

    public static void RIE_SC_03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a temperatura em Graus Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("\nEscolha a conversão: ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Celsius para Kelvin");
        int option = sc.nextInt();
        if (option == 1) {
            double fanrenheit = (celsius * 1.8) + 32;
            System.out.println("Graus Fahrenheit: " + fanrenheit);
        }
        else if(option == 2) {
            double kelvin = celsius + 273.15;
            System.out.println("Kelvin: " + kelvin);
        }
        else {
            System.out.println("Opção inválida.");
        }
    }

    public static void RIE_SC_04() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a idade: ");
        int age = sc.nextInt();
        System.out.print("Insira o peso: ");
        double weight = sc.nextDouble();
        System.out.print("A pessoa ");
        if(!(age >= 18 && age <= 65 && weight >= 50)) {
            System.out.print("não ");
        }
        System.out.print("está apta para doar sangue.");
    }

    public static void RIE_SC_05() {
        Scanner sc = new Scanner(System.in);
        System.out.print("USUÁRIO: ");
        String user = sc.nextLine();
        System.out.print("SENHA: ");
        String password = sc.nextLine();
        if(user.equals("Admin")) {
            if(password.equals("9876")) {
                System.out.println("Seja bem vindo Administrador do Sistema.");
            }
            else {
                System.out.println("Senha incorreta.");
            }
        }
        else {
            System.out.println("Usuário não cadastrado.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a atividade que deseja executar");
        System.out.println("01 - Veículo no pedágio por placa.");
        System.out.println("02 - Número correspondente ao código de acesso.");
        System.out.println("03 - Conversor de temperatura.");
        System.out.println("04 - Aptidão para doação sangue");
        System.out.println("05 - Sistema simples de autenticação.");
        System.out.println("OPÇÃO: ");
        int option = sc.nextInt();
        switch (option){
            case 1:
                RIE_SC_01();
                break;
            case 2:
                RIE_SC_02();
                break;
            case 3:
                RIE_SC_03();
                break;
            case 4:
                RIE_SC_04();
                break;
            case 5:
                RIE_SC_05();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Obrigado por testar o programa!");
        sc.close();
    }
}
