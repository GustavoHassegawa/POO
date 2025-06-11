import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Usuario user = new Usuario(teclado.nextLine(), teclado.nextLine());
        
        System.out.println(user.exibir());
        
        teclado.close();
    }
}


class Usuario {
    public String nome;
    private String senha;
    
    public Usuario(String n, String s) {
        this.nome = n;
        this.senha = s;
    }
    
    public String exibir() {
        return "Usuário: " + nome;
    }
}