/*
    David Haro
    October 8, 2015
    Java: 18A
    Assignment 5

    18.14 (Palindromes) A palindrome is a string that is spelled the same way forward and backward.
    Some examples of palindromes are “radar,” “able was i ere i saw elba” and (if spaces are ignored) “a
    man a plan a canal panama.” Write a recursive method testPalindrome that returns boolean value
    true if the string stored in the array is a palindrome and false otherwise. The method should ignore
    spaces and punctuation in the string.
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
        int stringSize;     //string size variable
        boolean f;          //this will hold the return value of the recursive method isPalindrome

        //prompt for input
        System.out.println("Input a string to check if it is a palindrome: ");
        s = input.nextLine();

        //display string to check for palindrome
        System.out.println("Your input was: "+s);
        //make all lowercase
        i = s.toLowerCase();
        //strip string of punctuation
        i = strip(i);
        
        //print string's raw text without punctuation marks and spaces
        System.out.println("Your input (when stripped of punctuation and spaces):");
        System.out.println(i);
        //turn string to char array
        j = i.toCharArray();
        //print char array
        //for(int k=0;k<j.length;k++){
        //    System.out.print(j[k]);
        //}
        //now that string is prepped, start isPalindrome (recursive)
        stringSize = j.length;
        f = isPalindrome(j,0,stringSize-1);
        
        System.out.println("\nIs \'"+s+"\' a palindrome? "+ f);
    }
    public static boolean isPalindrome(char[] word, int first, int last){
        if(first == last || first > last) return true;          //base case returns true
                                                                //when the indices meet in the middle
                                                                //or they crossed and started checking
                                                                //values already seen
        else if(word[first] == word[last])      //recursive call
            return isPalindrome(word,first+1,last-1);                    
        else return false;                      //if not a palindrome
    }
    public static String strip(String i){
        //strip string of any punctuation marks and spaces
        //using regular expressions
        i = i.replaceAll("\\s", "");      //spaces
        i = i.replaceAll("\\'","");       //apostrophies
        i = i.replaceAll("\\.","");       //periods
        i = i.replaceAll("\"","");        //double quotes
        i = i.replaceAll("-", "");        //dashes/hyphens
        i = i.replaceAll("!", "");        //exclamation points
        i = i.replaceAll(",", "");        //commas
        
        return i;
    }
}
