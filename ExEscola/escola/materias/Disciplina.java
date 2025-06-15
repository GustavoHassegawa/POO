package escola.materias;

//import escola.pessoas.Pessoa;
import escola.pessoas.Aluno;
import escola.pessoas.Professor;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private Professor professor;
    private List<Aluno> alunos;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public Disciplina(String nome) {
        this.nome = nome;
        this.professor = null;
        this.alunos = new ArrayList<>();
    }
 
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void exibirInformacoes() {
        System.out.println("Disciplina: " + nome);
        System.out.println(professor.getInfoPessoa());
        System.out.println("Lista de alunos matriculados: ");

        for (Aluno a : alunos) {
            System.out.println(" - " + a.getInfoPessoa());
        }

    }
}