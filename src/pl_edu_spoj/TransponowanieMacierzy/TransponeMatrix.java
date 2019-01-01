//https://pl.spoj.com/problems/TRN/

package pl_edu_spoj.TransponowanieMacierzy;

import java.util.Random;
import java.util.Scanner;

public class TransponeMatrix {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int[][] matrix  = new int[m][n];
    int[][] transponedMatrix = new int[n][m];

    public void fillAndShowMatrix(){
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void transpone(){
        System.out.println();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                transponedMatrix[i][j] = matrix[j][i];
                System.out.print(transponedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
