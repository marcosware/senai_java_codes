package RevisaoMath_ExpressoesAritmeticas;

public class Exercicios_MathSqrt {

    public static void CalcPrint(double rooting, int decimalCases) {
        switch (decimalCases) {
            case 0:
                System.out.printf("Resultado: %.0f\n\n", Math.sqrt(rooting));
                break;
            case 1:
                System.out.printf("Resultado: %.1f\n\n", Math.sqrt(rooting));
                break;
            case 2:
                System.out.printf("Resultado: %.2f\n\n", Math.sqrt(rooting));
                break;
            case 3:
                System.out.printf("Resultado: %.3f\n\n", Math.sqrt(rooting));
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("EXERCÍCIOS PARA MATH.SQRT\n");
        System.out.println("1. Calcule a raiz quadrada de 16.");
        CalcPrint(16, 0);
        System.out.println("2. Determine a raiz quadrada de 81.");
        CalcPrint(81, 0);
        System.out.println("3. Encontre a raiz quadrada de 2 e arredonde para duas casas decimais");
        CalcPrint(2, 2);
        System.out.println("4. Qual é raiz quadrada de 0?");
        CalcPrint(0, 0);
        System.out.println("5. Calcule a raiz quadrada de 144.");
        CalcPrint(144, 0);
        System.out.println("6. Encontre a raiz quadrada de 225.");
        CalcPrint(225, 0);
        System.out.println("7. Qual é a raiz quadrada de 0.25?");
        CalcPrint(0.25, 1);
        System.out.println("8. Descubra a raiz quadrada de 1.");
        CalcPrint(1, 0);
        System.out.println("9. Calcule a raiz quadrada de 10 e arredonde para uma casa decimal.");
        CalcPrint(10, 1);
        System.out.println("10. Qual é a raiz quadrada de 400?");
        CalcPrint(400, 0);
        System.out.println("11. Determine a raiz quadrada de 0.04.");
        CalcPrint(0.04, 1);
        System.out.println("12. Qual é a raiz quadrada de 121?");
        CalcPrint(121, 0);
        System.out.println("13. Calcule a raiz quadrada de 625.");
        CalcPrint(625, 0);
        System.out.println("14. Encontre a raiz quadrada de 50 e arredonde para duas casas decimais.");
        CalcPrint(50, 2);
        System.out.println("15. Qual é a raiz quadrada de 900?");
        CalcPrint(900, 0);
        System.out.println("16. Descubra a raiz quadrada de 10000.");
        CalcPrint(10000, 0);
        System.out.println("17. Calcule a raiz quadrada de 0.001 e arredonde para três casas decimais.");
        CalcPrint(0.001, 3);
        System.out.println("18. Qual é a raiz quadrada de 36?");
        CalcPrint(36, 0);
        System.out.println("19. Determine a raiz quadrada de 49.");
        CalcPrint(49, 0);
        System.out.println("20. Qual é a raiz quadrada de 169?");
        CalcPrint(169, 0);
    }
}
