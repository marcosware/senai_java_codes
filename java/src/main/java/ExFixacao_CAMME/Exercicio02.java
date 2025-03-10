package ExFixacao_CAMME;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();
        Employee eply = new Employee(name, grossSalary, tax);
        System.out.printf("\nEmployee: %s, $ %.2f\n", eply.name, eply.NetSalary());
        System.out.print("\nWhich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        eply.IncreaseSalary(percentage);
        System.out.printf("\nUpdated data: %s, $ %.2f", eply.name, eply.NetSalary());
    }
}
