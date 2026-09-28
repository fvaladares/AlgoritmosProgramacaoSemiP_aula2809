import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int idade; // Variável para armazenar a idade.
        String classificacao; // Variável para armazenar texto.

        // Objeto quer permite ler dados do teclado.
        Scanner entrada = new Scanner(System.in);

        // Comando para mostrar dados na tela (mostra o que está entre parênteses e áspas duplas).
        System.out.print("Informe a idade do(a) nadador(a): ");
        idade = entrada.nextInt(); // lendo a idade do nadador (teclado)

        // Fazendo a classificação
        if (idade >= 18) {
            classificacao = "Adulto";
        } else if (idade >= 13) {
            classificacao = "Juvenil";
        } else if (idade > 0) {
            classificacao = "Infantil";
        } else {
            classificacao = "Inválido (idade menor do que zero)";
        }

        System.out.println();
        System.out.println("Nadador classificado como " +
                classificacao);
    }
}
