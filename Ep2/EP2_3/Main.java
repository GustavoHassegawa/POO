import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno student = new Aluno();
        
        student.setName(teclado.nextLine());
        student.setRa(teclado.nextInt());
        
        System.out.println("Aluno: " + student.getName() + ", Matrícula: " + student.getRa());
        
        teclado.close();
    }
}

class Aluno {
    private String name;
    private int ra;
    
    public Aluno() {
        this.name = null;
        this.ra = 0;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setRa(int r) {
        ra = r;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRa() {
        return ra;
    }
}
