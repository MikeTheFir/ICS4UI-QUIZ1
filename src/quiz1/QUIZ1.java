/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author pistm9061
 */
public class QUIZ1 {
    
    
    
    public String reverseString(String word){
        // if the word is less than one in length print out the word
        if (word.length() == 0 || word.length() == 1) {
            return word;
        }else{
            // print out the last letter first and remove it from the word length and repeat it until hte word is backwards
            return word.charAt(word.length() - 1) + reverseString(word.substring(1, word.length() - 1));
        }
    }
    // base case
        // return "true" if the length is less than or equal to one
       // !!!!!!if (s.length() == 0 || s.length() == 1) {!!!!!!
       //     !!!!!return true;!!!!
       // }
        // check if first character is the same as the last character
       // !!!!!!!!if (s.charAt(0) == s.charAt(s.length() - 1)) {!!!!!!
            // now check every character
         //  !!!!!!return isPalindrome(s.substring(1, s.length() - 1));!!!!!!
        //}
        // if there is no palindrome return "false"
       // return false;
  //  }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QUIZ1 test = new QUIZ1();
        
        String bound1 = test.reverseString("gang");
        System.out.println("gang becomes- " + bound1);
        String bound2 = test.reverseString("hello");
        System.out.println("hello becomes- " + bound2);
        String bound3 = test.reverseString("segway");
        System.out.println("segway becomes- " + bound3);
    }
}
