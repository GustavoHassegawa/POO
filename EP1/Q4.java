import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {        
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int m = leitor.nextInt();
        int[][] matriz = new int[n][m];
        int[][] dilatada = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }
        leitor.close();

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                dilatada[i][j] = 0;
                if (matriz[i][j] == 1) {
                    for (int k = i - 1; k <= i + 1; k++) {
                         for (int l = i - 1; l <= i + 1; l++) {
                            dilatada[k][l] = 1;
                         }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j]);   
            }
            System.out.print("\n");
        }
    }
}