package CriacaoMetodos_1;

import java.util.Scanner;

public class Ex_04 {
    public static float readFloat() {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }

    public static float average(float valueA, float valueB) {
        return (valueA + valueB)/2;
    }

    public static boolean failed(float grade) {
        return (grade < 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a primeira nota (Disciplina A): ");
        float gradeA = readFloat();
        System.out.print("Insira a segunda nota (Disciplina A): ");
        float gradeB = readFloat();
        System.out.print("Insira a primeira nota (Disciplina B): ");
        float gradeC = readFloat();
        System.out.print("Insira a segunda nota (Disciplina B): ");
        float gradeD = readFloat();
        float avgGradeA = average(gradeA, gradeB);
        float avgGradeB = average(gradeC, gradeD);
        System.out.print("\nO aluno ");
        if (failed(avgGradeA)) {
            System.out.print("não ");
        }
        System.out.println("foi aprovado na Disciplina A.");
        System.out.print("O aluno ");
        if (failed(avgGradeB)) {
            System.out.print("não ");
        }
        System.out.println("foi aprovado na Disciplina B.");
        sc.close();
    }
}
