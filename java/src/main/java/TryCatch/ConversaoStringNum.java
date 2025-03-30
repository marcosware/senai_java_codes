package TryCatch;

import java.util.Scanner;

public class ConversaoStringNum {
    private int num;

    public ConversaoStringNum() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Insira um valor numérico: ");
            this.num = Integer.parseInt(sc.next());
            System.out.println("Valor inserido: " + this.num);
        } catch(NumberFormatException e) {
            System.out.println("Erro! Valor não numérico inserido.");
        }
    }
}
