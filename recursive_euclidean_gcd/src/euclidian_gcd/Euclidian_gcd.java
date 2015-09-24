/*
 * David Haro
 * September 23, 2015
 * GCD Euclidian Algorithm: Recursive
 */
package euclidian_gcd;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Euclidian_gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variables
        Scanner input = new Scanner(System.in);
        int low;
        int max;
        int gcd;
        
        System.out.println("Enter a number (High): ");
        max = input.nextInt();
        System.out.println("Enter a number (Low): ");
        low = input.nextInt();
        
        gcd = gcd(max,low);
        System.out.printf("The GCD of %d and %d is: %d %n", low, max, gcd);
    }
    
    static int gcd(int x, int y){
        if((x%y)==0) return y;      //x%y == remainder
        else return gcd(y,(x%y));
    }
    
}
