package development;

import java.util.Scanner;

public class RevisaoIfElse_CondicoesStrings {
    public static void RIE_CS_01(String[] args) {
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

    public static void RIE_CS_02(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a senha: ");
        String password = sc.nextLine();
        System.out.print("A senha está ");
        if (!(password.equals("1234"))) {
            System.out.print("IN");
        }
        System.out.print("CORRETA.");
    }

    public static void RIE_CS_03(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um nome: ");
        String name = sc.nextLine().toLowerCase();
        System.out.print("O nome ");
        if (name.charAt(0) != 'a') {
            System.out.print("não ");
        }
        System.out.print("começa com A.");
    }

    public static void RIE_CS_04(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra: ");
        String word = sc.nextLine();
        System.out.print("A palavra ");
        if (word.length() <= 5) {
            System.out.print("não ");
        }
        System.out.print("contém mais de 5 caracteres.");
    }

    public static void RIE_CS_05(String[] args) {
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
}
