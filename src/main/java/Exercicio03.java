import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int cubo;

        System.out.println("Programa para determinar se o número" +
                " é positivo ou negativo");
        System.out.print("Por favor, informe o número: ");
        numero = entrada.nextInt();

        System.out.println("==============\n");
        if (numero % 2 == 0) {
            System.out.printf("O número %d é par\n", numero);
            System.out.printf("%d^2 = %d",
                    numero, numero * numero);

        } else {
            System.out.printf("O número %d é ímpar\n", numero);
            cubo = numero * numero * numero;
            System.out.printf("%d^3 = %d",
                    numero, cubo);
        }
    }
}
