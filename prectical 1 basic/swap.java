import java.util.*;

public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any two different number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before Swap :-");
        System.out.println("First number is " + a);
        System.out.println("Second number is " + b);
        
        int c = a;
        a = b;
        b = c;
        
        System.out.println("After Swap:-");
        System.out.println("Frist number is " +a);
        System.out.println("Second number is " +b);

    }

}
