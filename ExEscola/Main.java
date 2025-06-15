import escola.pessoas.Aluno;
import escola.pessoas.Professor;
import escola.materias.Disciplina;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Disciplina turma;
        Professor professor;
        Aluno aluno;
        String nome_professor_input, 
               cpf_professor_input,
               titulo_professor_input,
               nome_aluno_input,
               cpf_aluno_input,
               matricula_input;

        System.out.println("---CADASTRO DE TURMA---");

        System.out.print("Insira o nome da Disciplina: ");
        turma = new Disciplina(teclado.nextLine().trim());

        System.out.print("Insira o nome do Professor: ");
        nome_professor_input = teclado.nextLine().trim();

        System.out.print("Insira o CPF do Professor: ");
        cpf_professor_input = teclado.nextLine().trim();
        
        System.out.print("Insira a titulação do Professor: ");
        titulo_professor_input = teclado.nextLine().trim();

        professor = new Professor(nome_professor_input, 
                                  cpf_professor_input, 
                                  titulo_professor_input);

        turma.assignProfessor(professor);

        System.out.println("---INSIRA OS ALUNOS---");

        while(true) {
            System.out.println("NOVO ALUNO");

            System.out.print("Nome: ");
            if (!teclado.hasNextLine()) break;
            nome_aluno_input = teclado.nextLine().trim();

            System.out.print("CPF: ");
            if (!teclado.hasNextLine()) break;
            cpf_aluno_input = teclado.nextLine().trim();

            System.out.print("Matrícula: ");
            if (!teclado.hasNextLine()) break;
            matricula_input = teclado.nextLine().trim();

            aluno = new Aluno(nome_aluno_input, 
                              cpf_aluno_input, 
                              matricula_input);
            
            turma.adicionarAluno(aluno);
        }

        System.out.println("\nTodos os alunos foram cadastrados:");
        turma.exibirInformacoes();

        teclado.close();
    }
}
