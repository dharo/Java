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
         // declare variables
        int x;
        int y;
        int gcd;
        int max;
        int low;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Calculate Greatest Common Divisor using\n"+
                "Euclidean Algorithm applied Recursively.\n");
        System.out.printf("Input a number: ");
        x=input.nextInt();
        System.out.printf("Input a number: ");
        y=input.nextInt();
        //get max/low values
        max = max(x,y);
        low = low(x,y);
        gcd = gcd(max,low);
        System.out.printf("The Greatest Common Divisor of %d and %d is: %d%n",max,low,gcd);
    }
    
    static int gcd(int x, int y){
        if((x%y)==0) return y;      //x%y == remainder
        else return gcd(y,(x%y));
    }
    
        static int max(int num1, int num2){
        int max = num1;
        if(num2>max) max=num2;
        return max;
    }
    
    static int low(int num1, int num2){
        int low = num1;
        if(num2<low) low=num2;
        return low;
    }
}
