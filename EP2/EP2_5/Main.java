import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    Produto p = new Produto(teclado.next(), teclado.nextFloat());
    
    System.out.println(p.info());
    
    teclado.close();
       
    }
}

class Produto {
    
    private String nome;
    private float preco;
    
    public Produto (String n, float p) {
        this.nome = n;
        this.preco = p;
    }
    
    public String info() {
        return "Produto: " + nome + "; Preço: R$ " + String.format("%.2f",preco); 
    }
}