package TryCatch;

import java.util.Scanner;

public class IndiceInvalido {
    char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};

    public IndiceInvalido() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array disponível: ");
        for(int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.print("\nInsira a posição que deseja acessar: ");
        int index = sc.nextInt();
        try{
            System.out.printf("A letra na posição %d é %c\n", index, chars[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro! Posição inválida.");
        }
    }
}
