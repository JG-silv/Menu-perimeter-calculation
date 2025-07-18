import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 – Calcular área do quadrado");
        System.out.println("2 – Calcular área do retângulo");
        System.out.println("3 – Calcular área do triângulo retângulo");
        System.out.println("4 – Calcular área do círculo");
        System.out.println("5 – Calcular área do trapézio");
        System.out.println("6 – Calcular perímetro do quadrado");
        System.out.println("7 – Calcular perímetro do retângulo");
        System.out.println("8 – Calcular perímetro do círculo");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o lado do quadrado:");
            double lado = sc.nextDouble();
            System.out.println("Área: " + (lado * lado));
        } else if (opcao == 2) {
            System.out.println("Digite a base e a altura do retângulo:");
            double base = sc.nextDouble();
            double altura = sc.nextDouble();
            System.out.println("Área: " + (base * altura));
        } else if (opcao == 3) {
            System.out.println("Digite a base e a altura do triângulo:");
            double base = sc.nextDouble();
            double altura = sc.nextDouble();
            System.out.println("Área: " + ((base * altura) / 2));
        } else if (opcao == 4) {
            System.out.println("Digite o raio do círculo:");
            double raio = sc.nextDouble();
            System.out.println("Área: " + (Math.PI * raio * raio));
        } else if (opcao == 5) {
            System.out.println("Digite as bases maior, menor e a altura do trapézio:");
            double bMaior = sc.nextDouble();
            double bMenor = sc.nextDouble();
            double altura = sc.nextDouble();
            System.out.println("Área: " + (((bMaior + bMenor) * altura) / 2));
        } else if (opcao == 6) {
            System.out.println("Digite o lado do quadrado:");
            double lado = sc.nextDouble();
            System.out.println("Perímetro: " + (4 * lado));
        } else if (opcao == 7) {
            System.out.println("Digite a base e a altura do retângulo:");
            double base = sc.nextDouble();
            double altura = sc.nextDouble();
            System.out.println("Perímetro: " + (2 * (base + altura)));
        } else if (opcao == 8) {
            System.out.println("Digite o raio do círculo:");
            double raio = sc.nextDouble();
            System.out.println("Perímetro: " + (2 * Math.PI * raio));
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
