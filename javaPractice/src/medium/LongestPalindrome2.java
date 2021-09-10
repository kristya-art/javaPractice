package medium;

import java.lang.reflect.Array;

/**
 * Given a string s, return the longest palindromic substring in s
 */
public class LongestPalindrome2 {
    public static void main (String[]args){
        long startTime = System.nanoTime();
        //code here
        System.out.println(longestPalindrome("caacbob"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("peepitttia"));
        System.out.println(longestPalindrome("ab"));
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("abcde"));

        //code here
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);
    }
    public static String longestPalindrome(String s){
        int l = s.length();

        if(l==1){return s;}


        String temp ;
        int tempLength = 0;
        StringBuilder strBuild = new StringBuilder(s);
        if(l==2&&strBuild.charAt(0)!=strBuild.charAt(1)){temp= strBuild.substring(0,1);
        return temp;}
        int k=0;
        temp = strBuild.substring(0,1);

        for(int i = 0;i<l;i++){
            outerloop:
            for(int j = l-1;j>i;j--) {

                int start = i;
                int end = j;
                k = (j - i) + 1;

                while (strBuild.charAt(start) == strBuild.charAt(end)&&end>start) {
                    if (tempLength > k) {
                        break outerloop;
                    }
                    if ((end == start + 1 || end == start + 2) && k > tempLength) {
                        temp = strBuild.substring(i, j + 1);
                        tempLength = temp.length();
                        break outerloop;
                    } else {

                        start++;
                        end--;

                    }
                }

            }
       }
        return temp;
    }
}
