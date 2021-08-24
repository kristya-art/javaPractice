package j.strings;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * This code is the first try of the problem solving, but it's not efficient
 */
public class IsAnagram {
    public static void main(String[]args){
        System.out.println(isAnagram("okml","msko")+" f");
        System.out.println(isAnagram("ok","ko" )+ " t");
        System.out.println(isAnagram("o","o" )+ " t");
        System.out.println(isAnagram("ol","mko")+ " f");
        System.out.println(isAnagram("smlk","mkls")+ " t");
        System.out.println(isAnagram("un","mu")+ " f");
        System.out.println(isAnagram("un","mura")+ " f");
        System.out.println(isAnagram("","")+ " f");
        long startTime = System.nanoTime();
        System.out.println(isAnagram("anagram","nagaram")+ " t");
        System.out.println(isAnagram("moca","acon")+ " f");

        // System.out.println(isAnagram("aacc","ccac")+" f");

        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);

    }

    public static boolean isAnagram(String s, String t){
        int sl = s.length();
        int tl= t.length();

        if(sl<1||tl<1){return false;}


        if(sl!=tl){return false;}

        int count = 0;

        StringBuilder tt = new StringBuilder(t);

        for(int e = 0; e<sl ;e++){

            for(int ee =0; ee<tl ;ee++){
                if(s.charAt(e)==tt.charAt(ee)){
                    tt.setCharAt(ee,' ');
                    count=count+1;
                   break;
                }
                //else{count = 0;}

            }
           if(count==0){return false;}


        }
       if(count == sl){return true;}

       return false;

    }
}
