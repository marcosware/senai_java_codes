package TryCatch;

import java.util.Locale;
import java.util.Scanner;

public class RaizQuadrada {
    double num, sqrt;

    public RaizQuadrada() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            this.num = sc.nextDouble();
            if(this.num < 0) {
                throw new IllegalArgumentException();
            }
            this.sqrt = Math.sqrt(this.num);
            System.out.printf("A raiz quadrada de %.2f é: %.2f\n", num, sqrt);
        } catch(IllegalArgumentException e) {
            System.out.print("Erro! Número negativo inserido.");
        }
    }
}
