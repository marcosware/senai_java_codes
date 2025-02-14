package CriacaoMetodos_2;

import java.util.Scanner;

public class Ex_03 {
    // Referente à If Else Datas e Horários - 03. Dia do Mês Válido

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date data = new Date(0 , 0, 0);
        System.out.print("Dia: ");
        data.setDay(Date.readInt());
        System.out.print("Mês: ");
        data.setMonth(Date.readInt());
        System.out.print("Ano: ");
        data.setYear(Date.readInt());
        boolean valid = (Date.isDateValid(
                data.getDay(),
                data.getMonth(),
                data.getYear()
        ));
        System.out.print("O dia " + data.getDay());
        if (!valid) {
            System.out.print(" não");
        }
        System.out.print(" é válido.");
    }
}
