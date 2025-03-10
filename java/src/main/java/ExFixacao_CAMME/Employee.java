package ExFixacao_CAMME;

public class Employee {
    String name;
    double grossSalary;
    double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double NetSalary() {
        return(grossSalary - tax);
    }

    public void IncreaseSalary(double percentage) {
        this.grossSalary = this.grossSalary + (this.grossSalary * percentage)/100;
    }
}
