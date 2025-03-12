package ExFixacao_TresProgramas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height:");
        float width = sc.nextFloat();
        float height = sc.nextFloat();
        Rectangle rect = new Rectangle(width, height);
        System.out.printf("AREA = %.2f\n", rect.Area());
        System.out.printf("PERIMETER = %.2f\n", rect.Perimeter());
        System.out.printf("DIAGONAL = %.2f\n", rect.Diagonal());
    }
}
