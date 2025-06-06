import java.util.Scanner;

class Q2 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Avalie nosso serviço com uma nota de 1 a 5:");
        
        int nota = teclado.nextInt();
        
        while (nota > 5 || nota < 1) {
            System.out.println("O valor fornecido é inválido. Por favor, tente novamente:");
            nota = teclado.nextInt();
        }
        
        if (nota >= 3) {
            System.out.println("Obrigado pela avaliação, esperamos futuras visitas!");
        } else {
            System.out.println("Obrigado pela avaliação, tentaremos melhorar para sua próxima visita!");
        }
        
        teclado.close();
    }
}