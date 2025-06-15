package escola.pessoas;

public class Professor extends Pessoa {
    private String titulacao;

    public Professor(String nome, String cpf, int idade, String titulacao) {
        super(nome, cpf, idade);
        this.titulacao = titulacao;
    }

    public Professor(String nome, String cpf, String titulacao) {
        super(nome, cpf);
        this.titulacao = titulacao;
    }

    public Professor(String nome, String titulacao) {
        super(nome);
        this.titulacao = titulacao;
    }

    @Override
    public String getInfoPessoa() {
        return "Professor: " + nome + ", Titulação: " + titulacao;
    }
}