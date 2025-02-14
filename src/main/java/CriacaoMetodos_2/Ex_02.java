package CriacaoMetodos_2;

import java.util.Scanner;

public class Ex_02 {
    // Referente à If Else Datas e Horários - 02. Mês Válido

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date data = new Date(0, 0, 0);
        System.out.print("Insira um mês: ");
        data.setMonth(Date.readInt());
        boolean valid = Date.isMonthValid(data.getMonth());
        System.out.print("O mês " + data.getMonth());
        if(!valid) {
            System.out.print(" não");
        }
        System.out.print(" é válido.");
    }
}
