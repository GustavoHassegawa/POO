import java.util.Scanner;

abstract class Funcionario {
    public abstract double calcular_salario();
}

class Mensalista extends Funcionario {
    private String nome;
    private double salarioFixo;
    
    public Mensalista(String nome, double salarioFixo) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
    }
    
    @Override
    public double calcular_salario() {
        return salarioFixo;
    }
}

class Horista extends Funcionario {
    private String nome;
    private double salarioHora;
    private int horasTrabalhadas;
    
    public Horista(String nome, double salarioHora, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public double calcular_salario() {
        return salarioHora * horasTrabalhadas;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine().trim();
        String tipo = teclado.nextLine().trim();
        Funcionario funcionario;
        
        if (tipo.equals("Mensalista")) {
            double salarioFixo = Double.parseDouble(teclado.nextLine().trim());
            
            funcionario = new Mensalista(nome, salarioFixo);
            
             System.out.printf("%.2f\n", funcionario.calcular_salario());
        } else if (tipo.equals("Horista")) {
            String entrada[] = teclado.nextLine().trim().split(" ");
            double salarioHora = Double.parseDouble(entrada[0]);
            int hora = Integer.parseInt(entrada[1]);
            
            funcionario = new Horista(nome, salarioHora, hora);
        
            System.out.printf("%.2f\n", funcionario.calcular_salario());
        }
        
        
        teclado.close();
    }
}