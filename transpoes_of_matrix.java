import java.util.*;

public class transpoes_of_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of row ");
        int row = sc.nextInt();

        System.out.println("Enter no. of col ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        System.out.println("Enter matrix elemnts: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                a[i][j] = sc.nextInt();
            
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int b[][] = new int[col][row];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j <b[0].length; j++)
                b[i][j] = a[j][i];
            
        }
        System.out.println();
        System.out.println("Transpose matrix is here: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
