/*
Escreva um programa que imprima todos os números inteiros de 1 até 50.
 */

public class Exericio5 {
    static void main() {
        System.out.println("Impressão com for iniciando em 1");
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + ", ");
            if( i % 10 == 0 )
                System.out.println();
        }

        System.out.println("--------------");
        System.out.println("Impressão com for iniciando em 0");
        for (int i = 0; i < 50; i++) {
            System.out.println(i+1);
        }
    }
}
