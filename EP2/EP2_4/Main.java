import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Conta c = new Conta(teclado.nextInt());
        String entry = teclado.next();
        
        
        switch(entry) {
            case "depositar" :
                c.depositar(teclado.nextInt());
                break;
            case "sacar" :  
                c.sacar(teclado.nextInt());
                break;
            default:
                break;
        }
        
        System.out.println(c.verSaldo());
        
        teclado.close();
    }
}

class Conta {
    private int saldo;
    
    public Conta(int valor) {
        this.saldo = valor;
    }
    
    public void sacar(int valor) {
        saldo = saldo - valor;
    }
    
    public void depositar(int valor) {
        saldo = saldo + valor;
    }
    
    public String verSaldo() {
        return "Saldo atual: R$ " + saldo; 
    }
}