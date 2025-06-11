import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Livro book = new Livro(teclado.nextLine(), teclado.nextLine());
        
        System.out.println(book.getInfo());
        
        teclado.close();
    }
}


class Livro {
    String title, author;
    
    public Livro(String t, String a) {
        this.title = t;
        this.author = a;
    }
    
    public String getInfo() {
        return "Livro: " + title + ", Autor: " + author;
    }
    
}
