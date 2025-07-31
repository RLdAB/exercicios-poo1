public class AgendaPrincipal {
    public static void main(String[] args) {
        // Criando dois contatos
        Contato contato1 = new Contato("João", "99999-9999");
        Contato contato2 = new Contato("Maria", "88888-8888");

        // Atualizando telefone do João
        contato1.atualizarTelefone("90000-0000");

        // Imprimindo contatos formatados
        System.out.println(contato1.obterContatoFormatado());
        System.out.println(contato2.obterContatoFormatado());
    }
}


