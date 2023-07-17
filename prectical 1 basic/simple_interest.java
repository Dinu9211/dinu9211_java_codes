import java.util.*;

public class simple_interest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter principal amount: ");
            int p = sc.nextInt();
            System.out.println("Enter Rate of interest (%): ");
            int r = sc.nextInt();
            System.out.println("Enter time of period in year: ");
            int t = sc.nextInt();
            
            float interest = (p*r*t)/100;

            System.out.println("Your Simple Interest is: "+ interest);


    }






}