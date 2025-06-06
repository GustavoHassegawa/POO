import java.util.Scanner;

class Q1 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int C = teclado.nextInt();
        float F = C * 9/5 + 32;
        
        System.out.println(C+" graus Celsius corresponde a "+F+" graus Fahrenheit");
        
        teclado.close();
    }
}