/*
    David Haro
    October 12, 2015
    Java: 18A
    Assignment 5

    18.14 (Palindromes) A palindrome is a string that is spelled the same way forward and backward.
    Some examples of palindromes are “radar,” “able was i ere i saw elba” and (if spaces are ignored) “a
    man a plan a canal panama.” Write a recursive method testPalindrome that returns boolean value
    true if the string stored in the array is a palindrome and false otherwise. The method should ignore
    spaces and punctuation in the string.

    **********This method manipulates string via char[] manipulation**********
    Tested with Palindrome Sentences from the following website: 
    https://www.cs.arizona.edu/icon/oddsends/palinsen.htm


 */
package recursive_is_palindrome;

import java.util.Scanner;



public class Recursive_is_palindrome {
    public static void main(String[] args) {
        //declare variables
        Scanner input = new Scanner(System.in);
        String s;// = "A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!";
        String i;           //create string to manipulate
        char [] j;          //create character array to send to isPalindrome
        int size;           //char[] size variable
        boolean f;          //this will hold the return value of the recursive method isPalindrome

        //prompt for input
        System.out.println("Input a string to check if it is a palindrome: ");
        s = input.nextLine();
        //display string to check for palindrome
        System.out.println("Your input was: "+s);
        
        //make all lowercase
        i = s.toLowerCase();
        j = strip_toChar(i);          //strip punctuation and convert string to char[]
        
        //now that string is prepped, start isPalindrome (recursive)
        size = j.length;              //but first lets get the length of char[]
        f = isPalindrome(j,0,size-1); //recursive palindrome check (T/F)
        
        //Print results
        System.out.println("\nIs \'"+s+"\' a palindrome? "+ f);
    }
    
    
    //recursive function to check for palindrome
    //returns true or false
    public static boolean isPalindrome(char[] word, int first, int last){
        if(first == last || first > last) return true;          //base case returns true
                                                                //when the indices meet in the middle
                                                                //or they crossed and started checking
                                                                //values already seen
        else if(word[first] == word[last])      //recursive call
            return isPalindrome(word,first+1,last-1);                    
        else return false;                      //if not a palindrome
    }
    
    //strips string of punctuation elements
    //and returns a character array
    public static char [] strip_toChar(String i){
        String x = "";
        char [] f;
        //manipulate string to remove punctuation and spaces
        //characters can be compared with ASCII
        //this method compares with range of LOWERCASE ASCII letters
        for(int k=0;k<i.length();k++){
            if(i.charAt(k) > 96 && i.charAt(k) < 123 || i.charAt(k)> 47 && i.charAt(k)<58)   //ASCII char 97 - 122
                x += i.charAt(k);                                                            //are lowercase alphabet
        }                                                                                    //48-57 are numbers 0-9
        //this is stripped string
        System.out.println("This is the stripped string: " + x);
        //might as well return a char[]
        f = x.toCharArray();
        return f;
    }
    
}
