package alunos;

public class Aluno {
    private String nome;
    private double[] notas = new double[3];

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public double calcularMedia() {
        double media = 0.0;
        
        for (double nota : notas) {
            media += nota;
        }
        
        media /= 3;

        return media;
    }

    

}
