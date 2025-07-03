import java.util.Scanner;

class Cliente {
    public int tipo;
    public double valor;
    
    public Cliente(int tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public int getTipo() {
        return tipo;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double  valor) {
        this.valor = valor;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}

class ClienteRegular extends Cliente {
    public ClienteRegular(int tipo, double valor) {
        super(tipo, valor);
    } 
    
    public double calcularDesconto() {
        if (valor > 100) {
            return valor * 0.05;
        } else {
            return 0;   
        }
    }
    
    public double valorFinal() {
        return this.valor - calcularDesconto();
    }
}

class ClienteVIP extends Cliente {
    public ClienteVIP(int tipo, double valor) {
        super(tipo, valor);
    }
    
    public double calcularDesconto() {
        if (valor > 200) {
            return valor * 0.15;
        } else if (valor > 50) {
            return valor * 0.10;
        } else {
            return 0;
        }
    }
    
    public double valorFinal() {
        return this.valor - calcularDesconto();
    }
}

class ClientePremium extends Cliente {
    public ClientePremium(int tipo, double valor) {
        super(tipo, valor);
    }
    
    public double calcularDesconto() {
        return valor * 0.15;
    }
    
    public double valorFinal() {
        return this.valor - calcularDesconto();
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tipo_input;
        double valor_input;
        
        tipo_input = Integer.parseInt(teclado.nextLine());
        valor_input = Double.parseDouble(teclado.nextLine());
        
        if (tipo_input == 1) {
            ClienteRegular cliente = new ClienteRegular(tipo_input, valor_input);
            cliente.setValor(cliente.valorFinal());
            System.out.printf("%.2f\n", cliente.getValor());
        } else if (tipo_input == 2) {
            ClienteVIP cliente = new ClienteVIP(tipo_input, valor_input);
            cliente.setValor(cliente.valorFinal());
            System.out.printf("%.2f\n", cliente.getValor());
        } else if (tipo_input == 3) {
            ClientePremium cliente = new ClientePremium(tipo_input, valor_input);
            cliente.setValor(cliente.valorFinal());
            System.out.printf("%.2f\n", cliente.getValor());
        } else {
            System.out.println("INVÁLIDO");
        }
    
        teclado.close();
    }
}
 