import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {        
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int m = leitor.nextInt();
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }
        leitor.close();
    }
}