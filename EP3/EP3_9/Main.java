import java.util.*;

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int contar Descendentes() {
        return 0;
    }
}

class Pai extends Pessoa {
    private List<Pessoa> filhos;

    public Pai(String nome) {
        super(nome);
        this.filhos = new ArrayList<>();
    }

    public void addFilho(Pessoa filho) {
        filhos.add(filho);
    }

    @Override
    public int contarDescendentes() {
        int total = 0;
        for (Pessoa filho : filhos) {
            total += 1 + filho.contarDescendentes();
        }
        return total;
    }
}

class Filho extends Pessoa {
    public Filho(string nome) {
        super(nome);
    }
} 

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nPessoas, nFilhos;
        
    }
}