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
static int count=0;         //for analyzing 
static int rcount=0;
static int mcount=0;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double pow, rpow,mpow;
        pow= power(2,5);
        rpow=rpower(2,5);
        mpow=mpower(2,60);
        System.out.println("Power result (looped): "+pow);
        System.out.println("Power result (recursive): "+rpow);
        System.out.println("Power result (recursive/no mod2): "+mpow);
        
        System.out.println("Loop Count: "+count);
        System.out.println("Recursive Call Count: "+rcount);
        System.out.println("Recursive (nomod2) Call Count: "+mcount);
    }
    static double power(double b, double n){
        double result;
        if(n==0) return 1;
        else{
            result = b;
            for(int i=1;i<n;i++){
                count++;
                result*=b;
            }
        }
        return result;
    }
    static double rpower(double b, double n){
        rcount++;           //measuring time complexity
        if(n==0){
            System.out.println("Unwrapping at count "+rcount); return 1;
        }
        if(n%2==0){
            //count++;                //how many times true
            return rpower(b*b,n/2);
        }                           //alternatively called^v
        //rcount++;                   //how many times true
        return b*rpower(b,(n-1));
    }
        static double mpower(double b, double n){
        mcount++;           //measuring time complexity
        if(n==0) return 1;
        return b*mpower(b,(n-1));
    }
}

