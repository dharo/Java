/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop_euclidean_gcd;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Loop_euclidean_gcd {

    public static void main(String[] args) {
        // declare variables
        int x;
        int y;
        int gcd;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Input a number (high): ");
        x=input.nextInt();
        System.out.printf("Input a number (low): ");
        y=input.nextInt();
        
        gcd = gcd(x,y);
        System.out.printf("The Greatest Common Divisor of %d and %d is: %d%n",x,y,gcd);
        
    }
    static int gcd(int max, int low){
        int r;
        do{
            r=max%low;
            if(r==0) break;
            else{
                max=low;
                low=r;
            }
        }while(r!=0);
        return low;
    }
    
}
