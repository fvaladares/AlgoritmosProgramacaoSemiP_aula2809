void main() {
    int idade; // Variável para armazenar a idade.
    String classificacao; // Variável para armazenar texto.

    // Comando para mostrar dados na tela (mostra o que está entre parênteses e áspas duplas).
    idade = Integer.parseInt(IO.readln("Informe a idade do(a) nadador(a): "));

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

    IO.println();
    IO.println("Nadador classificado como " +
            classificacao);
}