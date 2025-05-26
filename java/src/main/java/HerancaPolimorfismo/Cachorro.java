package HerancaPolimorfismo;

public class Cachorro extends Animal {
    public String nome;

    @Override
    void fazerSom() {
        System.out.println("O cachorro late.");
    }
}
