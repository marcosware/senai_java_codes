package TryCatch;

import java.util.Scanner;

public class VerificacaoMaioridade {
    int age;

    public VerificacaoMaioridade() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Idade: ");
            this.age = sc.nextInt();
            if(age < 0) {
                throw new IdadeInvalidaException();
            }
            else if(age < 18) {
                System.out.println("Você não é maior de idade.");
            }
            else {
                System.out.println("Você é maior de idade.");
            }

        } catch(IdadeInvalidaException e) {
            System.out.println("Erro. Idade negativa.");
        }
    }
}
