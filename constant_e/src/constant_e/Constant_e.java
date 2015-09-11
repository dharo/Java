/*
 * David Haro
 * September 11, 2015
 * Lab/Homework Java 18A
 * Dietel: Java How to Program: Late Object version Ed 10
 * Chapter 3 Exercise 3.37 part B
 */
package constant_e;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Constant_e {

    public static void main(String[] args) {
        //declare variables
        Scanner input = new Scanner(System.in);

        //double is used for n! for sake of large quantities that 
        //appear after 12 when using integer, and after 21 in float
        int num;
        double fact=1;              //initialized to 0!
        double e = 1;               //started with (1/0!)
        
        System.out.println("This program will prompt for a number and then\n"
                +          "it will calculate a variant of Euler's number using"
                +          "following formula:"
                +          " e = 1 + (1/1!)+(1/2!)+(1/3!)...");
        do{
            System.out.print("Enter a value: ");
            num = input.nextInt();
            if(num<0)
                System.out.println("Please input a positive value.");
        }while(num<0);      //check for non-negative values
        
        
       do{
            for(int i = num;i>0;i--){
                fact*=i;
            }                           //get first factorial first
            System.out.println("Factorial for "+num+": "+fact);
            e+=(1/fact);                //add to formula
            num--;                      //countdown so next factorial is n-1
            fact = 1;                   //re-initialize so NEW factorial is calculated
       }while(num>0);                   //1/0! = 1, this value is already
                                        //added when e was initialized.
        
        
        System.out.println("e = "+e);
    
            
        
        

        
        
    }
    
}
