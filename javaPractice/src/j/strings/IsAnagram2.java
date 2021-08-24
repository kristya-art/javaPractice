package j.strings;
/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * This code is the efficient way to solve a problem
 */
public class IsAnagram2 {

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

        System.out.println(isAnagram("dacc","ccac")+" f");

        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);

        }

        public static boolean isAnagram(String s, String t){
            int sl = s.length();
            int tl= t.length();

            if(sl<1||tl<1){return false;}


            if(sl!=tl){return false;}

            int temp = tl;

            StringBuilder tt = new StringBuilder(t);

            for(int e = 0; e<sl ;e++){
                temp = temp-1;
                for(int ee =0; ee<tl ;ee++){
                    if(s.charAt(e)==tt.charAt(ee)){
                        tt.deleteCharAt(ee);
                        tl=tl-1;
                        break;
                    }
                }
                if(temp!=tl){return false;}

            }
            if(tl==0){return true;}

            return false;

        }
    }


