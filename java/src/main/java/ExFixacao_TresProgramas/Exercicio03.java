package ExFixacao_TresProgramas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        float firstGrade = sc.nextFloat();
        float secondGrade = sc.nextFloat();
        float thirdGrade = sc.nextFloat();
        Student std = new Student(name, firstGrade, secondGrade, thirdGrade);
        System.out.printf("FINAL GRADE = %.2f\n", std.FinalGrade());
        System.out.println(std.Situation());
    }
}
