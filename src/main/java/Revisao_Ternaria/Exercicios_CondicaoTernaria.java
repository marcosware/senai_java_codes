package Revisao_Ternaria;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_CondicaoTernaria {
    public static void RT_CT_01() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String oddEven = (num % 2 == 0) ? "PAR" : "ÍMPAR";
        System.out.println(oddEven);
    }

    public static void RT_CT_02() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: ");
        int age = sc.nextInt();
        String adulthood = (age >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(adulthood);
    }

    public static void RT_CT_03() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String posNeg = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Zero";
        System.out.println(posNeg);
    }

    public static void RT_CT_04() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String mult = (num % 5 == 0) ? "Múltiplo de 5" : "Não é múltiplo de 5";
        System.out.println(mult);
    }

    public static void RT_CT_05() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ano: ");
        int year = sc.nextInt();
        String leap = (year % 400 == 0) ? "Bissexto" : (year % 4 == 0 && year % 100 != 0)
                ? "Bissexto" : "Não é bissexto";
        System.out.println(leap);
    }

    public static void RT_CT_06() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: ");
        int age = sc.nextInt();
        System.out.print("Carteira de Motorista (S/N): ");
        char license = sc.next().toUpperCase().charAt(0);
        if(license != 'S' && license != 'N') {
            System.out.println("Resposta inválida.");
        }
        else{
            String driver = (age >= 18 && license == 'S') ? "Pode dirigir" : "Não pode dirigir";
            System.out.println(driver);
        }
    }

    public static void RT_CT_07() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String evenPos = (num % 2 == 0 && num >= 0) ? "SIM" : "NÃO";
        System.out.println(evenPos);
    }

    public static void RT_CT_08() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota: ");
        int grade = sc.nextInt();
        String result = (grade >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(result);
    }

    public static void RT_CT_09() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Segundo número: ");
        int numB = sc.nextInt();
        String bigger = (numA > numB) ? "Maior" : "Menor ou Igual";
        System.out.println(bigger);
    }

    public static void RT_CT_10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int num = sc.nextInt();
        String higher = (num > 100) ? "Alto" : "Baixo";
        System.out.println(higher);
    }

    public static void RT_CT_11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Caractere: ");
        char letter = sc.next().toUpperCase().charAt(0);
        String vowel = (letter == 'A' ||
                letter == 'E' || letter == 'I' ||
                letter == 'O' || letter == 'U') ? "Vogal" : "Consoante";
        System.out.println(vowel);
    }

    public static void RT_CT_12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String oddEven = (num % 2 == 0) ? (num >= 0) ? "Par e Positivo": "Par e Negativo"
                : (num >= 0) ? "Ímpar e Positivo" : "Ímpar e Negativo";
        System.out.println(oddEven);
    }

    public static void RT_CT_13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Segundo número: ");
        int numB = sc.nextInt();
        int bigger = (numA >= numB) ? numA : numB;
        System.out.println("Maior: " + bigger);
    }

    public static void RT_CT_14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String interval = (num >= 10 && num <= 50) ? "Dentro do Intervalo" : "Fora do Intervalo";
        System.out.println(interval);
    }

    public static void RT_CT_15() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String mult = (num % 3 == 0 && num % 5 == 0) ? "FizzBuzz" : String.valueOf(num);
        System.out.println(mult);
    }

    public static void RT_CT_16() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bool (0/1): ");
        int num = sc.nextInt();
        boolean bool = false;
        if(num != 0) {
            bool = true;
        }
        String boolToString = (bool) ? "Sim" : "Não";
        System.out.println(boolToString);
    }

    public static void RT_CT_17() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: ");
        int age = sc.nextInt();
        System.out.print("Estudante (S/N): ");
        char student = sc.next().toUpperCase().charAt(0);
        if(student != 'S' && student != 'N') {
            System.out.println("Resposta inválida.");
        }
        else{
            String discount = (age > 60 || student == 'S') ? "Desconto aplicado" : "Sem desconto";
            System.out.println(discount);
        }
    }

    public static void RT_CT_18() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int numA = sc.nextInt();
        System.out.print("Segundo número: ");
        int numB = sc.nextInt();
        System.out.print("Terceiro número: ");
        int numC = sc.nextInt();
        String triangle = (numA == numB && numB == numC) ? "Equilátero" :
                (numA != numB && numA != numC && numB != numC) ? "Escaleno" : "Isósceles";
        System.out.println("Triângulo " + triangle);
    }

    public static void RT_CT_19() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String div = (num % 2 == 0 || num % 3 == 0) ? "Divisível" : "Não divisível";
        System.out.println(div);
    }

    public static void RT_CT_20() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota: ");
        float grade = sc.nextFloat();
        String result = (grade >= 7) ? "Aprovado" : (grade > 5) ? "Recuperação" : "Reprovado";
        System.out.println(result);
    }

    public static void RT_CT_21() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String oddEven = (num % 2 == 0) ? "Par" : "Ímpar";
        String posNeg = (num >= 0) ? "Positivo" : "Negativo";
        System.out.println(oddEven + "\n" + posNeg);
    }

    public static void RT_CT_22() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor: R$");
        float value = sc.nextFloat();
        String shipping = (value >= 100) ? "Frete grátis aplicado" : "Frete grátis indisponível";
        System.out.println(shipping);
    }

    public static void RT_CT_23() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Senha: ");
        String password = sc.next();
        String valid = (password.length() >= 8) ? "Senha válida" : "Senha inválida\nMínimo 8 caracteres";
        System.out.println(valid);
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for(int i = 1; i <= (num/2); i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        return(sum == num);
    }

    public static void RT_CT_24() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String perfect = (isPerfect(num)) ? "Perfeito" : "Não perfeito";
        System.out.println(perfect);
    }

    public static void RT_CT_25() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia da Semana:\n" +
                "1 - Dom | 5 - Qui\n2 - Seg | 6 - Sex\n3 - Ter | 7 - Sab\n4 - Qua | OPT: ");
        int day = sc.nextInt();
        if(day < 1 || day > 7) {
            System.out.println("Resposta inválida");
        }
        else{
            String business = (day > 1 && day < 7) ? "Dia útil" : "Final de semana";
            System.out.println(business);
        }
    }

    public static void RT_CT_26() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: ");
        int age = sc.nextInt();
        String vote = (age >= 16) ? "Pode votar" : "Não pode votar";
        System.out.println(vote);
    }

    public static void RT_CT_27() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String posNeg = (num >= 0) ? "Positivo ou Zero" : "Negativo";
        System.out.println(posNeg);
    }

    public static void RT_CT_28() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num = sc.nextInt();
        String interval = (num >= 20 && num <= 30) ? "Dentro do Intervalo" : "Fora do Intervalo";
        System.out.println(interval);
    }

    public static void RT_CT_29() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int age = sc.nextInt();
        String interval = (age > 60) ? "Idoso" : (age >= 18) ? "Adulto" : "Jovem";
        System.out.println(interval);
    }

    public static void RT_CT_30() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        int gradeA = sc.nextInt();
        System.out.print("Segunda nota: ");
        int gradeB = sc.nextInt();
        String result = ( ((gradeA+gradeB)/2) >= 6 ) ? "Aprovado" : "Reprovado";
        System.out.println(result);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCÍCIOS COM O LAÇO FOR\n");
        System.out.println("1. Escreva uma expressão ternária que retorne Par " +
                "se um número for par e Ímpar se for ímpar.\n");
        RT_CT_01();
        System.out.println();
        System.out.println("2. Escreva uma expressão ternária que retorne Maior de idade " +
                "se a idade for maior ou igual a 18 e Menor de idade caso contrário.\n");
        RT_CT_02();
        System.out.println();
        System.out.println("3. Escreva uma expressão ternária que retorne Positivo se um número for maior que" +
                "zero, Negativo se menor que zero, e Zero se for igual a zero.\n");
        RT_CT_03();
        System.out.println();
        System.out.println("4. Verifique se um número é múltiplo de 5. Se for, retorne Múltiplo de 5, caso" +
                "contrário, retorne Não é múltiplo de 5.\n");
        RT_CT_04();
        System.out.println();
        System.out.println("5. Calcule a soma dos números de 1 a 100.\n");
        RT_CT_05();
        System.out.println();
        System.out.println("6. Calcule a soma dos números pares de 1 a 100.\n");
        RT_CT_06();
        System.out.println();
        System.out.println("7. Calcule a soma dos números ímpares de 1 a 100.\n");
        RT_CT_07();
        System.out.println();
        System.out.println("8. Exiba a tabuada do número 7.\n");
        RT_CT_08();
        System.out.println();
        System.out.println("9. Exiba a tabuada do número informado pelo usuário.\n");
        RT_CT_09();
        System.out.println();
        System.out.println("10. Exiba os primeiros 10 múltiplos de 5.\n");
        RT_CT_10();
        System.out.println();
        System.out.println("11. Exiba os quadrados dos números de 1 a 10.\n");
        RT_CT_11();
        System.out.println();
        System.out.println("12. Exiba os cubos dos números de 1 a 10.\n");
        RT_CT_12();
        System.out.println();
        System.out.println("13. Exiba os primeiros 10 termos da sequência de Fibonacci.\n");
        RT_CT_13();
        System.out.println();
        System.out.println("14. Verifique e exiba os números primos entre 1 e 50.\n");
        RT_CT_14();
        System.out.println();
        System.out.println("15. Exiba os números de 1 a 100, substituindo múltiplos de 3 por Fizz" +
                "e múltiplos de 5 por Buzz.");
        RT_CT_15();
        System.out.println();
        System.out.println("16. Exiba os caracteres de uma string informada pelo usuário.");
        RT_CT_16();
        System.out.println();
        System.out.println("17. Exiba a string informada pelo usuário de trás para frente.");
        RT_CT_17();
        System.out.println();
        System.out.println("18. Verifique se uma string informada pelo usuário é um palíndromo.");
        RT_CT_18();
        System.out.println();
        System.out.println("19. Calcule o fatorial de um número informado pelo usuário.");
        RT_CT_19();
        System.out.println();
        System.out.println("20. Exiba os números de 1 a 50 pulando de 5 em 5.");
        RT_CT_20();
        System.out.println();
        System.out.println("21. Exiba a soma dos dígitos de um número informado pelo usuário.");
        RT_CT_21();
        System.out.println();
        System.out.println("22. Exiba os divisores de um número informado pelo usuário.");
        RT_CT_22();
        System.out.println();
        System.out.println("23. Exiba todos os números entre 1 e 200 que sejam divisíveis por 4.");
        RT_CT_23();
        System.out.println();
        System.out.println("24. Exiba a sequência de números triangulares até o décimo termo.");
        RT_CT_24();
        System.out.println();
        System.out.println("25. Gere um padrão de asteriscos em formato de triângulo com altura 5.");
        RT_CT_25();
        System.out.println();
        System.out.println("26. Exiba um losango de números com base 5.");
        RT_CT_26();
        System.out.println();
        System.out.println("27. Exiba a soma dos números de um vetor de inteiros.");
        RT_CT_27();
        System.out.println();
        System.out.println("28. Exiba a média dos números de um vetor de inteiros.");
        RT_CT_28();
        System.out.println();
        System.out.println("29. Ordene um vetor de inteiros em ordem crescente (utilizando o algoritmo de seleção).");
        RT_CT_29();
        System.out.println();
        System.out.println("30. Conte quantos números pares e ímpares existem em um vetor de inteiros.");
        RT_CT_30();
        System.out.println();
        sc.close();
    }
}
