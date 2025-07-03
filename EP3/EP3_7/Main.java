import java.util.Scanner;

class Personagem {
    private String nome;
    private double vida;

    public Personagem(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;    
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void atacar(Personagem personagem) {

    }
}

class Guerreiro extends Personagem {
    private double forcaAtaque;

    public Guerreiro(String nome, double vida, double forcaAtaque) {
        super(nome, vida);
        this.forcaAtaque = forcaAtaque;
    }

    public void atacar(Personagem alvo) {
        alvo.setVida(alvo.getVida() - forcaAtaque);
        System.out.print(getNome() + " ataca " + alvo.getNome() + "! ");
        System.out.printf("%s tem %.1f de vida.\n", alvo.getNome(), alvo.getVida());
    }
}

class Mago extends Personagem {
    private double poderMagico;

    public Mago(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    public void atacar(Personagem alvo) {
        alvo.setVida(alvo.getVida() - 1.5 * poderMagico);
        System.out.print(getNome() + " ataca " + alvo.getNome() + "! ");
        System.out.printf("%s tem %.1f de vida.\n", alvo.getNome(), alvo.getVida());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] entrada;
        String classe, nome;
        double ataque, vida;
        Personagem[] personagems = new Personagem[2];
        
        for (int i = 0; i < 2; i++) {
            entrada = teclado.nextLine().trim().split(" ");
            classe = entrada[0];
            nome = entrada[1];
            vida = Double.parseDouble(entrada[2]);
            ataque = Double.parseDouble(entrada[3]);

            if (classe.equals("G")) {
                personagems[i] = new Guerreiro(nome, vida, ataque); 
            } else if (classe.equals("M")) {
                personagems[i] = new Mago(nome, vida, ataque);
            }
        }

        
        while (personagems[0].getVida() > 0 && personagems[1].getVida() > 0) {
            personagems[0].atacar(personagems[1]);
            
            if (personagems[1].getVida() <= 0) {
                System.out.println(personagems[1].getNome() + " foi derrotado!");
                break;
            }

            personagems[1].atacar(personagems[0]);

            if (personagems[0].getVida() <= 0) {
                System.out.println(personagems[0].getNome() + " foi derrotado!");
                break;
            }
        }
        System.out.println("Batalha encerrada!\n");
        teclado.close();
    }
}