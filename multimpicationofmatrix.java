import java.util.*;


public class multimpicationofmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of row for 1st matrix: ");
        int row = sc.nextInt();
        System.out.println("Enter no. of col for 1st matrix: ");
        int col = sc.nextInt();
        System.out.println("Enter elements of matrix");
        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter no. of row for 2nd matrix: ");
        int row2 = sc.nextInt();
        System.out.println("Enter no. of col for 2nd matrix: ");
        int col2 = sc.nextInt();
        System.out.println("Enter element of matrix");
        int b[][] = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                b[i][j] = sc.nextInt();
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        if (col != row2) {
            System.out.println("you are not eligible for next round");
        } else {
            int mtx3[][] = new int[row][col2];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++)
                     mtx3[i][j] += a[i][k] * b[k][j];
                     System.out.print(mtx3[i][j]+" ");
                    }
                    System.out.println();
                }
        }

    }

}
