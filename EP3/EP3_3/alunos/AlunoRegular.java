package alunos;

public class AlunoRegular extends Aluno {
    public AlunoRegular(String nome, double[] notas) {
        super(nome, notas);
    }

    public String getSituacao() {
        double media = calcularMedia();

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
