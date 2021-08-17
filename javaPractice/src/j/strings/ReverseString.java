package j.strings;

import java.util.Arrays;

/**
 * Write a function that reverses a string. The input string is given as an
 * array of characters s .
 */
public class ReverseString {
    public static void main(String[]args){

         char [] s = {'h','e','l','l','o'};

         reverseString(s);
         System.out.println(Arrays.toString(s));
         System.out.println(s[1]);

    }
    public static void reverseString(char [] s){
        int l = s.length;
        char temp;
        int j = l-1;

            {
                for(int k=0;k<l/2;k++){
                    temp = s[k];
                    s[k]=s[j];
                    s[j]=temp;
                    j--;
                }
            }

    }
}
