import java.util.Scanner;

class Veiculo {
    private String placa;
    private int anoFabricacao;

    public Veiculo(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;    
    }

    public String getPlaca() {
        return placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double calcularIPVA() {
        return 0;
    }
}

class Carro extends Veiculo {
    private double valorMercado;

    public Carro(String placa, int anoFabricacao, double valorMercado) {
        super(placa, anoFabricacao);
        this.valorMercado = valorMercado;
    }

    @Override
    public double calcularIPVA() {
        if (2025 - getAnoFabricacao() > 20) {
            return 0;
        } else {
            return valorMercado * 0.025;
        }
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, int anoFabricacao, int cilindradas) {
        super(placa, anoFabricacao);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularIPVA() {
        if (2025 - getAnoFabricacao() > 15) {
            return 0;
        } else {
            return 50 + 0.10 * cilindradas;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anoFabri, nEntradas = Integer.parseInt(teclado.nextLine().trim());
        String[] entrada;
        String placa;
        Double ipva = 0.0;

        for (int i = 0; i < nEntradas; i++) {
            entrada = teclado.nextLine().trim().split(" "); 
            placa = entrada[1];
            anoFabri = Integer.parseInt(entrada[2]);

            if (entrada[0].equals("M")) {
                int cilindradas = Integer.parseInt(entrada[3]);
                Moto moto = new Moto(placa, anoFabri, cilindradas);
                
                ipva += moto.calcularIPVA();
            } else if (entrada[0].equals("C")) {
                double valorMercado = Double.parseDouble(entrada[3]);
                Carro carro = new Carro(placa, anoFabri, valorMercado);

                ipva += carro.calcularIPVA();
            } else {
                ipva += 0;
            }
        }

        System.out.printf("%.2f\n", ipva);
        teclado.close();
    }
}