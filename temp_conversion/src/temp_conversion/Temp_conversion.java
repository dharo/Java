/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp_conversion;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Temp_conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int temp;
        
        System.out.printf("This program will convert temperatures from\n"+
                          "Celsius to Fahrenheit or Fahrenheit to Celsius\n");
        do{
            System.out.printf("Press 1 or 2 \n\n");
            System.out.printf("1. Convert Fahrenheit to Celsius\n");
            System.out.printf("2. Convert Celsius to Fahrenheit\n");
            choice = input.nextInt(); 
        }while(choice > 2 || choice < 1);
        
        //enter  atemp to convert
        System.out.printf("Enter the temperature you would like to convert.\n");
        temp = input.nextInt();
        
        //send to appropriate methods
        if(choice==1){
            
        }
        if(choice==2){
            
        }
        
    }

    
    static float toCelsius(int fah){
        float celsius;
        
        
        return celsius;
    }
    
    static float toFahrenheit(int cel){
        float fahrenheit;
        
        return fahrenheit;
    }
}
