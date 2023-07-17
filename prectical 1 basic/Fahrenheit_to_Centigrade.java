import java.util.*;

public class Fahrenheit_to_Centigrade {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit number to convert into celsius");
        float f = sc.nextFloat();

        float c = ((f-32)*5)/9;

        System.out.println("In celsius temperature is: \n" + c);

    }

}
