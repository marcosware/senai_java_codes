package Revisao_IfElse;

import java.util.Scanner;

public class DatasHorarios {
    public static void RIE_DH_01() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um horário (HH:MM): ");
        String time = sc.nextLine();
        String[] hourMinute = time.split(":");
        int hours = Integer.parseInt(hourMinute[0]);
        int minutes = Integer.parseInt(hourMinute[1]);
        System.out.print("O horário " + time);
        if (hours > 23 || minutes > 59 || hours < 0 || minutes < 0) {
            System.out.print(" não");
        }
        System.out.print(" é válido.");
    }

    public static void RIE_DH_02() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um mês: ");
        int month = sc.nextInt();
        System.out.print("O mês " + month);
        if(month > 12 || month < 1) {
            System.out.print(" não");
        }
        System.out.print(" é válido.");
    }

    public static void RIE_DH_03() {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um mês: ");
        int month = sc.nextInt();
        System.out.print("Insira o dia: ");
        int day = sc.nextInt();
        System.out.print("O dia " + day);
        if (day > days[month - 1] || day < 1) {
            System.out.print(" não");
        }
        System.out.print(" é válido.");
    }

    public static void RIE_DH_04() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um horário (HH:MM): ");
        String time = sc.nextLine();
        String[] hourMinute = time.split(":");
        int hours = Integer.parseInt(hourMinute[0]);
        System.out.print("Período: ");
        if (hours < 6) {
            System.out.print("Madrugada");
        } else if (hours < 12) {
            System.out.print("Manhã");
        } else if (hours < 18) {
            System.out.print("Tarde");
        } else {
            System.out.print("Noite");
        }
    }

    public static void RIE_DH_05() {
        Scanner sc = new Scanner(System.in);
        String[] dd_mm_aa;
        boolean valid = false;

        System.out.print("Insira a data de início do período (DD/MM/AA): ");
        String start = sc.nextLine();
        dd_mm_aa = start.split("/");
        int dayStart = Integer.parseInt(dd_mm_aa[0]);
        int monthStart = Integer.parseInt(dd_mm_aa[1]);
        int yearStart = Integer.parseInt(dd_mm_aa[2]);

        System.out.print("Insira a data de fim do período (DD/MM/AA): ");
        String end = sc.nextLine();
        dd_mm_aa = end.split("/");
        int dayEnd = Integer.parseInt(dd_mm_aa[0]);
        int monthEnd = Integer.parseInt(dd_mm_aa[1]);
        int yearEnd = Integer.parseInt(dd_mm_aa[2]);

        System.out.print("Insira a data de checagem (DD/MM/AA): ");
        String check = sc.nextLine();
        dd_mm_aa = check.split("/");
        int dayCheck = Integer.parseInt(dd_mm_aa[0]);
        int monthCheck = Integer.parseInt(dd_mm_aa[1]);
        int yearCheck = Integer.parseInt(dd_mm_aa[2]);

        System.out.print("A data ");
        if (yearCheck >= yearStart && yearCheck <= yearEnd) {
            if ((monthCheck >= monthStart && monthCheck <= monthEnd)
            || (monthCheck > monthEnd && yearCheck < yearEnd)) {
                if (monthCheck == monthStart && dayCheck >= dayStart) {
                    valid = true;
                }
                if (monthCheck == monthEnd && dayCheck <= dayEnd) {
                    valid = true;
                } else {
                    valid = false;
                }
                if (monthCheck != monthStart && monthCheck != monthEnd) {
                    valid = true;
                }
            }
        }
        if(!valid) {
            System.out.print("não ");
        }
        System.out.println("está no período inserido.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a atividade que deseja executar");
        System.out.println("01 - Horário válido (24 horas).");
        System.out.println("02 - Mês válido.");
        System.out.println("03 - Dia do mês válido.");
        System.out.println("04 - Período de um horário.");
        System.out.println("05 - Data dentro de um período específico.");
        System.out.println("OPÇÃO: ");
        int option = sc.nextInt();
        switch (option){
            case 1:
                RIE_DH_01();
                break;
            case 2:
                RIE_DH_02();
                break;
            case 3:
                RIE_DH_03();
                break;
            case 4:
                RIE_DH_04();
                break;
            case 5:
                RIE_DH_05();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Obrigado por testar o programa!");
        sc.close();
    }
}
