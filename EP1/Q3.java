import java.util.Scanner;

class Q3 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        int[] v = new int[n];

        int i, j;

        for (i = 0; i < n; i++) {
            v[i] = leitor.nextInt();
        }
        
        for (j = 0; j < n - 1; j++) {
            for (i = 0; i < n - 1 - j; i++) {
                if (v[i] > v[i + 1]) {
                    int temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                }
            }
        }

        for (   i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }

        leitor.close();
    }
}