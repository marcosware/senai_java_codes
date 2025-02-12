package Revisao_IfElse;

import java.util.Scanner;

public class MediaNotas {
    public static void RIE_MN_01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        float gradeA = sc.nextFloat();
        System.out.println("Insira a segunda nota: ");
        float gradeB = sc.nextFloat();
        float avgGrade = ((gradeA + gradeB) / 2);
        System.out.println("O aluno ");
        if (avgGrade < 7) {
            System.out.print("não ");
        }
        System.out.print("foi aprovado.");
        sc.close();
    }

    public static void RIE_MN_02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        float gradeA = sc.nextFloat();
        System.out.println("Insira a segunda nota: ");
        float gradeB = sc.nextFloat();
        float avgGrade = ((gradeA + gradeB) / 2);
        if (avgGrade < 5) {
            System.out.println("O aluno não foi aprovado.");
        } else if (avgGrade < 7) {
            System.out.println("O aluno está de recuperação.");
        }
        else{
            System.out.println("O aluno foi aprovado.");
        }
        sc.close();
    }

    public static void RIE_MN_03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        float gradeA = sc.nextFloat();
        System.out.println("Insira a segunda nota: ");
        float gradeB = sc.nextFloat();
        System.out.println("Insira a terceira nota: ");
        float gradeC = sc.nextFloat();
        float higher = gradeA;
        float lesser = gradeB;
        if (gradeA >= gradeB) {
            if (gradeA < gradeC) {
                higher = gradeC;
            }
            else if (gradeC < gradeB) {
                lesser = gradeC;
            }
        } else if (gradeC >= gradeA) {
            lesser = gradeA;
            if(gradeC >= gradeB) {
                higher = gradeC;
            }
            else {
                higher = gradeB;
            }
        } else {
            higher = gradeB;
            if(gradeC >= gradeA) {
                lesser = gradeA;
            }
            else{
                lesser = gradeC;
            }
        }
        System.out.println("Maior nota: " + higher + "\nMenor nota: " + lesser);
        sc.close();
    }

    public static void RIE_MN_04() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        float gradeA = sc.nextFloat();
        System.out.println("Insira a segunda nota: ");
        float gradeB = sc.nextFloat();
        float avgGrade = ((gradeA + gradeB) / 2);
        System.out.println("O aluno ");
        if (avgGrade < 7) {
            System.out.print("não ");
        }
        System.out.print("foi aprovado.");
        if (gradeA >= 10 && gradeB >= 10) {
            System.out.println("O aluno recebeu nota máxima em duas disciplinas.");
        }
        else if (gradeA >= 10 || gradeB >= 10){
            System.out.println("O aluno recebeu nota máxima em uma disciplina.");
        }
        else{
            System.out.println("O aluno não recebeu nota máxima em nenhuma disciplina.");
        }
        sc.close();
    }

    public static void RIE_MN_05() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a primeira nota (Disciplina A): ");
        float gradeA = sc.nextFloat();
        System.out.print("Insira a segunda nota (Disciplina A): ");
        float gradeB = sc.nextFloat();
        System.out.print("Insira a primeira nota (Disciplina B): ");
        float gradeC = sc.nextFloat();
        System.out.print("Insira a segunda nota (Disciplina B): ");
        float gradeD = sc.nextFloat();
        float avgGradeA = ((gradeA + gradeB) / 2);
        float avgGradeB = ((gradeC + gradeD) / 2);
        System.out.print("\nO aluno ");
        if (avgGradeA < 7) {
            System.out.print("não ");
        }
        System.out.println("foi aprovado na Disciplina A.");
        System.out.print("O aluno ");
        if (avgGradeB < 7) {
            System.out.print("não ");
        }
        System.out.println("foi aprovado na Disciplina B.");
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a atividade que deseja executar");
        System.out.println("01 - Aprovação de aluno por média de duas notas.");
        System.out.println("02 - Aprovação, reprovação ou recuperação de aluno.");
        System.out.println("03 - Maior e menor nota dentre três notas.");
        System.out.println("04 - Aprovação de aluno e nota máxima em disciplina.");
        System.out.println("05 - Aprovação de aluno em duas disciplinas distintas.");
        System.out.println("OPÇÃO: ");
        int option = sc.nextInt();
        switch (option){
            case 1:
                RIE_MN_01();
                break;
            case 2:
                RIE_MN_02();
                break;
            case 3:
                RIE_MN_03();
                break;
            case 4:
                RIE_MN_04();
                break;
            case 5:
                RIE_MN_05();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Obrigado por testar o programa!");
        sc.close();
    }
}
