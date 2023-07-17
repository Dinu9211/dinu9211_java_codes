import java.util.*;

public class prime_notprime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter a number to check prime or not prime: ");
            int a = sc.nextInt();
            int i;
            if (a==0 || a==1)
            System.out.println("Enter another number: ");

            for (i=2; i<a; i++)
            {
                if (a%i==0){
                System.out.println(a+" is not prime number. ");
                break;
                }
            }
            if (a==i) 
            System.out.println(a+" is prime number. ");

        }
    }
}
