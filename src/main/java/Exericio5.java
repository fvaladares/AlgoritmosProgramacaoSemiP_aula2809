/*
Escreva um programa que imprima todos os números inteiros de 1 até 50.
 */

public class Exericio5 {
    static void main() {
        int i;
        System.out.println("Impressão com for iniciando em 1");
        for (i = 1; i <= 50; i++) {
            System.out.print(i + ", ");
            if( i % 10 == 0 )
                System.out.println();
        }

        System.out.println("--------------");
        System.out.println("Impressão com for iniciando em 0");
        for (i = 0; i < 50; i++) {
            System.out.println(i+1);
        }

        System.out.println("Impressão com while iniciando em 1");
        i = 1; // inicializamos a variável de controle novamente.

        while(i <= 50) {
            System.out.println(i);
            i++; // i = i + 1; i += 1
        }
    }
}
