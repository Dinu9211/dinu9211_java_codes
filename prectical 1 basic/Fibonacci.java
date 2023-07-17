import java.util.*;

public class Fibonacci {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);{

            System.out.println("Enter a nummber to print Fibonacci series: ");
            int n = sc.nextInt();
            int f1 =0,next;
            int f2 = 1;

            System.out.print(f1 +" ");
            for(int i = 1; i < n; i++){
                System.out.print(f2+ " ");
                next = f1 + f2;
                f1 = f2;
                f2 = next;


            }


        }


    }

    
}
