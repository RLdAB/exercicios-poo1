public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}
