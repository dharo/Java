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
        int max;
        int low;
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Calculate Greatest Common Divisor using\n"+
                          "Euclidean Algorithm applied in a Loop.\n");
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
