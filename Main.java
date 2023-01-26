import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        sumtablice(2, Stworz2Dtablice(2), Stworz2Dtablice(2));
    }

    public static int[][] sumtablice(int n, int[][] tablica1, int[][] tablica2) {
        int[][] sum = new int[n][n];
        for (int i = 0; i < tablica1.length; i++) {
            for (int j = 0; j < tablica1[0].length; j++) {
                sum[i][j] = tablica1[i][j] + tablica2[i][j];
            }
        }
        System.out.println("Suma: " + Arrays.deepToString(sum));
        return sum;
    }

    public static int[][] Stworz2Dtablice(int n) {
        Random rand = new Random();
        int[][] tablice = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tablice[i][j] = rand.nextInt(10);
            }
        }
        System.out.println("Tablica:" + Arrays.deepToString(tablice));
        return tablice;
    }
}
