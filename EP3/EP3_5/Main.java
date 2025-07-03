import java.util.Scanner;

class Empregado {
    private String nome;
    private double salarioBase;
    
    public Empregado(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario() {
        return getSalarioBase();
    }
    
}

class Gerente extends Empregado {
    private double bonusAnual;
    
    public Gerente(String nome, double salarioBase, double bonusAnual) {
        super(nome, salarioBase);
        this.bonusAnual = bonusAnual;
    }
    
    public double getBonusAnual() {
        return bonusAnual;
    }
    
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getBonusAnual()/12);
    }
}

class Vendedor extends Empregado {
    private double totalVendas;
    
    public Vendedor(String nome, double salarioBase, double totalVendas) {
        super(nome, salarioBase);
        this. totalVendas = totalVendas;
    }
    
    public double getTotalVendas() {
        return totalVendas;
    }
    
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getTotalVendas() * 0.05);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome_input, tipo_input;
        String[] entrada;
        double salario_base_input;
        int n_entradas;
        
        n_entradas = Integer.parseInt(teclado.nextLine().trim());
        
        for (int i = 0; i < n_entradas; i++) {
            entrada = teclado.nextLine().split(" ");
            tipo_input = entrada[0];
            
            if (tipo_input.equals("E")) {
                nome_input = entrada[1];
                salario_base_input = Double.parseDouble(entrada[2]);
                
                Empregado funcionario = new Empregado(nome_input, salario_base_input);
                
                System.out.print("Nome: " + funcionario.getNome() + " ");
                System.out.printf("Salario: %.2f\n", funcionario.calcularSalario());
                
            } else if (tipo_input.equals("G")) {
                nome_input = entrada[1];
                salario_base_input = Double.parseDouble(entrada[2]);
                double bonus_anual_input = Double.parseDouble(entrada[3]);
                
                Gerente gerente = new Gerente(nome_input, salario_base_input, bonus_anual_input);
                
                System.out.print("Nome: " + gerente.getNome() + " ");
                System.out.printf("Salario: %.2f\n", gerente.calcularSalario());
                
            } else if (tipo_input.equals("V")) {
                nome_input = entrada[1];
                salario_base_input = Double.parseDouble(entrada[2]);
                double total_vendas_input = Double.parseDouble(entrada[3]);
                
                Vendedor vendedor = new Vendedor(nome_input, salario_base_input, total_vendas_input);
                
                System.out.print("Nome: " + vendedor.getNome() + " ");
                System.out.printf("Salario: %.2f\n", vendedor.calcularSalario());
            }
        }
        
        teclado.close();
        
    }    
}