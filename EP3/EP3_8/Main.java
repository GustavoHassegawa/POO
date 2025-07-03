import java.util.Scanner;

class Produto {
    private String nome;
    
    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class ProdutoEletronico extends Produto {
    private int mesesGarantia;

    public ProdutoEletronico(String nome, int mesesGarantia) {
        super(nome);
        this.mesesGarantia = mesesGarantia;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public static void ordenaProduto(ProdutoEletronico[] produtos) {
        for (int i = 0; i < produtos.length - 1; i++){
            for (int j = 0; j < produtos.length - 1 - i; j++) {
                if (produtos[j].getMesesGarantia() > produtos[j + 1].getMesesGarantia()) {
                    ProdutoEletronico temp = produtos[j];
                    produtos[j] = produtos[j + 1];
                    produtos[j + 1] = temp;
                }
            }
        }
    }
}

class ProdutoRoupa extends Produto {
    private String tamanho;

    public ProdutoRoupa(String nome, String tamanho) {
        super(nome);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getIntTamanho() {
        if (tamanho.equals("P")) {
            return 1;
        } else if (tamanho.equals("M")) {
            return 2;
        } else if (tamanho.equals("G")) {
            return 3;
        } else if (tamanho.equals("GG")) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void ordenaProduto(ProdutoRoupa[] produtos) {
        for (int i = 0; i < produtos.length - 1; i++){
            for (int j = 0; j < produtos.length - 1 - i; j++) {
                if (produtos[j].getIntTamanho() > produtos[j + 1].getIntTamanho()) {
                    ProdutoRoupa temp = produtos[j];
                    produtos[j] = produtos[j + 1];
                    produtos[j + 1] = temp;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tipo, numProdutos;
        String[] entradas;

        tipo = Integer.parseInt(teclado.nextLine().trim());
        numProdutos = Integer.parseInt(teclado.nextLine().trim());

        if (tipo == 1) {
            ProdutoEletronico[] produtos = new ProdutoEletronico[numProdutos];
            for (int i = 0; i < numProdutos; i++) {
                entradas = teclado.nextLine().trim().split(" ");
                produtos[i] = new ProdutoEletronico(entradas[0], Integer.parseInt(entradas[1]));
            }

            ProdutoEletronico.ordenaProduto(produtos);

            for (ProdutoEletronico produto : produtos) {
                System.out.println(produto.getNome());
            }
        } else if (tipo == 2) {
            ProdutoRoupa[] produtos = new ProdutoRoupa[numProdutos];
            for (int i = 0; i < numProdutos; i++) {
                entradas = teclado.nextLine().trim().split(" ");
                produtos[i] = new ProdutoRoupa(entradas[0],entradas[1]);
            }

            ProdutoRoupa.ordenaProduto(produtos);
        
            for (ProdutoRoupa produto : produtos) {
                System.out.println(produto.getNome());
            }
        } else {
            System.out.println("TIPO INVÁLIDO:");
        }

        teclado.close();
    }
}
