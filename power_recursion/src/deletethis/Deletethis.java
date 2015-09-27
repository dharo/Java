/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletethis;

/**
 *
 * @author david
 */
public class Deletethis {
static int count=0;
static int rcount=0;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double pow, rpow;
        //pow= power(3,5);
        rpow=rpower(2,7);
        //System.out.println("Power result (looped): "+pow);
        System.out.println("Power result (recursive): "+rpow);
        
        System.out.println("Count 1: "+count);
        System.out.println("Count 2: "+rcount);
    }
    static double power(double b, double n){
        
        double result;
        if(n==0) return 1;
        else{
            result = b;
            for(int i=1;i<n;i++){
                result*=b;
            }
        }
        return result;
    }
    static double rpower(double b, double n){
        if(n==0) return 1;

        if(n%2==0){
            count++;
            return rpower(b*b,n/2);
        }                           //alternatively called^v
        rcount++;
        return b*rpower(b,(n-1));
    }
}

