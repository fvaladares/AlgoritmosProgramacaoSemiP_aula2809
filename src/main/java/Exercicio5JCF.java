void main() {
    IO.println("Impressão com for iniciando em 1");
    for (int i = 1; i <= 50; i++) {
        System.out.print(i + ", ");
        if( i % 10 == 0 )
            System.out.println();
    }

    IO.println("--------------");
    IO.println("Impressão com for iniciando em 0");
    for (int i = 0; i < 50; i++) {
        IO.println(i+1);
    }
}