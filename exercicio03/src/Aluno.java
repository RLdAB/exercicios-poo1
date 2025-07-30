public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    // Construtor completo
    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Construtor alternativo (sem matrícula)
    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = "não informada"; // valor padrão
    }

    public void exibirDados() {
        System.out.println("--- Dados do Aluno ---");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("----------------------");
    }
}
