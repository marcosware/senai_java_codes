package TryCatch;

import java.util.Scanner;

public class CadastroUsuarios {
    String name;
    int age;

    public CadastroUsuarios() {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Insira seu nome: ");
            this.name = sc.nextLine();
            System.out.print("Insira sua idade: ");
            this.age = sc.nextInt();
            if(name.isEmpty() || age < 0) {
                throw new DadosInvalidosException();
            }
            System.out.printf("Cadastro realizado com sucesso!\nNome: %s\nIdade: %d\n", name, age);
        }catch(DadosInvalidosException e) {
            System.out.println("Erro! Dados inválidos.");
        }

    }
}
