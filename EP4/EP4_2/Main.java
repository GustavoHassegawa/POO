import java.util.Scanner;

abstract class Aluno {
    public abstract double calculaMedia();
    public abstract void exibeStatus();
}

class AlunoRegular extends Aluno {
    private double notas[];
    private String nome;
    
    public AlunoRegular(String nome, double notas[]) {
        this.notas = notas;
        this.nome = nome;
    }
    
    @Override
    public double calculaMedia() {
        double media = 0.0;
        for (double nota : notas) {
            media += nota;
        }
        return media/3;
    }
    
    @Override
    public void exibeStatus() {
        double media = calculaMedia();
        
        if (media >= 7) {
            System.out.println("APROVADO");
        } else if (media >= 5) {
            System.out.println("RECUPERACAO");  
        }  else {
            System.out.println("REPROVADO");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine().trim();
        String[] entradaNotas = teclado.nextLine().trim().split(" ");
        double[] notas = new double[3];
        
        for (int i = 0; i < 3; i++) {
            notas[i] = Double.parseDouble(entradaNotas[i]);
        }
        
        AlunoRegular aluno = new AlunoRegular(nome, notas);
        System.out.printf("%.2f\n", aluno.calculaMedia());
        aluno.exibeStatus();
        
        teclado.close();
        
    }
}