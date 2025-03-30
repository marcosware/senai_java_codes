package TryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcMediaNotas {
    double gradeA, gradeB, gradeC, avg;

    public CalcMediaNotas() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Primeira nota: ");
            this.gradeA = sc.nextDouble();
            System.out.print("Segunda nota: ");
            this.gradeB = sc.nextDouble();
            System.out.print("Terceira nota: ");
            this.gradeC = sc.nextDouble();
            this.avg = (gradeA+gradeB+gradeC)/3;
            System.out.printf("\nMédia: %.2f\n", avg);
        } catch(InputMismatchException e) {
            System.out.println("Erro! Valor não numérico inserido.");
        }
    }
}
