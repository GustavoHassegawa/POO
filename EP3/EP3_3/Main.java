import java.util.Scanner;
import alunos.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine().trim();
        String[] entradaNotas = teclado.nextLine().split(" ");
        double[] notas = new double[3];
        AlunoRegular aluno;
        double media;

        for (int i = 0; i < 3; i++) {
            notas[i] = Double.parseDouble(entradaNotas[i]);
        }

        aluno = new AlunoRegular(nome, notas);
        media = aluno.calcularMedia();

        System.out.printf("%.2f\n", media);
        System.out.println(aluno.getSituacao());

    }
}
