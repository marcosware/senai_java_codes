package development;

import java.util.Scanner;

public class RevisaoIfElse_DecisoesFinanceiras {
    public static void RIE_DF_01() {
        Scanner sc = new Scanner(System.in);
        float balance = 2000;
        System.out.println("SALDO: R$" + balance);
        System.out.print("Insira o valor do saque: ");
        float withdrawal = sc.nextFloat();
        if (withdrawal <= balance) {
            balance -= withdrawal;
            System.out.printf("\nSacou R$%.2f com sucesso.", withdrawal);
            System.out.printf("SALDO: R$%.2f", balance);
        }
        else{
            System.out.print("Saldo insuficiente.");
        }
    }

    public static void RIE_DF_02() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor total da compra: ");
        float purchase = sc.nextFloat();
        if (purchase < 500) {
            purchase -= purchase / 10;
            System.out.println("Desconto de 10% aplicado.");
        }
        System.out.printf("Valor total: R$%.2f", purchase);
    }

    public static void RIE_DF_03() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira seu salário: ");
        float wage = sc.nextFloat();
        System.out.print("Você ");
        if (wage < 3000) {
            System.out.print("não ");
        }
        System.out.print("pode financiar um imóvel.");
    }

    public static void RIE_DF_04() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira seu salário: ");
        float wage = sc.nextFloat();
        System.out.print("Insira o valor do produto: ");
        float price = sc.nextFloat();
        System.out.println("Insira a quantidade de parcelas: ");
        int installments = sc.nextInt();
        System.out.print("Você ");
        if ((wage/10) < (price/installments)) {
            System.out.print("não ");
        }
        System.out.print("pode comprar este produto parcelado.");
    }

    public static void RIE_DF_05() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor da compra: ");
        float purchase = sc.nextFloat();
        System.out.print("Você ");
        if (purchase < 100) {
            System.out.print("não ");
        }
        System.out.print("atingiu o valor mínimo de compra para ganhar um brinde!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a atividade que deseja executar");
        System.out.println("01 - Saldo suficiente para saque.");
        System.out.println("02 - Cálculo de desconto em uma compra.");
        System.out.println("03 - Pessoa pode financiar imóvel.");
        System.out.println("04 - Pessoa pode comprar produto parcelado.");
        System.out.println("05 - Brinde do cliente por valor mínimo.");
        System.out.println("OPÇÃO: ");
        int option = sc.nextInt();
        switch (option){
            case 1:
                RIE_DF_01();
                break;
            case 2:
                RIE_DF_02();
                break;
            case 3:
                RIE_DF_03();
                break;
            case 4:
                RIE_DF_04();
                break;
            case 5:
                RIE_DF_05();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Obrigado por testar o programa!");
        sc.close();
    }
}
