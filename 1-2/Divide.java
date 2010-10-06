//Dominik Feller (06-117-949)

// importing Scanner from the library java.util
import java.util.Scanner;

// defining the class
public class Divide
{
    public static void main (String[] args)
    {
        int a, b, modulo;
        double result;
        
        Scanner scan = new Scanner (System.in);

        // telling the user what this program is for

        System.out.println ("This program will show the quotient of \nfirst number squared and the second number \n");
        
        // asking the user for input
        System.out.print ("Enter the first integer number: ");
        a = scan.nextInt();

        System.out.print ("Enter the second integer number: ");
        b = scan.nextInt();

        // casting the variables to get floating point result

        result = (double) a * a / b;
        System.out.println ("Result in floating point numbers: " + result );
        
        modulo = a * a % b;
        System.out.println ("Integer result with shown rest: " + (a*a/b) + " rest " + modulo);        
    }

}
