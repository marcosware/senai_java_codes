package CriacaoMetodos_1;

import java.util.Scanner;

public class Ex_05 {

    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static float power(float base, int exponent) {
        float power = 1;
        for(int i = 0; i < exponent; i++) {
            power *= base;
        }
        System.out.println("\nPower: " + power);
        return power;
    }

    public static float sqrt(float radicand, int index) {
        float i = 0;
        while(radicand > 1) {
            radicand /= index;
            i++;
        }
        System.out.println("\nSqrt: " + i);
        return i;
    }

    public static boolean isPerfectRoot(float power, int num) {
        return (power == num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número: ");
        int num = readInt();
        System.out.print("O número " + num);
        if(!isPerfectRoot(power(sqrt(num, 2), 2), num)) {
            System.out.print(" não");
        }
        System.out.println(" é um quadrado perfeito.");
        sc.close();
    }
}
