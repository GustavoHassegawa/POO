package escola.pessoas;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
     
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = -1;
    }
    
    public Pessoa(String nome) {
        this.nome = nome;
        this.cpf = "???.???.???-??";
        this.idade = -1;
    }

    public String getInfoPessoa() {
        return "Nome: " + nome + "cpf: " + cpf + "idade: " + idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    } 
}