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



public class Recursive_is_palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!";
        String i;
        char [] j;
        int stringSize;
        boolean f;
        //display string to check for palindrome
        System.out.println(s);
        //make all lowercase
        i=s.toLowerCase();
        //strip string of any punctuation marks and spaces
        //spaces
        i=i.replaceAll("\\s", "");
        //apostrophies
        i=i.replaceAll("\\'","");
        //periods
        i=i.replaceAll("\\.","");
        //double quotes
        i=i.replaceAll("\"","");
        //dashes go bye bye
        i=i.replaceAll("-", "");
        //exclamation points be gone!
        i=i.replaceAll("!", "");
        //smell ya later commas
        i=i.replaceAll(",", "");
        //print string's raw text without punctuation marks and spaces
        System.out.println(i);
        //turn string to char array
        j = i.toCharArray();
        //print char array
        for(int k=0;k<j.length;k++){
            System.out.print(j[k]);
        }
        //now that string is prepped, start isPalindrome (recursive)
        stringSize = j.length;
        f = isPalindrome(j,0,stringSize-1);
        
        System.out.println("\nIs "+s+" a palindrome? "+ f);
    }
    public static boolean isPalindrome(char[] word, int first, int last){
        if(first == last) return true;      //base case
                                            //recursive call
        else if(word[first] == word[last]) return isPalindrome(word,first+1,last-1);
                                            //not a palindrome
        else return false;
    }
}
