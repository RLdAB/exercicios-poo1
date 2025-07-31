public class Contato {
    // Atributos encapsulados
    private String nome;
    private String telefone;

    // Construtor
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Método para atualizar o telefone
    public void atualizarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }

    // Método que retorna os dados formatados
    public String obterContatoFormatado() {
        return "Nome: " + nome + " - Telefone: " + telefone;
    }

    // Getters, caso queira acesso externo (opcional)
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}


