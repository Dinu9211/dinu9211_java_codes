import java.util.*;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter a number to find there Factorial: ");
            int s = sc.nextInt();
            int fact = 1;
            for(int i = 1; i<=s; i++){
               fact = fact*i;

            } 
            System.out.println("Factorial of "+s+" is "+fact);
            



        }





    }




}
