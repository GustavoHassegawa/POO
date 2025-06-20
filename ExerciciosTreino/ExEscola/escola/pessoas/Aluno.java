package escola.pessoas;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public String getInfoPessoa() {
        return "Aluno: " + nome + ", Matricula: " + matricula;
    }
}

