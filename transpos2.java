import java.util.*;

public class transpos2 {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter no. of row: ");
            int row = sc.nextInt();

            System.out.println("Enrer no. of cols: ");
            int col = sc.nextInt();

            int a[][] = new int[row][col];
            System.out.println("Enter element of matrix: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++)
                    a[i][j] = sc.nextInt();

            }
            System.out.println();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            if (row!=col){
                System.out.println("please Enter equal no. of row and col matrix");
            } 
            else{

                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < i; j++) {
                        int temp = a[i][j];
                        a[i][j] = a[j][i];
                        a[j][i] = temp;
                    }
    
                }
    
                System.out.println("Transpose matrix is: ");
                for(int i = 0; i < a.length; i++) {
                    for(int j = 0; j < a[0].length; j++) {
                        System.out.print(a[i][j]+ " ");
                    }
                    System.out.println();
                
                }
            } 


        }
    }
}
