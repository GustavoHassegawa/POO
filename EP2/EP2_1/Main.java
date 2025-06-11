import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Turma t = new Turma(s.nextLine(), s.nextLine());
        
        System.out.println(t.getInformacoes());
        
        s.close();
    }
}

class Turma {
    String codigo, sala;
    
    public Turma(String c, String s) {
        this.codigo = c;
        this.sala = s;
    }
    
    public String getInformacoes() {
        return "Código da turma: " + codigo + "; Sala/Lab.: " + sala;
    }
}
