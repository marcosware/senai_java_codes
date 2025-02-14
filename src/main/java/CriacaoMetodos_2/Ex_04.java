package CriacaoMetodos_2;

import java.util.Scanner;

public class Ex_04 {
    // Referente à If Else Datas e Horários - 05. Data entre Período

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date dataStart = new Date(0, 0, 0);
        boolean valid;
        do{
            System.out.print("Dia: ");
            dataStart.setDay(Date.readInt());
            System.out.print("Mês: ");
            dataStart.setMonth(Date.readInt());
            System.out.print("Ano: ");
            dataStart.setYear(Date.readInt());
            valid = Date.isDateValid(
                    dataStart.getDay(),
                    dataStart.getMonth(),
                    dataStart.getYear()
            );
            if(!valid) {
                Date.invalidMessage();
            }
        }while (!valid);
    }
}
