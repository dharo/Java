/*
 * David Haro
 * September 11, 2015
 * Lab/Homework Java 18A
 * Dietel: Java How to Program: Late Object version Ed 10
 * Chapter 3 Exercise 3.37 part A
 */
package factorial;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        Scanner input = new Scanner(System.in);

        //double is used for n! for sake of large quantities that 
        //appear after 12 when using integer, and after 21 in float
        int num;
        double fact=1;
        
        System.out.println("This program will prompt for a number and then\n"
                +          "it will get that number's factorial value.");
        do{
            System.out.print("Enter a value: ");
            num = input.nextInt();
        }while(num<0);      //check for non-negative values
        
        if(num >= 1){
            for(int i = num;i>0;i--){
                fact*=i;
            }
        }
        //dont need an else, fact is initialized to 1
        //in order to perform n! calculation. 
        //prints 1 if input is 0
        System.out.println(num+"! = "+fact);
        
    }
    
}
