public class Main {
    public static void main(String[] args) {
        // Aluno com todos os dados
        Aluno aluno1 = new Aluno("João Silva", "20231234", "Engenharia de Software");

        // Aluno sem matrícula
        Aluno aluno2 = new Aluno("Maria Oliveira", "Matemática");

        aluno1.exibirDados();
        System.out.println();
        aluno2.exibirDados();
    }
}
