package CriacaoMetodos_1;

import java.util.Random;
import java.util.Scanner;

public class Ex_03 {
    // Referente à If Else Desafios e Jogos - 05. Número Sorteado

    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10);
    }

    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static boolean compareNumbers(int drawnNumber, int guessedNumber) {
        return drawnNumber == guessedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int drawn = generateRandomNumber();
        System.out.print("Adivinhe o número de 0 a 10: ");
        int num = readInt();
        System.out.println("Número sorteado: " + drawn);
        if(compareNumbers(drawn, num)) {
            System.out.println("Parabéns! Você acertou.");
        }
        else {
            System.out.println("Sinto muito. Você errou.");
        }
        sc.close();
    }
}
