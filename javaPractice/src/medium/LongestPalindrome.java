package medium;


/**
 * Given a string s, return the longest palindromic substring in s
 */
public class LongestPalindrome {
    public static void main (String[]args){
      long startTime = System.nanoTime();
      //code here
        System.out.println(longestPalindrome("caacbob"));

      //code here
      long endTime = System.nanoTime();

      System.out.println(endTime - startTime);
    }
 public static String longestPalindrome(String s){
        int l = s.length();

        if(l==1){return s;}

        String temp = "";
        int tempLength = 0;
        StringBuilder strBuild = new StringBuilder(s);
        int k=0;
       // char[] ch = new char[s.length()];
     for(int i = 0;i<l;i++){
         for(int j = l-1;j>i;j--){
             int start = i;
             int end = j;
             int fixstart=i;
             int fixend=j;
             k=fixend-fixstart+1;

             while(strBuild.charAt(start)==strBuild.charAt(end)){
                 if((end==start+1||end==start+2)&&k>tempLength){
                     temp = strBuild.substring(fixstart,fixend+1);
                     tempLength = temp.length();
                     break;
                 }else {

                         start++;
                         end--;


                 }


             }
         }
     }
        return temp;
 }
}
