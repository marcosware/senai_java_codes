package Revisao_IfElse;

import java.util.Scanner;

public class CondicoesStrings {
    public static void RIE_CS_01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira SIM ou NÃO: ");
        String word = sc.nextLine().toLowerCase();
        if (word.equals("sim")) {
            System.out.println("Foi inserido SIM.");
        }
        else if(word.equals("nao") || word.equals("não")) {
            System.out.println("Foi inserido NÃO.");
        }
        else{
            System.out.println("Não foi inserido nem SIM nem NÃO.");
        }
    }

    public static void RIE_CS_02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a senha: ");
        String password = sc.nextLine();
        System.out.print("A senha está ");
        if (!(password.equals("1234"))) {
            System.out.print("IN");
        }
        System.out.print("CORRETA.");
    }

    public static void RIE_CS_03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um nome: ");
        String name = sc.nextLine().toLowerCase();
        System.out.print("O nome ");
        if (name.charAt(0) != 'a') {
            System.out.print("não ");
        }
        System.out.print("começa com A.");
    }

    public static void RIE_CS_04() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra: ");
        String word = sc.nextLine();
        System.out.print("A palavra ");
        if (word.length() <= 5) {
            System.out.print("não ");
        }
        System.out.print("contém mais de 5 caracteres.");
    }

    public static void RIE_CS_05() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira palavra: ");
        String wordA = sc.nextLine().toLowerCase();
        System.out.println("Insira a segunda palavra: ");
        String wordB = sc.nextLine().toLowerCase();
        System.out.print("As palavras são ");
        if (wordA.equals(wordB)) {
            System.out.print("iguais.");
        }
        else{
            System.out.print("diferentes.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a atividade que deseja executar");
        System.out.println("01 - Palavra 'sim' ou 'não'.");
        System.out.println("02 - Senha correta.");
        System.out.println("03 - Nome começa com 'A'.");
        System.out.println("04 - Palavra com mais de 5 caracteres.");
        System.out.println("05 - Duas palavras iguais.");
        System.out.println("OPÇÃO: ");
        int option = sc.nextInt();
        switch (option){
            case 1:
                RIE_CS_01();
                break;
            case 2:
                RIE_CS_02();
                break;
            case 3:
                RIE_CS_03();
                break;
            case 4:
                RIE_CS_04();
                break;
            case 5:
                RIE_CS_05();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Obrigado por testar o programa!");
        sc.close();
    }
}
