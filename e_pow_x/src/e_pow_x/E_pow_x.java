/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_pow_x;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class E_pow_x {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        Scanner input = new Scanner(System.in);

        //double is used for n! for sake of large quantities that 
        //appear after 12 when using integer, and after 21 in float
        int num=15;
        int x;                      //exponent for mathematical constant in 
        int pow;
                                    //formula e^x
        double fact=1;              //initialized to 0!
        double e = 1;               //started with (1/0!)
        
        System.out.println("This program will prompt for a number and then\n"
                +          "use that number to calculate the number of terms\n"
                +          "to provide mathematical constant e^x\n");
        
        do{
            System.out.print("Enter a value: ");
            x = input.nextInt();
            pow = x;
            if(x<0)
                System.out.println("Please input a positive value.");
        }while(x<0);      //check for non-negative values
       do{
            for(int i = num;i>0;i--){
                fact*=i;
            }                           //get first factorial first
            //System.out.println("Factorial for "+num+": "+fact);
        
            
            e+=(1/fact);                //add to formula; replace 1 with x to the power
                                        //of whatever the iteration of the loop is.
            
            num--;                      //countdown so next factorial is n-1
            fact = 1;                   //re-initialize so NEW factorial is calculated
            
       }while(num>0);                   //1/0! = 1, this value is already
                                        //added when e was initialized.
       e=Math.pow(e, x);
       System.out.println("e^x = "+e);
    }//exit main
}//exit package