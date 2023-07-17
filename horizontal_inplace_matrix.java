import java.util.*;

public class horizontal_inplace_matrix {
    public static void reverse(int b[]) {
        for (int i = 0, j = b.length - 1; i < j; i++, j--) {
            int temp = b[i];
            b[i] = b[j];
            b[j] = temp;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter equal no. of row and columan for matrix: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (row != col) {
                System.out.println("please Enter equal no. of row and column: ");
            
            } else {

                int a[][] = new int[row][col];
                System.out.println("Enter the element for matrix: ");
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[0].length; j++) {
                        a[i][j] = sc.nextInt();
                    }

                }
                System.out.println();

                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("After flip of matrix: ");
                for (int i = 0; i < a.length; i++) {
                    reverse(a[i]);
                    for (int j = 0; j < a[0].length; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

    }

}
