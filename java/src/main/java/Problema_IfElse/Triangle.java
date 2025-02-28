package Problema_IfElse;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void largerArea(double areaX, double areaY) {
        String larger = "X";
        if(areaY > areaX) {
            larger = "Y";
        }
        System.out.println("Larger area: " + larger);
    }
}